package id.bootcamp.java310.pos.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;
import id.bootcamp.java310.pos.repositories.VariantRepository;
import id.bootcamp.java310.pos.utils.Pagination;

@Service
public class VariantService {
	
	@Autowired
	private VariantRepository vr;
	
	//READ
	//Cara 1
//	public List<VariantDTO> getAllVariants() {
//		//SELECT * FROM VARIANT
//		List<VariantEntity> varRef = vr.findAll();
//		
//		List<VariantDTO> varList = new ArrayList<>();
//		
//		for (int i = 0; i < varRef.size(); i++) {
//			VariantDTO var = new VariantDTO();
//			
//			var.setId(varRef.get(i).getId());
//			var.setCategory_id(varRef.get(i).getCategoryId());
//			var.setCategory_name(varRef.get(i).getCategory().getName());
//			var.setInitial(varRef.get(i).getInitial());
//			var.setName(varRef.get(i).getName());
//			var.setActive(varRef.get(i).getActive());
//			
//			varList.add(var);
//		}
//		return varList;
//	}
	
	//Cara 4 Pagination - Step 4
	public Pagination<List<VariantDTO>> paginationVariant(String keyword, int limit, int page) {
		int totalData = vr.countTotalData(keyword);
		int offset = limit * (page - 1);
		
		List<VariantDTO> data = vr.paginationVariant(keyword, limit, offset);
		int itemPerPage = data.size();
		
		Pagination<List<VariantDTO>> pagination = new Pagination<>(totalData, page, itemPerPage, data);
		
		return pagination;
	}
	
	//Cara 4 Search - Step 4
	public List<VariantDTO> searchVariant(String keyword) {
		return vr.searchVariant(keyword);
	}
	
	//READ Cara 4 
	public List<VariantDTO> getAllVariants() {
		return vr.getAllVariants();
	}
	
	public List<VariantDTO> getVariantsByCategoryId(Long categoryId) {
		List<VariantEntity> catSumber = vr.getVariantsByCategoryId(categoryId);
		System.out.println(categoryId);

		List<VariantDTO> catList = new ArrayList<>();

		for (int i = 0; i < catSumber.size(); i++) {
			VariantDTO cat = new VariantDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setCategory_id(catSumber.get(i).getCategoryId());
			cat.setCategory_name(catSumber.get(i).getCategory().getName());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());

			catList.add(cat);
		}

		return catList;

	}
	
	//CREATE
	public Long createVariant(VariantDTO dto) throws Exception {
		//Validasi		
		Boolean isCategotyExists = vr.isCategoryExists(dto.getCategory_id());
		if (isCategotyExists == false) {
			throw new Exception("18-Gagal, category tidak ada!");
		}
		
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Gagal, initial sudah ada!");
		} 
		
		Boolean isNameExists = vr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Gagal, name sudah ada!");
		} 
		
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Gagal, Initial tidak boleh lebih dari 10 karakter");
		}
		
		if (dto.getName().length() > 50) {
			throw new Exception("14-Gagal, Name tidak boleh lebih dari 50 karakter");
		}
		
		if (dto.getCreate_by().length() > 50) {
			throw new Exception("17-Gagal, Create By tidak boleh lebih dari 50 karakter");
		}
		
		return vr.insert(dto, new Date());
	}
	
	//UPDATE
	public Long updateVariant(VariantDTO dto) throws Exception {
		//Validasi		
		Boolean isCategotyExists = vr.isCategoryExists(dto.getCategory_id());
		if (isCategotyExists == false) {
			throw new Exception("18-Gagal, category tidak ada!");
		}
		
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial(), dto.getCategory_id());
		if (isInitialExists == true) {
			throw new Exception("11-Gagal, initial sudah ada!");
		} 
		
		Boolean isNameExists = vr.isNameExists(dto.getName(), dto.getCategory_id());
		if (isNameExists == true) {
			throw new Exception("12-Gagal, name sudah ada!");
		} 
		
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Gagal, Initial tidak boleh lebih dari 10 karakter");
		}
		
		if (dto.getName().length() > 50) {
			throw new Exception("14-Gagal, Name tidak boleh lebih dari 50 karakter");
		}
		
		if (dto.getModify_by().length() > 50) {
			throw new Exception("17-Gagal, Modify By tidak boleh lebih dari 50 karakter");
		}
		
		return vr.update(dto, new Date());
	}
	
	//DELETE
	public Long deleteVariant(Long id) throws Exception {
		// Validasi Delete
		Boolean isVariantUsedByProduct = vr.isVariantUsedByProduct(id);
		if (isVariantUsedByProduct) {
			throw new Exception("15-Gagal, category dipakai, tidak dapat dihapus!");
		}
		return vr.delete(id);
	}
	
	//READ Category
//	public List<VariantDTO> getCategory() {
//		return vr.getCategory();
//	}
}
