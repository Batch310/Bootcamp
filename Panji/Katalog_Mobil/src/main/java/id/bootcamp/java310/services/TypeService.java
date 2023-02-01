package id.bootcamp.java310.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.dto.TypeDto;
import id.bootcamp.java310.repositories.TypeRepo;

@Service
public class TypeService {

	@Autowired
	private TypeRepo typeRepo;
	
	// Read 
	public List<TypeDto> getAllData(){
		return typeRepo.getAllType();
	}
}
