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

	@Autowired //membuat koneksi ke repo
	private VariantRepository vr;
	
	//READ
	//Cara 1 - memakai fungsi bawaan JPARepository
	public List<VariantDTO> getAllVariant(){
		//select * from category
		List<VariantEntity> catSumber = vr.findAll();
		
		//bikin list kosong CategoryDTO
		List<VariantDTO> catList = new ArrayList<>();
		
		//melakukan perulangan sebanyak catSumber.size
		for (int i = 0; i < catSumber.size(); i++) {
			VariantDTO cat = new VariantDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setCategory_id(catSumber.get(i).getCategoryID());
			cat.setCategory_name(catSumber.get(i).getCategory().getName());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());
			
			//Menambahkan data ke list
			catList.add(cat);
		}
		return catList;
	}
	
	//CREATE
	public Long insert1(VariantDTO dto) {
		VariantEntity hasil = new VariantEntity();
		hasil.setCategoryId(dto.getCategory_id());
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreateBy(dto.getCreate_by());
		hasil.setCreateDate(new Date());
		
		//insert entity
		VariantEntity done = vr.save(hasil);
		return done.getId();
	
	}
	//UPDATE
	public void update(VariantDTO dto) {
		vr.update(dto, new Date());
	}
	//DELETE
	public void delete (Long id) {
		//cara 1
		//cr.deleteById(id);
		
		//cara 2
		vr.delete(id);
	}
}
