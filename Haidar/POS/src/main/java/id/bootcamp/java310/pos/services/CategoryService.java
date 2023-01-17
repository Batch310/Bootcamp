package id.bootcamp.java310.pos.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.repositories.CategoryRepository;
import id.bootcamp.java310.pos.utils.Pagination;

@Service
public class CategoryService {
	
	@Autowired //Mempermudah koneksi ke repository
	private CategoryRepository cr;
	
	//READ
	//Cara 1 - Memakai fungsi bawaan JPARepository
//	public List<CategoryDTO> getAllCategories() {
		//Cara 1
		//SELECT * FROM CATEGORY
//		List<CategoryEntity> catSumber = cr.findAll();
		
		//Cara 2 
		//Kelemahan:
		//1. Query tidak boleh ada join tabel
		//2. Select harus bintang
		//3. Tabel harus sesuai repository
//		List<CategoryEntity> catSumber = cr.getAllNameAsc();	
		
		//Buat List kosong CategoryDTO
//		List<CategoryDTO> catList = new ArrayList<>();
		
		//Melakukan perulangan sebanyak ukuran catSumber
//		for (int i = 0; i < catSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(catSumber.get(i).getId());
//			cat.setInitial(catSumber.get(i).getInitial());
//			cat.setName(catSumber.get(i).getName());
//			cat.setActive(catSumber.get(i).getActive());
//			
//			//Menambahkan data ke catList
//			catList.add(cat);
//		}		
//		return catList;
//	}
	
	//Cara 3
//	public List<CategoryDTO> getAll3() {
//		List<Tuple> catSumber = cr.getAll3();
//		
//		List<CategoryDTO> catList = new ArrayList<>();
//		
//		for (int i = 0; i < catSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(((BigInteger) catSumber.get(i).get("id")).longValue());
//			cat.setInitial(((String) catSumber.get(i).get("initial")));
//			cat.setName(((String) catSumber.get(i).get("name")));
//			cat.setActive(((Boolean) catSumber.get(i).get("active")));
//			
//			//Menambahkan data ke catList
//			catList.add(cat);
//		}		
//		return catList;
//	}
	
	//Cara 4 - Step 4
	public List<CategoryDTO> getAll4() {
		return cr.getAll4();
	}
	
	//Fungsi search - Step 4
	public List<CategoryDTO> searchCategory(String keyword) {
		return cr.searchCategory(keyword);
	}
	
	//Fungsi pagination - Step 4
	public Pagination<List<CategoryDTO>> paginationCategory(String keyword, int limit, int page) {
		int totalData = cr.countTotalData(keyword);
		int offset = limit * (page - 1);
		
		List<CategoryDTO> data = cr.paginationCategory(keyword, limit, offset);
		int itemPerPage = data.size();
		
		Pagination<List<CategoryDTO>> pagination = new Pagination<>(totalData, page, itemPerPage, data);
		
		return pagination;
	}
	
	//Cara 5 - Step 3
//	public List<CategoryDTO> getAll5() {
//		return cr.getAll5();
//	}
	
	//CREATE
	//Cara 1 - Menggunakan fungsi bawaan JPARepository - Step 1
//	public String insert1(CategoryDTO dto) {
//		//Mapping DTO ke Entity
//		CategoryEntity data = new CategoryEntity();
//		data.setInitial(dto.getInitial());
//		data.setName(dto.getName());
//		data.setActive(dto.getActive());
//		data.setCreateBy(dto.getCreate_by());
//		data.setCreateDate(new Date());
//		
//		//Insert Entity dengan Insert bawaan JPARepository
//		CategoryEntity hasil =  cr.save(data);
//		return "Data dengan id=" + hasil.getId() + " berhasil di input.";
//	}
	
	//Cara 2 - Step 2
	public Long insert2(CategoryDTO dto) throws Exception {
		//Validasi Insert
		Boolean isInitialExistsInsert = cr.isInitialExists(dto.getInitial());
		if (isInitialExistsInsert == true) {
			throw new Exception("11-Gagal, initial sudah ada!");
		} 
		
		Boolean isNameExistsInsert = cr.isNameExists(dto.getName());
		if (isNameExistsInsert == true) {
			throw new Exception("12-Gagal, name sudah ada!");
		} 
		
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Gagal, Initial tidak boleh lebih dari 10 karakter");
		}
		
		if (dto.getName().length() > 50) {
			throw new Exception("14-Gagal, Name tidak boleh lebih dari 50 karakter");
		}
		
		if (dto.getCreate_by().length() > 50) {
			throw new Exception("17-Gagal, Create By tidak boleh lebih dari 10 karakter");
		}
		
		return cr.insert2(dto, new Date());
	}
	
	//UPDATE
	//Cara 1 - Step 2
	public void update(CategoryDTO dto) throws Exception {
		//Validasi Update
		Boolean isInitialExists = cr.isInitialExists(dto.getInitial(), dto.getId());
		if (isInitialExists == true) {
			throw new Exception("11-Gagal, initial sudah ada!");
		} 
		
		Boolean isNameExists = cr.isNameExists(dto.getName(), dto.getId());
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
			throw new Exception("17-Gagal, Create By tidak boleh lebih dari 10 karakter");
		}
		
		cr.update(dto, new Date());
	}
	
	//DELETE
	//Cara 1 dan 2
	public void delete(Long id) throws Exception {
		//Validasi Delete
		Boolean isCategoryUsedByVariant = cr.isCategoryUsedByVariant(id);
		if (isCategoryUsedByVariant) {
			throw new Exception("15-Gagal, category dipakai, tidak dapat dihapus!");
		}
		//Cara 1 - Step 1
//		cr.deleteById(id);
		
		//Cara 2 - Step 2
		cr.delete(id);
	}
	
	
}
