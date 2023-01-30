package com.example.dogservice.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.dogservice.model.dto_for_crud.data_out.BreedNameDTO;
import com.example.dogservice.model.entity.Breeds;
import com.example.dogservice.repository.BreedRepository;
import com.example.dogservice.repository.DogImageRepository;
import com.example.dogservice.repository.SubBreedRepository;
import com.example.dogservice.service.DogServices;
import com.example.dogservice.service.MappingService;

@Extensions({ @ExtendWith(MockitoExtension.class) })
class DogControllerTest {

	@Mock
	private BreedRepository breedRepository;
	
	@Mock
	private SubBreedRepository subBreedRepository;
	
	@Mock
	private DogImageRepository dogImageRepository;
	
	@Mock
	private MappingService mappingService;
	
	@Mock
	private DogServices dogServices;
	
	private DogController dogController;
	

	@BeforeEach
	void setUp() throws Exception {
		dogController = new  DogController(breedRepository, 
				subBreedRepository, 
				dogImageRepository, 
				mappingService, 
				dogServices);
	}

	@Test
	void getAllBreedNameWithoutItsSubBreedTest() {
		//Data Dummy
		List<Breeds> breedList = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Breeds breed = new Breeds();
			breed.setId(i);
			breed.setName("Breed" + i);
			breedList.add(breed);
		}
	
		//Data Dummy 2
	     BreedNameDTO breedNameDTO = new BreedNameDTO();
	        Map<String,List<String>> map = 
	        		new LinkedHashMap<>();
	        for (int i = 0; i < 2; i++) {
				map.put("Breed" + i, null);
			}
	        breedNameDTO.setMessage(map);
	        breedNameDTO.setStatus("Succes");
	        
	        //Behaviour mocking
	        Mockito.when(breedRepository.findAll()).thenReturn(breedList);
	        Mockito.when(mappingService.convertToAllBreedNameDTO_2(breedList)).thenReturn(breedNameDTO);
	        
	        //Panggil docController
	        BreedNameDTO hasil =  (BreedNameDTO) dogController.getAllBreedNameWithoutItsSubBreed();
	        
	        assert hasil != null;
	        assert hasil.getStatus().equals("Succes");

	}

}
