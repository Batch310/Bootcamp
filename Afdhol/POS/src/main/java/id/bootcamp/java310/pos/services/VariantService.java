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

	public List<VariantDTO> getAllVariants() {

		List<VariantEntity> varSumber = vr.findAll();

		List<VariantDTO> varList = new ArrayList<>();

		for (int i = 0; i < varSumber.size(); i++) {
			VariantDTO var = new VariantDTO();
			
			var.setId(varSumber.get(i).getId());
			var.setCategory_id(varSumber.get(i).getCategoryId());
			var.setCategory_name(varSumber.get(i).getCategory().getName()); //karena sudah dijoin pada category entity, maka menggunakan getname
			var.setName(varSumber.get(i).getName());
			var.setActive(varSumber.get(i).getActive());
			var.setCreate_by(varSumber.get(i).getCreateBy());
			var.setModify_by(varSumber.get(i).getModifyBy());
			var.setInitial(varSumber.get(i).getInitial());

			varList.add(var);
			
		}
		return varList;
	}
	
	//insert
	public Long insert(VariantDTO vro) throws Exception {
		Boolean isInitialExists = vr.isInitialExists(vro.getInitial());
		if (isInitialExists==true) {
			throw new Exception("11-initial sudah dipakai"); //
		}
		
		Boolean isNameExists = vr.isNameExists(vro.getName());
		if (isNameExists==true) {
			throw new Exception("12-nama sudah dipakai"); //
		}
		Boolean isIdNotExists = vr.isIdNotExists(vro.getCategory_id());
		if (isIdNotExists==false) {
			throw new Exception("18-Kategori tidak ada"); //
		}
		
		if (vro.getInitial().length()>10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!"); //
		}
		if (vro.getName().length()>50) {
			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter!"); //
		}
		if (vro.getCreate_by().length()>50) {
			throw new Exception("17-Create_by tidak boleh lebih dari 50 karakter!"); //
		}


		VariantEntity hasil = new VariantEntity();
		hasil.setInitial(vro.getInitial());
		hasil.setCategoryId(vro.getCategory_id());
		hasil.setName(vro.getName());
		hasil.setActive(vro.getActive());
		hasil.setCreateBy(vro.getCreate_by());
		hasil.setCreateDate(new Date());
		
		//insert Entity
		VariantEntity done = vr.save(hasil);
		return done.getId();
	}
	
	//update
	public void update(VariantDTO vro) throws Exception {
		
		Boolean isInitialExists = vr.isInitialExists(vro.getInitial(),vro.getId());
		if (isInitialExists==true) {
			throw new Exception("11-initial sudah dipakai"); //
		}
		
		Boolean isNameExists = vr.isNameExists(vro.getName(),vro.getId());
		if (isNameExists==true) {
			throw new Exception("12-nama sudah dipakai"); //
		}
		if (vro.getInitial().length()>10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!"); //
		}
		Boolean isIdNotExists = vr.isIdNotExists(vro.getCategory_id());
		if (isIdNotExists==false) {
			throw new Exception("18-Kategori tidak ada"); //
		}
		if (vro.getName().length()>50) {
			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter!"); //
		}
		if (vro.getModify_by().length()>50) {
			throw new Exception("17-Modify_by tidak boleh lebih dari 50 karakter!"); //
		}
		vr.update(vro, new Date());
		
		
	} 
	
	//delete
	public void delete(Long id) throws Exception {
		Boolean isCategoryUsedByVariant = vr.isCategoryUsedByVariant(id);
		
		if (isCategoryUsedByVariant) {
			throw new Exception("15-Variant dipakai, tidak dapat dihapus");
		}
		vr.delete(id);
	}
	
	
	//search
	public List<VariantDTO> search(String keyword){
		//Cara 4
		return vr.searchVariant(keyword);
	
	}
	
	//pagination
	public Pagination<List<VariantDTO>> pagination(String keyword, int limit, int page){
		int totalData = vr.countTotalData(keyword);
		
		int offset = limit*(page-1);
		List<VariantDTO> data = vr.paginationVariant(keyword,limit,offset);
		int itemPerPage = data.size();
		
		
		Pagination<List<VariantDTO>> pagination = new Pagination<List<VariantDTO>>(totalData, page, itemPerPage, data);
		
		return pagination;
	
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

}
