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

@Service
public class VariantService {

	@Autowired // membuat koneksi ke repo
	private VariantRepository vr;

	// READ
	// Cara 1 - memakai fungsi bawaan JPARepository
	public List<VariantDTO> getAllVariant() {
		// select * from category
		List<VariantEntity> catSumber = vr.findAll();

		// bikin list kosong CategoryDTO
		List<VariantDTO> catList = new ArrayList<>();

		// melakukan perulangan sebanyak catSumber.size
		for (int i = 0; i < catSumber.size(); i++) {
			VariantDTO cat = new VariantDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setCategory_id(catSumber.get(i).getCategoryID());
			cat.setCategory_name(catSumber.get(i).getCategory().getName());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());

			// Menambahkan data ke list
			catList.add(cat);
		}
		return catList;
	}

	// CREATE
	public Long insert1(VariantDTO dto) throws Exception {
		// Validasi
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Inisial sudah terpakai");
		}

		Boolean isNameExists = vr.isNameExists(dto.getName());
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
		Boolean isCategoryExists = vr.isCategoryExists(dto.getCategory_id());
		if (isCategoryExists == false) {
			throw new Exception("18-Category Tidak Ada");
		}

		VariantEntity hasil = new VariantEntity();
		hasil.setCategoryId(dto.getCategory_id());
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreateBy(dto.getCreate_by());
		hasil.setCreateDate(new Date());

		// insert entity
		VariantEntity done = vr.save(hasil);
		return done.getId();

	}

	// UPDATE
	public void update(VariantDTO dto) throws Exception {
		// Validasi
		Boolean isCategoryExists = vr.isCategoryExists(dto.getCategory_id());
		if (isCategoryExists == false) {
			throw new Exception("18-Category Tidak Ada");
		}
		
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial(), dto.getCategory_id());
		if (isInitialExists == true) {
			throw new Exception("11-Inisial sudah terpakai");
		}

		Boolean isNameExists = vr.isNameExists(dto.getName(), dto.getCategory_id());
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
			throw new Exception("15-Create By tidak boleh lebih dari 50 karakter !");
		}
		

		vr.update(dto, new Date());
	}

	// DELETE
	public void delete(Long id) throws Exception {
		Boolean isVariantExists = vr.isVariantExists(id);
		if (isVariantExists) {
			throw new Exception("15-Variant dipakai, tidak dapat dihapus");
		}
		// cara 1
		// cr.deleteById(id);

		// cara 2
		vr.delete(id);
	}

	// CREATE
}
