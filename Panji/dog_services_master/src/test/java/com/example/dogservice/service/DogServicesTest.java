package com.example.dogservice.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.dogservice.model.entity.DogImages;

class DogServicesTest {

	@Test
	void returnOddSizeOfImagesTest() {
		DogServices dogService = new DogServices();

		List<DogImages> dummyList = new ArrayList<>();
		dummyList.add(new DogImages());
		dummyList.add(new DogImages());
		dummyList.add(new DogImages());

		List<DogImages> hasil = dogService.returnOddSizeOfImages(dummyList);

		assert hasil.size() == 3;
		
	}

}
