package id.bootcamp.java310.pos.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;
import id.bootcamp.java310.pos.repositories.VariantRepository;
import id.bootcamp.java310.pos.utils.Pagination;

@Service
public class VariantService {

	@Autowired
	private VariantRepository vr;

	public List<VariantDTO> getAllVariant() {
		List<VariantEntity> varSumber = vr.findAll();

		List<VariantDTO> varList = new ArrayList<>();

		for (int i = 0; i < varSumber.size(); i++) {
			VariantDTO var = new VariantDTO();
			var.setId(varSumber.get(i).getId());
			var.setCategory_id(varSumber.get(i).getCategroryId());
			var.setCategory_name(varSumber.get(i).getCategory().getName());
			var.setInitial(varSumber.get(i).getInitial());
			var.setName(varSumber.get(i).getName());
			var.setActive(varSumber.get(i).isActive());

			varList.add(var);
		}
		return varList;
	}

	// Search
	public List<VariantDTO> getSearch(@Param("keyword") String keyword){
		return vr.getSearch(keyword);
	}
	// Pagination
		public Pagination<List<VariantDTO>> getPagination(String keyword, int limit, int page) {
			int totalData = vr.countTotalData(keyword);	
						
			int offset = limit * (page - 1);
			List<VariantDTO> data = vr.getPagination(keyword, limit, offset);
			int itemPerPage = data.size();
			
			Pagination<List<VariantDTO>> pagination = new Pagination<>(totalData, page, itemPerPage, data);
			return pagination;
		}
	
	// Create
	public Long insert2(VariantDTO dto) throws Exception {
		boolean isInitialExists = vr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		boolean isNameExists = vr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai");
		}
		boolean isBentarTakCobaDulu = vr.isBentarTakCobaDulu(dto.getCategory_id());
		if (isBentarTakCobaDulu == false) {
			throw new Exception("18-Category tidak ada !");
		}
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
		}
		if (dto.getName().length() > 50) {
			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter");
		}
		if (dto.getCreate_by().length() > 50) {
			throw new Exception("17-Create By tidak boleh lebih dari 50 karakter");
		}

		return vr.insert2(dto, new Date());
	}

	// Update
	public void update(VariantDTO dto) throws Exception {
		boolean isInitialExists = vr.isInitialExists(dto.getInitial());
		if (isInitialExists == true) {
			throw new Exception("11-Initial sudah terpakai");
		}
		boolean isNameExists = vr.isNameExists(dto.getName());
		if (isNameExists == true) {
			throw new Exception("12-Name sudah terpakai");
		}
		boolean isBentarTakCobaDulu = vr.isBentarTakCobaDulu(dto.getCategory_id());
		if (isBentarTakCobaDulu == false) {
			throw new Exception("18-Category tidak ada !");
		}
		if (dto.getInitial().length() > 10) {
			throw new Exception("13-Initial tidak boleh lebih dari 10 karakter");
		}
		if (dto.getName().length() > 50) {
			throw new Exception("14-Nama tidak boleh lebih dari 50 karakter");
		}
		if (dto.getModify_by().length() > 50) {
			throw new Exception("16-Modify By tidak boleh lebih dari 50 karakter");
		}

		vr.update(dto, new Date());
	}

	// Delete
	public void delete(Long id) throws Exception {
		boolean isVariantUsedByProduct = vr.isVariantUsedByProduct(id);
		if(isVariantUsedByProduct) {
			throw new Exception("15-Variant dipakai, tidak dapat dihapus");
		}
		
		vr.delete(id);
	}

}
