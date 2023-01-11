package id.bootcamp.java310.pos.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.repositories.CategoryRepository;

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
	//Cara3
	public List<CategoryDTO> getAllCategories3() {
		List<Tuple> listSumber = cr.getAllCategories3();
		
		//Bikin List kosong
		List<CategoryDTO> listHasil = new ArrayList<>();
		
		for (int i = 0; i < listSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(((BigInteger)listSumber.get(i).get("id")).longValue());
			cat.setInitial((String)listSumber.get(i).get("initial"));
			cat.setName((String)listSumber.get(i).get("name"));
			cat.setActive((Boolean)listSumber.get(i).get("active"));
			//Menambah data cat ke list
			listHasil.add(cat);
		}
		return listHasil;
	}
	
	// Cara4
	public List<CategoryDTO> getAllCategories4(){
		return cr.getAllCategories4();
	}
}
