package id.bootcamp.java310.minipro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.minipro.dto.MedicalItemCategoryDto;
import id.bootcamp.java310.minipro.repositories.MedicalItemCategoryRepository;

@Service
public class MedicalItemCategoryServices {
	
	@Autowired
	private MedicalItemCategoryRepository medicalRepository;
	
	//GET API
	public List<MedicalItemCategoryDto> getAllName(){
		return medicalRepository.getAllName();
	}

}
