package com.example.dogservice.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.test.web.servlet.MockMvc;

import com.example.dogservice.model.dto_crud.data_out.BreedNameDTO;
import com.example.dogservice.model.entity.Breeds;
import com.example.dogservice.repository.BreedRepository;
import com.example.dogservice.repository.DogImageRepository;
import com.example.dogservice.repository.SubBreedRepository;
import com.example.dogservice.service.DogServices;
import com.example.dogservice.service.MappingService;
import com.example.dogservice.service.MigrateDataFromDogAPI;



@WebMvcTest
class DogControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private BreedRepository breedRepository;

	@MockBean
	private SubBreedRepository subBreedRepository;

	@MockBean
	private DogImageRepository dogImageRepository;

	@MockBean
	private MappingService mappingService;

	@MockBean
	private DogServices dogServices;
	
	@MockBean
	private MigrateDataFromDogAPI migrateDataFromDogAPI;
	
	@MockBean
	private RestTemplateBuilder restTemplateBuilder;

	private DogController dogController;

	@BeforeEach
	void setUp() throws Exception {
		dogController = new DogController(breedRepository, subBreedRepository, dogImageRepository, mappingService,
				dogServices);
	}

	@Test
	void getAllBreedNameWithoutItsSubBreedTest() throws Exception {
		// Buat Data Dummy Sebelum
		List<Breeds> breedList = new ArrayList<>();
		for (int i = 1; i <= 2; i++) {
			Breeds breed = new Breeds();
			breed.setId(i);
			breed.setName("Breed " + i);
			breed.setSubBreeds(null);
			breedList.add(breed);
		}

		// Buat Data Dummy Sesudah
		BreedNameDTO breedNameDTO = new BreedNameDTO();
		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		for (int i = 1; i <= 2; i++) {
			map.put("Breed " + i, null);
		}
		breedNameDTO.setMessage(map);
		breedNameDTO.setStatus("success");

		Mockito.when(breedRepository.findAll()).thenReturn(breedList);
		Mockito.when(mappingService.convertToAllBreedNameDTO_2(breedList)).thenReturn(breedNameDTO);

		mockMvc.perform(get("/api/breeds/list/all")).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.status", Matchers.is("success")));

		Mockito.verify(breedRepository).findAll();
		Mockito.verify(mappingService).convertToAllBreedNameDTO_2(breedList);
	}

}
