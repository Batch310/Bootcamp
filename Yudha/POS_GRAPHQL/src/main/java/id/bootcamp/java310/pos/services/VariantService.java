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
import id.bootcamp.java310.pos.utils.Pagination;

@Service
public class VariantService {
	
	@Autowired // Mempermudah koneksi ke repository
	private VariantRepository vr;
	
	// Read
	// Cara 1 : Memakai fungsi bawaan JPARepository
	public List<VariantDTO> getAll(){
		//Select * from category
		List<VariantEntity> varSumber = vr.findAll();
		
		// bikin list kosong categoryDTO
		List<VariantDTO> varList = new ArrayList<>();
		
		// Mapping dari CategoryEntity -> CategoryDTO
		// Melakukan perulangan sepanjang ukuran catSumber
		for (int i = 0; i < varSumber.size(); i++) {
			VariantDTO var = new VariantDTO();
			var.setId(varSumber.get(i).getId());
			var.setCategory_id(varSumber.get(i).getCategoryId());
			var.setCategory_name(varSumber.get(i).getCategory().getName());
			var.setInitial(varSumber.get(i).getInitial());
			var.setName(varSumber.get(i).getName());
			var.setActive(varSumber.get(i).getActive());
			
			//Menambahkan data ini ke list
			varList.add(var);
		}
		
		return varList;
	}
	
	
	// Create
	
	public Long insert2(VariantDTO dto) throws Exception {
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial());
		if(isInitialExists==true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		
		Boolean isNameExists = vr.isNameExists(dto.getName());
		if(isNameExists==true) {
			throw new Exception("12-Nama sudah terpakai");
		}
		if(dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
		}
		if(dto.getName().length() > 50) {
			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter");
		}
		if(dto.getCreate_by().length() > 50) {
			throw new Exception("17-Create By tidak boleh lebih dari 50 karakter");
		}
		Boolean isCategoryExists = vr.isCategoryUsedByVariant(dto.getCategory_id());
		if(isCategoryExists==false) {
			throw new Exception("18-Id category tidak ada");
		}
		return vr.insert2(dto, new Date());
	}
	
	// Update
	public void update(VariantDTO dto) throws Exception {
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial(),dto.getId());
		if(isInitialExists==true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		
		Boolean isNameExists = vr.isNameExists(dto.getName(),dto.getId());
		if(isNameExists==true) {
			throw new Exception("12-Nama sudah terpakai");
		}
		if(dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
		}
		if(dto.getName().length() > 50) {
			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter");
		}
		if(dto.getModify_by().length() > 50) {
			throw new Exception("17-Create By tidak boleh lebih dari 50 karakter");
		}
		Boolean isCategoryExists = vr.isCategoryUsedByVariant(dto.getCategory_id());
		if(isCategoryExists==false) {
			throw new Exception("18-Id category tidak ada");
		}
		vr.update(dto, new Date());
	}
	// Delete
	// Delete
		public void delete(Long id) throws Exception {
			Boolean isCategoryUsedByVariant = vr.isVariantUsedByProduct(id);
			if(isCategoryUsedByVariant) {
				throw new Exception("15-Variant dipakai, tidak dapat dihapus");
			}
			// cara 1
//			cr.deleteById(id);
			// cara 2
			vr.delete(id);
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

		public List<VariantDTO> search(String keyword){
			return vr.searchVariant(keyword);
			
		}
		
		public Pagination<List<VariantDTO>> pagination(String keyword, int limit, int page){
			int totalData = vr.countTotalData(keyword);
			int offset =  limit *(page-1);
			
			List<VariantDTO> data = vr.paginationVariant(keyword, limit, offset);
			int itemPerPage = data.size();
			Pagination<List<VariantDTO>> pagination = new Pagination<>(totalData,page,itemPerPage,data);
			
			return pagination;
			
		}
}
