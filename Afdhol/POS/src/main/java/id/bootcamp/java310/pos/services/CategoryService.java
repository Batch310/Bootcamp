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

@Service
public class CategoryService {

	@Autowired // mempermudah koneksi ke repository
	private CategoryRepository cr; //membuat objek
	
	
	
	//READ
	//Cara 1 : memakai fungsi bawaan JPARespositry
	public List<CategoryDTO> getAllCategories(){
		
		//Cara 1
		//sama seperti select * from category
		//List<CategoryEntity> catSumber = cr.findAll();
		
		//Cara 2
		List<CategoryEntity> catSumber = cr.getAllNameAsc();

		
		//membuat List kosong CategoryDTO
		List<CategoryDTO> catList = new ArrayList<>();
		
		//melakuan perulangan sebanyak ukuran catSumber
		for (int i = 0; i <catSumber.size(); i++) {
			CategoryDTO cat = new CategoryDTO();
			
			cat.setId(catSumber.get(i).getId());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());
			
			//menambahkan data ini ke list yang maasih kosong
			catList.add(cat);
			
		}
		return catList;
	}
	
	//Cara 3
//	public List<CategoryDTO> getAll3(){
//		List<Tuple> listSumber = cr.getAll3(); //tampung Tuple
//		
//		//buat list kosong
//		List<CategoryDTO> listHasil = new ArrayList<>();
//		
//		for (int i = 0; i <listSumber.size(); i++) {
//			CategoryDTO cat = new CategoryDTO();
//			cat.setId(((BigInteger) listSumber.get(i).get("id")).longValue());
//			cat.setInitial((String)listSumber.get(i).get("initial"));
//			cat.setName((String)listSumber.get(i).get("name"));
//			cat.setActive((Boolean)listSumber.get(i).get("active"));
//			
//			//menambahkan data ini ke list yang maasih kosong
//			listHasil.add(cat);
//			
//		}
//		return listHasil;
//	}
	
//	//Cara 4
//	public List<CategoryDTO> getall4(){
//		//Cara 4
//		//return cr.getAll4();
//		
//		//Cara 5
//		return cr.getAll5();
//	}
	
	
	//CREATE 
	//Cara 1 - memakai fungsi bawaan JPARepository
	
	public Long insert1(CategoryDTO dto) throws Exception {
		
		Boolean isInitialExists = cr.isInitialExists(dto.getInitial());
		if (isInitialExists==true) {
			throw new Exception("11-initial sudah dipakai"); //
		}
		
		Boolean isNameExists = cr.isNameExists(dto.getName());
		if (isNameExists==true) {
			throw new Exception("12-nama sudah dipakai"); //
		}
		if (dto.getInitial().length()>10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!"); //
		}
		if (dto.getName().length()>50) {
			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter!"); //
		}
		if (dto.getCreate_by().length()>50) {
			throw new Exception("17-Create_by tidak boleh lebih dari 50 karakter!"); //
		}
		

		CategoryEntity hasil = new CategoryEntity();
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreateBy(dto.getCreate_by());
		hasil.setCreateDate(new Date());
		
		//insert Entity
		CategoryEntity done = cr.save(hasil);
		return done.getId();
		
	}
	
	public Long insert2(CategoryDTO dto) {
		return cr.insert2(dto, new Date());
	}
	
	//update
	public void update(CategoryDTO dto) throws Exception {
		
		Boolean isInitialExists = cr.isInitialExists(dto.getInitial(),dto.getId());
		if (isInitialExists==true) {
			throw new Exception("11-initial sudah dipakai"); //
		}
		
		Boolean isNameExists = cr.isNameExists(dto.getName(),dto.getId());
		if (isNameExists==true) {
			throw new Exception("12-nama sudah dipakai"); //
		}
		if (dto.getInitial().length()>10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter!"); //
		}
		if (dto.getName().length()>50) {
			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter!"); //
		}
		if (dto.getModify_by().length()>50) {
			throw new Exception("17-Create_by tidak boleh lebih dari 50 karakter!"); //
		}
		
		cr.update(dto, new Date());
	}
	
	//DELETE 
	public void delete(Long id) throws Exception {
		Boolean isCategoryUsedByVariant = cr.isCategoryUsedByVariant(id);
		
		if (isCategoryUsedByVariant) {
			throw new Exception("15-Category dipakai, tidak dapat dihapus");
		}
		//Delete Cara 1
	//	cr.deleteById(id);
		
		//Delete Cara 2
		cr.delete(id);
	}
	
	
	
	
	
	
	
	
}
