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
	
	//READ
	//Cara 1
	public List<VariantDTO> getAllVariants() {
		//SELECT * FROM VARIANT
		List<VariantEntity> varRef = vr.findAll();
		
		List<VariantDTO> varList = new ArrayList<>();
		
		for (int i = 0; i < varRef.size(); i++) {
			VariantDTO var = new VariantDTO();
			
			var.setId(varRef.get(i).getId());
			var.setCategory_id(varRef.get(i).getCategoryId());
			var.setCategory_name(varRef.get(i).getCategory().getName());
			var.setInitial(varRef.get(i).getInitial());
			var.setName(varRef.get(i).getName());
			var.setActive(varRef.get(i).getActive());
			
			varList.add(var);
		}
		return varList;
	}
	
	//CREATE
	public String createVariant(VariantDTO dto) {
		return "Data variant dengan id=" + vr.insert(dto, new Date()) + " berhasil diinput";
	}
	
	//UPDATE
	public String updateVariant(VariantDTO dto) {
		return "Data variant dengan id=" + vr.update(dto, new Date()) + " berhasil diubah";
	}
	
	//DELETE
	public String deleteVariant(Long id) {
		return "Data variant dengan id=" + vr.delete(id) + " berhasil dihapus";
	}
	
	//READ Category
	public List<VariantDTO> getCategory() {
		return vr.getCategory();
	}
}
