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
	
	//SEARCH
		public List<VariantDTO> searchVariant(String keyword) {
			return vr.searchVariant(keyword);
		}

	// CREATE
	public Long insertVar(VariantDTO dto) throws Exception {
		Boolean isInitialExists = vr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		Boolean isNameExists = vr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai");
		}
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
		}
		if (dto.getName().length() > 50) {
			throw new Exception("14-Name tidak boleh lebih dari 50 karakter");
		}
		if (dto.getCreate_by().length() > 50) {
			throw new Exception("17-Create By tidak boleh lebih dari 50 karakter");
		}
		Boolean isCategoryExists = vr.isCategoryExists(dto.getCategory_id());
		if (isCategoryExists == false) {
			throw new Exception("18-Category tidak ada");
		}
		return vr.insertVar(dto, new Date());
	}

	// UPDATE
	public void updateVar(VariantDTO dto) throws Exception {
		Boolean isInitialExists = vr.isInitialExists(dto.getId(), dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		Boolean isNameExists = vr.isNameExists(dto.getId(), dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai");
		}
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
		}
		if (dto.getName().length() > 50) {
			throw new Exception("14-Name tidak boleh lebih dari 50 karakter");
		}
		if (dto.getModify_by().length() > 50) {
			throw new Exception("16-Modify By tidak boleh lebih dari 50 karakter");
		}
		Boolean isCategoryExists = vr.isCategoryExists(dto.getCategory_id());
		if (isCategoryExists == false) {
			throw new Exception("18-Category tidak ada");
		}
		vr.updateVar(dto, new Date());
	}

	// DELETE
	public void deleteVar(Long id) throws Exception {
		Boolean isVariantIdUsedByProduct = vr.isVariantIdUsedByProduct(id);
		if (isVariantIdUsedByProduct) {
			throw new Exception("15-Variant dipakai, tidak dapat dihapus");
		}
		vr.delete(id);
	}

}
