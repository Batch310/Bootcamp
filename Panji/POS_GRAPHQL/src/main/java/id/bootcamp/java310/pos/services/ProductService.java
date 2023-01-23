package id.bootcamp.java310.pos.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.ProductDTO;
import id.bootcamp.java310.pos.entities.ProductEntity;
import id.bootcamp.java310.pos.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository pr;

	public List<ProductDTO> getAll() {
		List<ProductEntity> listSumber = pr.findAll();
		List<ProductDTO> listHasil = new ArrayList<>();

		for (ProductEntity pSumber : listSumber) {
			ProductDTO pHasil = new ProductDTO(pSumber.getVariantEntity().getCategory().getName(),
					pSumber.getVariantEntity().getName(), pSumber.getInitial(), pSumber.getName(),
					pSumber.getDescription(), pSumber.getPrice(), pSumber.getStock(), pSumber.getActive(),
					pSumber.getVariantEntity().getCategroryId(), pSumber.getVariantId(), pSumber.getId());

			listHasil.add(pHasil);
		}

		return listHasil;
	}

	public Long insertItem(ProductDTO dto) throws Exception {
		Boolean isInitialExists = pr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai!");
		}

		Boolean isNameExists = pr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai!");
		}

		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!");
		}

		if (dto.getName().length() > 50) {
			throw new Exception("14-Name tidak boleh lebih dari 50 karakter!");
		}

		if (dto.getCreate_by().length() > 50) {
			throw new Exception("17-Create By tidak boleh lebih dari 50 karakter");
		}

		Boolean isCategoryExist = pr.isVariantExists(dto.getVariant_id());
		if (isCategoryExist == false) {
			throw new Exception("18-Variant tidak ada");
		}

		ProductEntity pEntity = new ProductEntity(dto.getId(), dto.getVariant_id(), dto.getInitial(), dto.getName(),
				dto.getDescription(), dto.getPrice(), dto.getStock(), dto.getActive(), dto.getCreate_by(), new Date());

		ProductEntity hasil = pr.save(pEntity);
		return hasil.getId();
	}

	public void updateItem(ProductDTO dto) throws Exception {
		Boolean isInitialExists = pr.isInitialExists(dto.getInitial(), dto.getId());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai!");
		}

		Boolean isNameExists = pr.isNameExists(dto.getName(), dto.getId());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai!");
		}

		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!");
		}

		if (dto.getName().length() > 50) {
			throw new Exception("14-Name tidak boleh lebih dari 50 karakter!");
		}

		if (dto.getModify_by().length() > 50) {
			throw new Exception("16-Modify By tidak boleh lebih dari 50 karakter");
		}

		Boolean isCategoryExist = pr.isVariantExists(dto.getVariant_id());
		if (isCategoryExist == false) {
			throw new Exception("18-Variant tidak ada");
		}

		pr.updateItem(dto, new Date());
	}

	public void delete(Long id) throws Exception {
		Boolean isProductUsedByOrderDetail = pr.isProductUsedByOrderDetail(id);
		if (isProductUsedByOrderDetail) {
			throw new Exception("15-Product dipakai, tidak dapat dihapus");
		}

		pr.deleteById(id);
	}

	public List<ProductDTO> searchProduct(String keyword) {
		List<ProductEntity> listSumber = pr.searchProducts(keyword);
		List<ProductDTO> listHasil = new ArrayList<>();

		for (ProductEntity pSumber : listSumber) {
			ProductDTO pHasil = new ProductDTO(pSumber.getVariantEntity().getCategory().getName(),
					pSumber.getVariantEntity().getName(), pSumber.getInitial(), pSumber.getName(),
					pSumber.getDescription(), pSumber.getPrice(), pSumber.getStock(), pSumber.getActive(),
					pSumber.getVariantEntity().getCategroryId(), pSumber.getVariantId(), pSumber.getId());

			listHasil.add(pHasil);
		}

		return listHasil;
	}
}
