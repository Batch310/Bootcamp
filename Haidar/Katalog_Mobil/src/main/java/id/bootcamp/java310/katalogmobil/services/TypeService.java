package id.bootcamp.java310.katalogmobil.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.katalogmobil.dto.TypeDTO;
import id.bootcamp.java310.katalogmobil.repositories.TypeRepository;

@Service
public class TypeService {

	@Autowired
	private TypeRepository tr;

	public List<TypeDTO> getAllTypes() {
		// TODO Auto-generated method stub
		return tr.getAllTypes();
	}

	public List<TypeDTO> getTypeDetail(Long brandID, Long typeID) {
		// TODO Auto-generated method stub
		return tr.getTypeDetail(brandID, typeID);
	}
	
}
