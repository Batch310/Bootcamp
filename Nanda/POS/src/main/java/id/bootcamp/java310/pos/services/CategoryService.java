package id.bootcamp.java310.pos.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.repositories.CategoryRepository;
import id.bootcamp.java310.pos.utils.Pagination;
import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class CategoryService {

	@Autowired // membuat koneksi ke repo
	private CategoryRepository cr;

	// READ
	// Cara 1 - memakai fungsi bawaan JPARepository
	public List<CategoryDTO> getAllCategories() {
		// select * from category
		// List<CategoryEntity> catSumber = cr.findAll();

		// Cara 2
		List<CategoryEntity> catSumber = cr.getAllNameAsc();

		// bikin list kosong CategoryDTO
		List<CategoryDTO> catList = new ArrayList<>();

		// melakukan perulangan sebanyak catSumber.size
		for (int i = 0; i < catSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());

			// Menambahkan data ke list
			catList.add(cat);
		}

		return catList;
	}

	// Cara 3
	public List<CategoryDTO> getAll3() {
		List<Tuple> listSumber = cr.getAll3();

		// bikin list kosong
		List<CategoryDTO> listHasil = new ArrayList<>();

		for (int i = 0; i < listSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(((BigInteger) listSumber.get(i).get("id")).longValue());
			cat.setInitial(((String) listSumber.get(i).get("initial")));
			cat.setName(((String) listSumber.get(i).get("name")));
			cat.setActive(((Boolean) listSumber.get(i).get("active")));

			// Menambahkan data ke list
			listHasil.add(cat);
		}
		return listHasil;
	}

	// cara 4 dan 5
	public List<CategoryDTO> getAll45() {
		// return cr.getAll4();
		return cr.getAll5();
	}

	// CREATE
	// Cara 1 - memakai fungsi bawaan JPARepository
	public Long insert1(CategoryDTO dto) throws Exception {
		// validasi

		Boolean isInitialExists = cr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Inisial sudah terpakai");
		}

		Boolean isNameExists = cr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Nama sudah terpakai");
		}

		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter !");
		}

		if (dto.getName().length() > 50) {
			throw new Exception("14-Name tidak boleh lebih dari 50 karakter !");
		}

		if (dto.getCreate_by().length() > 50) {
			throw new Exception("15-Create By tidak boleh lebih dari 50 karakter !");
		}

		CategoryEntity hasil = new CategoryEntity();
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreateBy(dto.getCreate_by());
		hasil.setCreateDate(new Date());

		// insert entity
		CategoryEntity done = cr.save(hasil);
		return done.getId();

	}

//	//Cara2
//	public Long insert2(CategoryDTO dto) {
//		return cr.insert2(dto, new Date());
//	}

	// UPDATE
	// cara1
	public void update(CategoryDTO dto) throws Exception {
		// validasi

		Boolean isInitialExists = cr.isInitialExists(dto.getInitial(),dto.getId());
		if (isInitialExists == true) {
			throw new Exception("11-Inisial sudah terpakai");
		}

		Boolean isNameExists = cr.isNameExists(dto.getName(), dto.getId());
		if (isNameExists == true) {
			throw new Exception("12-Nama sudah terpakai");
		}

		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter !");
		}

		if (dto.getName().length() > 50) {
			throw new Exception("14-Name tidak boleh lebih dari 50 karakter !");
		}

		if (dto.getModify_by().length() > 50) {
			throw new Exception("16-Create By tidak boleh lebih dari 50 karakter !");
		}
		cr.update(dto, new Date());
	}

	// DELETE
	public void delete(Long id) throws Exception {
		Boolean isCategoryUsedByVariant = cr.isCategoryUsedByVariant(id);
		if(isCategoryUsedByVariant) {
			throw new Exception("15-Category dipakai, tidak dapat dihapus");
		}
		// cara 1
		// cr.deleteById(id);

		// cara 2
		cr.deleted(id);
	}
	
	//SEARCH
	public List<CategoryDTO> search(String keyword) {
		// return cr.getAll4();
		return cr.searchCategory(keyword);
	}
	
	//PAGINATION
	public Pagination<List<CategoryDTO>> pagination(String keyword, int limit, int page) {
		int totalData = cr.countTotalData(keyword);
		
		// return cr.getAll4();
		int offset = limit * (page-1);
		List<CategoryDTO> data = cr.paginationCategory(keyword, limit, offset);
		int itemPerPage = data.size();
		
		Pagination<List<CategoryDTO>> pagination = new Pagination<>(totalData, page, itemPerPage, data);

		return pagination;
		
	}

}
