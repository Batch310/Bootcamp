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
import id.bootcamp.java310.pos.utills.Pagination;

@Service
public class VariantService {

	@Autowired
	private VariantRepository vr;

	//READ
	public List<VariantDTO> getAll(){
		
		List<VariantEntity> varSumber= vr.findAll();
	
		List<VariantDTO> varList = new ArrayList<>();
	

	for (int i = 0; i < varSumber.size(); i++) {
		VariantDTO var = new VariantDTO();
		

		var.setId(varSumber.get(i).getId());
		var.setInitial(varSumber.get(i).getInitial());
		var.setCategory_id(varSumber.get(i).getCategoryId());
		var.setCategory_name(varSumber.get(i).getCategory().getName());
		var.setInitial(varSumber.get(i).getInitial());
		var.setName(varSumber.get(i).getName());
		var.setActive(varSumber.get(i).getActive());
		
		varList.add(var);
		
	}
	
	return varList;
	
	}
	
	//READ
	public List<VariantDTO> getAllku(){
		return vr.getAllku();
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
	
	
	
	
	//SEARCH
	//Cara 4
	public List<VariantDTO> search(String keyword){
		return vr.searchVariant(keyword);
	}
	
	//PAGINATION
		//Cara 4
		public Pagination<List<VariantDTO>> pagination(String keyword, int limit, int page ){
			int totalData =vr.countTotalData(keyword);
			
			
			int offset = limit * (page -1 );
			List<VariantDTO> data= vr.paginationVariant(keyword, limit, offset);
			int itemPerPage = data.size();
			
			Pagination<List<VariantDTO>> pagination =
					new Pagination<>(totalData, page, itemPerPage, data);
	
			return pagination;
		}
		
	
	
	//CREATE
	public Long insertVar(VariantDTO dto) throws Exception {
		
		//Validasi
		
				Boolean isInitialExist =vr.isInitialExists(dto.getInitial());
				if(isInitialExist == true) {
					throw new Exception("11-Initial sudah terpakai");
				}
				
				Boolean isNameExist =vr.isNameExists(dto.getName());
				if(isNameExist == true) {
					throw new Exception("12-Name sudah terpakai");
				}
				
				Boolean isCategoryNotExist =vr.isCategoryNotExists(dto.getCategory_id());
				if(isCategoryNotExist == false) {
					throw new Exception("18-Category tidak ada!!");
				}
				
				
				if(dto.getInitial().length() > 10) {
					throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
				}
				
				if(dto.getName().length() > 50) {
					throw new Exception("14-Name tidak boleh lebih dari 50 karakter");
				}
				
				if(dto.getCreate_by().length() > 50) {
					throw new Exception("17-Creat_by tidak boleh lebih dari 50 karakter");
				}
				
		return vr.insertVar(dto, new Date());	
	}
	
	//UPDATE
	public void updateVar(VariantDTO dto) throws Exception {
		
		//Validasi
		
				Boolean isInitialExist =vr.isInitialExists(dto.getInitial(),dto.getId());
				if(isInitialExist == true) {
					throw new Exception("11-Initial sudah terpakai");
				}
				
				Boolean isNameExist =vr.isNameExists(dto.getName(),dto.getId());
				if(isNameExist == true) {
					throw new Exception("12-Name sudah terpakai");
				}
				
				Boolean isCategoryNotExist =vr.isCategoryNotExists(dto.getCategory_id());
				if(isCategoryNotExist == false) {
					throw new Exception("18-Category tidak ada!!");
				}
				
				if(dto.getInitial().length() > 10) {
					throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
				}
				
				if(dto.getName().length() > 50) {
					throw new Exception("14-Name tidak boleh lebih dari 50 karakter");
				}
					
				if(dto.getModify_by().length() > 50) {
					throw new Exception("18-Modify_by tidak boleh lebih dari 50 karakter");
				}
				
		vr.updateVar(dto, new Date());
	}
	
	//DELETE
	public void deleteVar(Long id) throws Exception {
		
		Boolean isCategoryUseByVariant = vr.isVariantUseByProduct(id);
		if(isCategoryUseByVariant==true) {
			throw new Exception("15-Variant dipakai, tidak dapat dihapus");	
		}
		
		
		
		vr.deleteVar(id);
	}
	
	
	

}
