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
import id.bootcamp.java310.pos.utils.Pagination;

@Service
public class CategoryService {

	@Autowired // Mempermudah koneksi ke repository
	private CategoryRepository cr;

	// READ
	// Cara 1 - Memakai fungsi bawaan JPARepository
	public List<CategoryDTO> getAllCategories() {
		// Cara 1
		// select * from category
		// List<CategoryEntity> catSumber = cr.findAll();

		// Cara 2
		List<CategoryEntity> catSumber = cr.getAllNameAsc();

		// Bikin List kosong CategoryDTO
		List<CategoryDTO> catList = new ArrayList<>();

		// Mapping dari CategoryEntity -> CategoryDTO
		// Melakukan perulangan sebanyak ukuran catSumber
		for (int i = 0; i < catSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());
			cat.setIs_delete(catSumber.get(i).getIs_delete());
		//	cat.setDeleted_by(null);

			// Menambahkan data cat ke list
			catList.add(cat);
		}

		return catList;
	}

	// Cara 3
//	public List<CategoryDTO> getAll3() {
//		List<Tuple> listSumber = cr.getAll3();
//
//		// Bikin List Kosong
//		List<CategoryDTO> listHasil = new ArrayList<>();
//
//		for (int i = 0; i < listSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(((BigInteger) listSumber.get(i).get("id")).longValue());
//			cat.setInitial((String)listSumber.get(i).get("initial"));
//			cat.setName((String)listSumber.get(i).get("name"));
//			cat.setActive((Boolean)listSumber.get(i).get("active"));
//
//			// Menambahkan data cat ke list
//			listHasil.add(cat);
//		}
//
//		return listHasil;
//	}

	// Cara 4 & 5
//	public List<CategoryDTO> getAll45(){
//		//Cara 4
////		return cr.getAll4();
//		
//		//Cara 5
//		return cr.getAll5();
//	}

	// CREATE
	// Cara 1 - Memakai fungsi bawaan JPARepository
	public Long insert1(CategoryDTO dto) throws Exception {
		// Validasi

		Boolean isInitialExists = cr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai!");
		}

		Boolean isNameExists = cr.isNameExists(dto.getName());
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

		// Mapping DTO ke Entity
		CategoryEntity hasil = new CategoryEntity();
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreated_by(Long.parseLong(dto.getCreate_by()));
		hasil.setCreated_on(new Date());

		// Insert Entity
		CategoryEntity done = cr.save(hasil);
		Long idCategoryBaru = done.getId();
		return idCategoryBaru;
	}

	// Cara 2
//	public Long insert2(CategoryDTO dto) {
//		return cr.insert2(dto, new Date());
//	}

	// UPDATE

	// Cara 1
	public void update(CategoryDTO dto) throws Exception {
		// Validasi
		Boolean isInitialExists = cr.isInitialExists(dto.getInitial(), dto.getId());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai!");
		}

		Boolean isNameExists = cr.isNameExists(dto.getName(), dto.getId());
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

		cr.update(dto, new Date());
	}

	// DELETE UPDATE
	public void deleteUpdate(CategoryDTO dto) throws Exception {
		
		cr.deleteUpdate(dto, new Date());
	}
	
	
	
//public void deleteUpdate(CategoryDTO dto) throws Exception {
//		
//		Boolean isInitialExists = cr.isInitialExists(dto.getInitial(),dto.getId());
//		if (isInitialExists==true) {
//			throw new Exception("11-initial sudah dipakai"); //
//		}
//		
//		Boolean isNameExists = cr.isNameExists(dto.getName(),dto.getId());
//		if (isNameExists==true) {
//			throw new Exception("12-nama sudah dipakai"); //
//		}
//		if (dto.getInitial().length()>10) {
//			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!"); //
//		}
//		if (dto.getName().length()>50) {
//			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter!"); //
//		}
//		if (dto.getModify_by().length()>50) {
//			throw new Exception("17-Create_by tidak boleh lebih dari 50 karakter!"); //
//		}
//		
//		cr.deleteUpdate(dto, new Date());
//	}

	// Search
	public List<CategoryDTO> search(String keyword) {
		return cr.searchCategory(keyword);
	}

	// Pagination
	public Pagination<List<CategoryDTO>> pagination(String keyword, int limit, int page) {
		int totalData = cr.countTotalData(keyword);
		
		int offset = limit * (page-1);
		List<CategoryDTO> data = cr.paginationCategory(keyword,limit,offset);
		int itemPerPage = data.size();
		
		
		Pagination<List<CategoryDTO>> pagination = 
				new Pagination<>(totalData, page, itemPerPage, data);
		 
		return pagination;
	}

}
