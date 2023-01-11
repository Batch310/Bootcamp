package id.bootcamp.java310.pos.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;
import id.bootcamp.java310.pos.repositories.VariantRepository;

@Service
public class VariantService {

	@Autowired
	private VariantRepository vr;
	
	// READ
	public List<VariantDTO> getAllVariant() {
		List<VariantEntity> varSumber = vr.findAll();
		
		List<VariantDTO> varList = new ArrayList<>();
		
		for (int i = 0; i < varSumber.size(); i++) {
			VariantDTO var = new VariantDTO();
			var.setId(varSumber.get(i).getId());
			var.setCategory_id(varSumber.get(i).getCategoryId());
			var.setCategory_name(varSumber.get(i).getCategory().getName());
			var.setInitial(varSumber.get(i).getInitial());
			var.setName(varSumber.get(i).getName());
			var.setActive(varSumber.get(i).getActive());
			
			varList.add(var);
		}
		return varList;
	}
	
	// CREATE
	public Long insertVar(VariantDTO dto) {
		return vr.insertVar(dto, new Date());
	}
	
	// UPDATE
	public void updateVar(VariantDTO dto) {
		vr.updateVar(dto, new Date());
	}
	
	// DELETE
	public void deleteVar(Long id) {
		vr.deleteVar(id);
	}
	
}
