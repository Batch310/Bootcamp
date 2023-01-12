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
	
	@Autowired //Mempermudah koneksi ke repository
	private CategoryRepository cr;
	
	//READ
	//Cara 1 - Memakai fungsi bawaan JPARepository
	public List<CategoryDTO> getAllCategories() {
		//Cara 1
		//SELECT * FROM CATEGORY
//		List<CategoryEntity> catSumber = cr.findAll();
		
		//Cara 2 
		//Kelemahan:
		//1. Query tidak boleh ada join tabel
		//2. Select harus bintang
		//3. Tabel harus sesuai repository
		List<CategoryEntity> catSumber = cr.getAllNameAsc();	
		
		//Buat List kosong CategoryDTO
		List<CategoryDTO> catList = new ArrayList<>();
		
		//Melakukan perulangan sebanyak ukuran catSumber
		for (int i = 0; i < catSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());
			
			//Menambahkan data ke catList
			catList.add(cat);
		}		
		return catList;
	}
	
	//Cara 3
	public List<CategoryDTO> getAll3() {
		List<Tuple> catSumber = cr.getAll3();
		
		List<CategoryDTO> catList = new ArrayList<>();
		
		for (int i = 0; i < catSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			cat.setId(((BigInteger) catSumber.get(i).get("id")).longValue());
			cat.setInitial(((String) catSumber.get(i).get("initial")));
			cat.setName(((String) catSumber.get(i).get("name")));
			cat.setActive(((Boolean) catSumber.get(i).get("active")));
			
			//Menambahkan data ke catList
			catList.add(cat);
		}		
		return catList;
	}
	
	//Cara 4 - Step 4
	public List<CategoryDTO> getAll4() {
		return cr.getAll4();
	}
	
	//Cara 5 - Step 3
	public List<CategoryDTO> getAll5() {
		return cr.getAll5();
	}
	
	//CREATE
	//Cara 1 - Menggunakan fungsi bawaan JPARepository - Step 1
	public String insert1(CategoryDTO dto) {
		//Mapping DTO ke Entity
		CategoryEntity data = new CategoryEntity();
		data.setInitial(dto.getInitial());
		data.setName(dto.getName());
		data.setActive(dto.getActive());
		data.setCreateBy(dto.getCreate_by());
		data.setCreateDate(new Date());
		
		//Insert Entity dengan Insert bawaan JPARepository
		CategoryEntity hasil =  cr.save(data);
		return "Data dengan id=" + hasil.getId() + " berhasil di input.";
	}
	
	//Cara 2 - Step 2
	public String insert2(CategoryDTO dto) {
		
		return "Data dengan initial=" + cr.insert2(dto, new Date()) + " berhasil di input.";
	}
	
	//UPDATE
	//Cara 1 - Step 2
	public void update(CategoryDTO dto) {
		cr.update(dto, new Date());
	}
	
	//DELETE
	//Cara 1 dan 2
	public void delete(Long id) {
		//Cara 1 - Step 1
//		cr.deleteById(id);
		
		//Cara 2 - Step 2
		cr.delete(id);
	}
}
