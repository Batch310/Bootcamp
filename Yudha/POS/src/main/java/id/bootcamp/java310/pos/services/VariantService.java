package id.bootcamp.java310.pos.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.entities.VariantEntity;
import id.bootcamp.java310.pos.repositories.VariantRepository;

@Service
public class VariantService {
	
	@Autowired // Mempermudah koneksi ke repository
	private VariantRepository vr;
	
	// Read
	// Cara 1 : Memakai fungsi bawaan JPARepository
	public List<VariantDTO> getAll(){
		//Select * from category
		List<VariantEntity> varSumber = vr.findAll();
		
		// bikin list kosong categoryDTO
		List<VariantDTO> varList = new ArrayList<>();
		
		// Mapping dari CategoryEntity -> CategoryDTO
		// Melakukan perulangan sepanjang ukuran catSumber
		for (int i = 0; i < varSumber.size(); i++) {
			VariantDTO var = new VariantDTO();
			var.setId(varSumber.get(i).getId());
			var.setCategory_id(varSumber.get(i).getCategoryId());
			var.setCategory_name(varSumber.get(i).getCategory().getName());
			var.setInitial(varSumber.get(i).getInitial());
			var.setName(varSumber.get(i).getName());
			var.setActive(varSumber.get(i).getActive());
			
			//Menambahkan data ini ke list
			varList.add(var);
		}
		
		return varList;
	}
	
	
	// Create
	
	public Long insert2(VariantDTO dto) {
		return vr.insert2(dto, new Date());
	}
	
	// Update
	
	// Delete

}
