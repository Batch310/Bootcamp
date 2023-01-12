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
import net.bytebuddy.asm.Advice.Return;

//Sisi keamanan
@Service
public class CategoryService {

	// konnektor
	@Autowired // Mmempermudah koneksi ke repository
	private CategoryRepository cr;

	// READ
	// Cara 1 - Memakai fungsi bawaan JPARepository
//	public List<CategoryDTO> getAllCategorys() {

		// Cara 1
		// select * from category
		// List(acuan/length bisa berubah) == array
		// List<CategoryEntity> catSumber = cr.findAll();

		// Cara 2
//		List<CategoryEntity> catSumber = cr.getAllNameAsc();

		// Bikin List kosong CategoryDTO
		// List kosong
//		List<CategoryDTO> catList = new ArrayList<>();
//
//		// MAPPING dari CategoryEntity -> Category DTO
//		// Melakukan perulangan sebanyak CategoryEntity => catSumber.size()
//		for (int i = 0; i < catSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//
//			// Proses MAPPING(Pemetaan)
//			cat.setId(catSumber.get(i).getId());
//			cat.setInitial(catSumber.get(i).getInitial());
//			cat.setName(catSumber.get(i).getName());
//			cat.setActive(catSumber.get(i).getActive());
//
//			// Menambah data ini ke list
//			catList.add(cat);
//
//		}
//
//		return catList;
//	}

	// Cara 3
//	public List<CategoryDTO> getAll3() {
//
//		List<Tuple> listSumber = cr.getAll3();
//
//		// Buat list kosong
//		List<CategoryDTO> listHasil = new ArrayList<>();
//
//		for (int i = 0; i < listSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(((BigInteger) listSumber.get(i).get("id")).longValue());
//			cat.setInitial((String) listSumber.get(i).get("initial"));
//			cat.setName((String) listSumber.get(i).get("name"));
//			cat.setActive((Boolean) listSumber.get(i).get("active"));
//
//			// Menambahkan data cat ke list
//			listHasil.add(cat);
//
//		}
//		return listHasil;
//	}
	
	//Cara 4 & 5 => Query lebih lengkap, dedifinisikan dulu
	public List<CategoryDTO> getAll45(){
		
		return cr.getAll4();
		//return cr.getAll5();
	}
	
	// CREATE
	// cara 1 => Memakai fungsi bawaan JPARepository
	public Long insert1(CategoryDTO dto) throws Exception {
		
		//Validasi
		
		Boolean isInitialExist =cr.isInitialExists(dto.getInitial());
		if(isInitialExist == true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		
		Boolean isNameExist =cr.isNameExists(dto.getName());
		if(isNameExist == true) {
			throw new Exception("12-Name sudah terpakai");
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
		
		
		
		
		//MAPPING DTO ke Entity
		CategoryEntity hasil = new CategoryEntity();
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreateBy(dto.getCreate_by());
		hasil.setCreateDate(new Date());
		
		//Insert bawan JPARepository
		CategoryEntity done = cr.save(hasil);
		return done.getId();
	}
	
	//Cara 2
//	public Long insert2(CategoryDTO dto) {
//		
//		return cr.insert2(dto, new Date());	
//	}
	

	// UPDATE
	//Cara ini saja
	public void update(CategoryDTO dto) throws Exception {
		
		//Validasi
		
		Boolean isInitialExist =cr.isInitialExists(dto.getInitial(),dto.getId());
		if(isInitialExist == true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		
		Boolean isNameExist =cr.isNameExists(dto.getName(),dto.getId());
		if(isNameExist == true) {
			throw new Exception("12-Name sudah terpakai");
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
		
		
		cr.update(dto, new Date());
		
		
	}
	
	// DELETE
	//Cara 1
	public void delete(Long id) throws Exception {
		
		Boolean isCategoryUseByVariant = cr.isCategoryUseByVariant(id);
		if(isCategoryUseByVariant==true) {
			throw new Exception("15-Category dipakai, tidak dapat dihapus");	
		}
		
		//Cara 1
//		cr.deleteById(id);
		
		//Cara 2
		cr.delete(id);
	}
	
	
	
	

}
