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

	@Autowired
	private VariantRepository vr;

	public List<VariantDTO> getAllVariant() {
		List<VariantEntity> catSumber = vr.findAll();

		// select * from category
		List<VariantDTO> catList = new ArrayList<>();

		// melakukan perulangan sebanyak ukuran catSumber
		for (int i = 0; i < catSumber.size(); i++) {
			VariantDTO cat = new VariantDTO();
			cat.setId(catSumber.get(i).getId());
			cat.setCategory_id(catSumber.get(i).getCategoryId());
			cat.setCategory_name(catSumber.get(i).getCategory().getName());
			cat.setInitial(catSumber.get(i).getInitial());
			cat.setName(catSumber.get(i).getName());
			cat.setActive(catSumber.get(i).getActive());
			cat.setModify_by(catSumber.get(i).getModifyBy());

			catList.add(cat);
		}
		return catList;
	}

	public Long insertVariant(VariantDTO dto) {
		VariantEntity hasil = new VariantEntity();
		hasil.setCategoryId(dto.getCategory_id());
		hasil.setInitial(dto.getInitial());
		hasil.setName(dto.getName());
		hasil.setActive(dto.getActive());
		hasil.setCreateBy(dto.getCreate_by());
		hasil.setCreateDate(new Date());

		// insert bawaan JPARepository
		VariantEntity done = vr.save(hasil);
		return done.getId();

	}

}
