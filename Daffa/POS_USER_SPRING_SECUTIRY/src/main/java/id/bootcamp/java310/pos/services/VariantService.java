package id.bootcamp.java310.pos.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.entities.VariantEntity;
import id.bootcamp.java310.pos.repositories.VariantRepository;

@Service
public class VariantService {

	@Autowired
	private VariantRepository vr;

	public List<VariantDTO> getAll() {
		List<VariantEntity> catSumber = vr.findAll();

		List<VariantDTO> catList = new ArrayList<>();

		for (int i = 0; i < catSumber.size(); i++) {
			VariantDTO cat = new VariantDTO();			
			if (catSumber.get(i).getIs_delete() == false) {
				cat.setId(catSumber.get(i).getId());
				cat.setCategory_id(catSumber.get(i).getCategoryId());
				cat.setCategory_name(catSumber.get(i).getCategoryEntity().getName());
				cat.setInitial(catSumber.get(i).getInitial());
				cat.setName(catSumber.get(i).getName());
				cat.setActive(catSumber.get(i).getActive());
				catList.add(cat);
			}

			
		}

		return catList;

	}

	public Long insert(VariantDTO dto) throws Exception {
		// Validasi
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai!");
		}

		Boolean isNameExists = vr.isNameExists(dto.getName());
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

		Boolean isCategoryExist = vr.isCategoryExists(dto.getCategory_id());
		if (isCategoryExist == false) {
			throw new Exception("18-Variant tidak ada");
		}

		// Mapping DTO ke Entity
		VariantEntity hasil = new VariantEntity();
		hasil.setCategoryId(dto.getCategory_id());
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreated_by(Long.parseLong(dto.getCreate_by()));
		hasil.setCreated_on(new Date());
		hasil.setIs_delete(dto.getIs_deleted());

		// Insert Entity
		VariantEntity done = vr.save(hasil);
		return done.getId();
	}

	public void update(VariantDTO dto) throws Exception {
		// Validasi
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial(),dto.getId());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai!");
		}

		Boolean isNameExists = vr.isNameExists(dto.getName(),dto.getId());
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

		Boolean isCategoryExist = vr.isCategoryExists(dto.getCategory_id());
		if (isCategoryExist == false) {
			throw new Exception("18-Variant tidak ada");
		}

		vr.updateVariant(dto, new Date());
	}
	public void deleteBoongan(VariantDTO dto) throws Exception {
		// Validasi
		Boolean isVariantUsedByProduct = vr.isVariantUsedByProduct(dto.getId());
		if (isVariantUsedByProduct) {
			throw new Exception("15-Variant dipakai, tidak dapat dihapus");
		}

		vr.deleteBoonganEuy(dto, new Date());
	}

	public void delete(Long id) throws Exception {
		Boolean isVariantUsedByProduct = vr.isVariantUsedByProduct(id);
		if (isVariantUsedByProduct) {
			throw new Exception("15-Variant dipakai, tidak dapat dihapus");
		}
		
		vr.deleteById(id);
	}
	
	// DELETE BARU
	public void deleteTapiGakDelete(VariantDTO dto) throws Exception {
		// Validasi
		Boolean isVariantUsedByProduct = vr.isVariantUsedByProduct(dto.getId());
		if (isVariantUsedByProduct) {
			throw new Exception("15-Category dipakai, tidak dapat dihapus");
		}

		vr.deleteBoonganEuy(dto, new Date());
	}
	
	public List<VariantDTO> getVariantsByCategoryId(Long categoryId) {
		List<VariantEntity> catSumber = vr.getVariantsByCategoryId(categoryId);
		System.out.println(categoryId);

		List<VariantDTO> catList = new ArrayList<>();

		for (int i = 0; i < catSumber.size(); i++) {
			VariantDTO cat = new VariantDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setCategory_id(catSumber.get(i).getCategoryId());
			cat.setCategory_name(catSumber.get(i).getCategoryEntity().getName());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());

			catList.add(cat);
		}

		return catList;

	}
	
	public List<VariantDTO> search(String keyword) {
		List<VariantEntity> catSumber = vr.search(keyword);

		List<VariantDTO> catList = new ArrayList<>();

		for (int i = 0; i < catSumber.size(); i++) {
			VariantDTO cat = new VariantDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setCategory_id(catSumber.get(i).getCategoryId());
			cat.setCategory_name(catSumber.get(i).getCategoryEntity().getName());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());

			catList.add(cat);
		}

		return catList;
	}
}
