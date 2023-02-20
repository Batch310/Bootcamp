package id.bootcamp.java310.katalogmobil.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.katalogmobil.dto.BrandDTO;
import id.bootcamp.java310.katalogmobil.dto.TypeDTO;
import id.bootcamp.java310.katalogmobil.repositories.BrandRepository;

@Service
public class BrandService {

	@Autowired
	private BrandRepository br;
	
	//GET All
	public List<TypeDTO> getAll() {
		return br.getAll();
	}
	
	//GET All Brand
	public List<BrandDTO> getAllBrands() {
		return br.getAllBrands();
	}
	
}
