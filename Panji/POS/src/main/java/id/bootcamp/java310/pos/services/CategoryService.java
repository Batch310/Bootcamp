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
	// Cara 1 memakai fungsi bawaan JPA Repository
	public List<CategoryDTO> getAllCategories() {
		// Cara 1
		// List<CategoryEntity> catSumber = cr.findAll();

		// Cara 2
		List<CategoryEntity> catSumber = cr.getAllNameAsc();

		// Bikin list kosong CategoryDTO
		List<CategoryDTO> catList = new ArrayList<>();

		// Melakukan perulangan sebanyak ukuran catSumber
		for (int i = 0; i < catSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).isActive());

			// Menambahkan data cat ke list
			catList.add(cat);
		}
		return catList;
	}
	//cara 3
	public List<CategoryDTO> getAll3(){
		List<Tuple> listSumber = cr.getAll3();
		
		//List kosong
		List<CategoryDTO> listHasil = new ArrayList<>();
		
		for (int i = 0; i < listSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(((BigInteger)listSumber.get(i).get("id")).longValue());
			cat.setInitial((String)listSumber.get(i).get("initial"));
			cat.setName((String)listSumber.get(i).get("name"));
			cat.setActive((boolean)listSumber.get(i).get("active"));
			
			listHasil.add(cat);
		}
		return listHasil;
	}
	// Cara 4
	public List<CategoryDTO> getAll4(){
		return cr.getAll4();
	}
	// Cara 5
	public List<CategoryDTO> getAll5(){
		return cr.getAll5();
	}

	// Create
	// Cara 1 - memakai fungsi bawaan JPARepository
	public Long insert1(CategoryDTO dto) {
		// Mapping DTO ke Entity
		CategoryEntity hasil = new CategoryEntity();
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.isActive());
		hasil.setCreateBy(dto.getCreate_by());
		hasil.setCreateDate(new Date());
		
		//Insert Entity
		CategoryEntity done = cr.save(hasil);
		return done.getId();
	}
	// Cara 2
	public Long insert2(CategoryDTO dto) {
		return cr.insert2(dto, new Date());
	}

	// Update
	public void update(CategoryDTO dto) {
		cr.update(dto, new Date());
	}

	// Delete
	public void delete(Long id) {
		// Cara 1
		//cr.deleteById(id);
		
		// Cara 2
		cr.delete(id);
	}

}
