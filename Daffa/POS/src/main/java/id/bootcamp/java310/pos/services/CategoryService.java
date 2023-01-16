package id.bootcamp.java310.pos.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.repositories.CategoryRepository;
import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class CategoryService {

	@Autowired // Untuk mempermudah koneksi ke repository
	private CategoryRepository cr;

	// READ
	// Cara 1 - Memakai fungsi bawaan JPARepository
	public List<CategoryDTO> getAllCategories() {
		// Select * from category

		// Cara1
		// List<CategoryEntity> catSumber = cr.findAll();

		// Cara2
		List<CategoryEntity> catSumber = cr.getAllNameAsc();
		// Bikin List kosong CategoryDTO
		List<CategoryDTO> catList = new ArrayList<>();

		// Melakukan perulangan sebanyak ukuran catSumber
		for (int i = 0; i < catSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());

			// Menambahkan data ini ke list
			catList.add(cat);
		}
		return catList;

	}

	// Cara3
//	public List<CategoryDTO> getAllCategories3() {
//		List<Tuple> listSumber = cr.getAllCategories3();
//
//		// Bikin List kosong
//		List<CategoryDTO> listHasil = new ArrayList<>();
//
//		for (int i = 0; i < listSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(((BigInteger) listSumber.get(i).get("id")).longValue());
//			cat.setInitial((String) listSumber.get(i).get("initial"));
//			cat.setName((String) listSumber.get(i).get("name"));
//			cat.setActive((Boolean) listSumber.get(i).get("active"));
//			// Menambah data cat ke list
//			listHasil.add(cat);
//		}
//		return listHasil;
//	}
//
//	// Cara 4 & 5
//	public List<CategoryDTO> getAllCategories45() {
////		return cr.getAllCategories4();
//		return cr.getAllCategories5();
//	}

	// CREATE
	// Cara 1 - Memakai fungsi bawaan JPARepository
//	public Long insert1(CategoryDTO dto) {
//		CategoryEntity hasil = new CategoryEntity();
//		hasil.setInitial(dto.getInitial());
//		hasil.setName(dto.getName());
//		hasil.setActive(dto.getActive());
//		hasil.setCreateBy(dto.getCreate_by());
//		hasil.setCreateDate(new Date());
//
//		// Insert Bawaan JPARepository
//		CategoryEntity done = cr.save(hasil);
//		return done.getId();
//	}

	public Long insert2(CategoryDTO dto) throws Exception {

		Boolean isInitialExists = cr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		Boolean isNameExists = cr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai");
		}
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
		}
		if (dto.getName().length() > 50) {
			throw new Exception("14-Name tidak boleh lebih dari 50 karakter");
		}
		if (dto.getCreate_by().length() > 50) {
			throw new Exception("15-Create By tidak boleh lebih dari 50 karakter");
		}
		return cr.insert2(dto, new Date());
	}

	// UPDATE
	public void update(CategoryDTO dto) throws Exception {
		Boolean isInitialExists = cr.isInitialExists(dto.getId(), dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		Boolean isNameExists = cr.isNameExists(dto.getId(), dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai");
		}
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
		}
		if (dto.getName().length() > 50) {
			throw new Exception("14-Name tidak boleh lebih dari 50 karakter");
		}
		if (dto.getModify_by().length() > 50) {
			throw new Exception("15-Modify By tidak boleh lebih dari 50 karakter");
		}
		cr.update(dto, new Date());
	}

	// DELETE
	public void delete(Long id) throws Exception {
		Boolean isCategoryIdUsedByVariant = cr.isCategoryIdUsedByVariant(id);
		if (isCategoryIdUsedByVariant) {
			throw new Exception("16-Category dipakai, tidak dapat dihapus");
		}
		// Cara 1
//		cr.deleteById(id);

		// Cara 2
		else {
			cr.delete(id);
		}
	}

}
