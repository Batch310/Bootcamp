package id.bootcamp.java310.pos.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.repositories.CategoryRepository;

@Service
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryService {

	@Autowired // mempermudah koneksi ke repository
	private CategoryRepository cr;

	// READ
	// cara 1 - memakai fungsi bawaan JPARepository
	public List<CategoryDTO> getAllCategories() {
		// cara 1
		// select * from category
//		List<CategoryEntity> catSumber = cr.findAll();

		// cara 2
		List<CategoryEntity> catSumber = cr.getAllNameAsc();

		List<CategoryDTO> catList = new ArrayList<>();

		// melakukan perulangan sebanyak ukuran catSumber
		for (int i = 0; i < catSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());

			// menambahkan data ini ke list
			catList.add(cat);

		}

		return catList;
	}

	// cara 3
//	public List<CategoryDTO> getAll3() {
//		List<Tuple> listSumber = cr.getAll3();
//
//		// Bikin List Kosong
//		List<CategoryDTO> listHasil = new ArrayList<>();
//
//		for (int i = 0; i < listSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(((BigInteger) listSumber.get(i).get("id")).longValue());
//			cat.setInitial((String) listSumber.get(i).get("initial"));
//			cat.setName((String) listSumber.get(i).get("name"));
//			cat.setActive((Boolean) listSumber.get(i).get("active"));
//
//			// menambahkan data ini ke list
//			listHasil.add(cat);
//		}
//		return listHasil;
//	}

	// cara 4 & 5
//	public List<CategoryDTO> getAll45(){
//		// cara 4
//		//return cr.getAll4();
//		// cara 5
//		return cr.getAll5();
//	}

	// Create
	// cara 1 - memakai fungsi bawaan JPARepository
	public Long insert1(CategoryDTO dto) throws Exception {
		// Validasi
		Boolean isInitialExists = cr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai");
		}

		Boolean isNameExists = cr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai");
		}
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!");
		}
		if (dto.getName().length() > 50) {
			throw new Exception("14-Initial tidak boleh lebih dari 50 karakter!");
		}
		if (dto.getCreate_by().length() > 50) {
			throw new Exception("17-Create By tidak boleh lebih dari 50 karakter!");
		}

		CategoryEntity hasil = new CategoryEntity();
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreateBy(dto.getCreate_by());
		hasil.setCreateDate(new Date());

		// insert bawaan JPARepository
		CategoryEntity done = cr.save(hasil);
		return done.getId();
	}

//	public Long insert2(CategoryDTO dto) {
//		return cr.insert2(dto, new Date());
//	}

	// UPDATE

	// Cara 1
	public void update(CategoryDTO dto) throws Exception {
		Boolean isInitialExists = cr.isInitialExists(dto.getInitial(),dto.getId());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai");
		}

		Boolean isNameExists = cr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai");
		}
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!");
		}
		if (dto.getName().length() > 50) {
			throw new Exception("14-Initial tidak boleh lebih dari 10 karakter!");
		}
		if (dto.getModify_by().length() > 50) {
			throw new Exception("16-Create By tidak boleh lebih dari 50 karakter!");
		}

		cr.update(dto, new Date());
	}

	// DELETE
	public void delete(Long id) throws Exception {
		Boolean isCategoryUsedByVariant = cr.isCategoryUsedByVariant(id);
		if (isCategoryUsedByVariant) {
			throw new Exception("15-Category dipaki, tidak dapat dihapus");
		}
		// Cara 1
		// cr.deleteById(id);

		// Cara 2
		cr.delete(id);
	}

}