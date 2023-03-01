package com.example.dogservice.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.dogservice.model.entity.DogImages;

class DogServicesTest {
	

	@Test
	void returnOddSizeOfImagesTest() {
		DogServices dogServices = new DogServices();
		
		List<DogImages> dummyList1 = new ArrayList<>();
		
		dummyList1.add(new DogImages());
		dummyList1.add(new DogImages());
		dummyList1.add(new DogImages());
		
		List<DogImages> hasil1 = dogServices.returnOddSizeOfImages(dummyList1);
		
		
		assert hasil1.size() == 3;	//asset untuk mengecek
		
	
	}

}
