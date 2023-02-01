package id.bootcamp.java310.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.dto.BrandDto;
import id.bootcamp.java310.repositories.BrandRepo;

@Service
public class BrandServices {

	@Autowired
	private BrandRepo brandRepo;
	
	// Read
	public List<BrandDto> getAllData(){
		return brandRepo.getAllBrands();
	}
}
