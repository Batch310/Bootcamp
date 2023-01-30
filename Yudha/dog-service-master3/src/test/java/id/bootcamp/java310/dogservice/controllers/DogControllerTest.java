package id.bootcamp.java310.dogservice.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
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

import id.bootcamp.java310.dogservice.dto.BreedNameDTO;
import id.bootcamp.java310.dogservice.entities.Breeds;
import id.bootcamp.java310.dogservice.repositories.BreedRepository;
import id.bootcamp.java310.dogservice.repositories.DogImageRepository;
import id.bootcamp.java310.dogservice.repositories.SubBreedRepository;
import id.bootcamp.java310.dogservice.services.DogServices;
import id.bootcamp.java310.dogservice.services.MappingService;
import io.swagger.v3.oas.annotations.extensions.Extension;

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
		dogController = new DogController(breedRepository, subBreedRepository, dogImageRepository, mappingService, dogServices);
	}

	@Test
	void getAllBreedNameWithoutItsSubBreedTest() {
		// Data Dummy
		List<Breeds> breedList = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Breeds breed = new Breeds();
			breed.setId(i);
			breed.setName("Breed " + i);
			breedList.add(breed);
		}
		
		
		// Data Dummy 2
		BreedNameDTO breedNameDTO = new BreedNameDTO();
		Map<String, List<String>> map = new LinkedHashMap<>();
		for (int i = 0; i < 2; i++) {
			map.put("Breed "+i, null);
		}
		breedNameDTO.setMessage(map);
		breedNameDTO.setStatus("success");
		
		//Behaviour Mocking
		Mockito.when(breedRepository.findAll()).thenReturn(breedList);
		Mockito.when(mappingService.convertToAllBreedNameDTO_2(breedList)).thenReturn(breedNameDTO);
		
		//
		BreedNameDTO hasil = (BreedNameDTO) dogController.getAllBreedNameWithoutItsSubBreed();
		
		assert hasil != null;
		assert hasil.getStatus().equals("success");
		
	}

}
