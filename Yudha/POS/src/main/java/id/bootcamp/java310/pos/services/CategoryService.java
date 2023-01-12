package id.bootcamp.java310.pos.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired // Mempermudah koneksi ke repository
	private CategoryRepository cr;
	
	// Read
	// Cara 1 : Memakai fungsi bawaan JPARepository
//	public List<CategoryDTO> getAllCategories(){
//		//Select * from category
//		//Cara 1
////		List<CategoryEntity> catSumber = cr.findAll();
//		// Cara 2
//		List<CategoryEntity> catSumber = cr.getAllNameAsc(); 
//		// bikin list kosong categoryDTO
//		List<CategoryDTO> catList = new ArrayList<>();
//		
//		// Mapping dari CategoryEntity -> CategoryDTO
//		// Melakukan perulangan sepanjang ukuran catSumber
//		for (int i = 0; i < catSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(catSumber.get(i).getId());
//			cat.setInitial(catSumber.get(i).getInitial());
//			cat.setName(catSumber.get(i).getName());
//			cat.setActive(catSumber.get(i).getActive());
//			
//			//Menambahkan data ini ke list
//			catList.add(cat);
//		}
//		
//		return catList;
//	}
	// cara 3
//	public List<CategoryDTO> getAll3(){
//		List<Tuple> listSumber = cr.getAll3();
//		
//		// bikin list kosong
//		List<CategoryDTO> listHasil = new ArrayList<>();
//		
//		for (int i = 0; i < listSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(((BigInteger)listSumber.get(i).get("id")).longValue());
//			cat.setInitial((String)listSumber.get(i).get("initial"));
//			cat.setName((String)listSumber.get(i).get("name"));
//			cat.setActive((Boolean)listSumber.get(i).get("active"));
//			listHasil.add(cat);
//		}
//		
//		return listHasil;
//	}
	
	// cara 4 - Query Lebih Lengkap, Definisikan Dulu
	public List<CategoryDTO> getAll4(){
		//return cr.getAll4();
		return cr.getAll5();
	}
	
	// Create
	// Cara 1 - Memakai Fungsi bawaan JPARepository
//	public Long insert1(CategoryDTO dto) {
//		CategoryEntity hasil = new CategoryEntity();
//		hasil.setInitial(dto.getInitial());
//		hasil.setName(dto.getName());
//		hasil.setActive(dto.getActive());
//		hasil.setCreateBy(dto.getCreate_by());
//		hasil.setCreateDate(new Date());
//		
//		//Insert Bawaan JPARepository
//		CategoryEntity done = cr.save(hasil);
//		return done.getId();
//	}
	public Long insert2(CategoryDTO dto) throws Exception {
		Boolean isInitialExists = cr.isInitialExists(dto.getInitial());
		if(isInitialExists==true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		
		Boolean isNameExists = cr.isNameExists(dto.getName());
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
		
		return cr.insert2(dto, new Date());
	}
	
	// Update
	public void update(CategoryDTO dto) throws Exception {
		Boolean isInitialExists = cr.isInitialExists(dto.getInitial(),dto.getId());
		if(isInitialExists==true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		
		Boolean isNameExists = cr.isNameExists(dto.getName(),dto.getId());
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
		
		cr.update(dto, new Date());
	}
	// Delete
	public void delete(Long id) throws Exception {
		Boolean isCategoryUsedByVariant = cr.isCategoryUsedByVariant(id);
		if(isCategoryUsedByVariant) {
			throw new Exception("15-Category dipakai, tidak dapat dihapus");
		}
		
		// cara 1
//		cr.deleteById(id);
		// cara 2
		cr.delete(id);
	}
	
}
