package id.bootcamp.java310.dogservice.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import id.bootcamp.java310.dogservice.entities.DogImages;

class DogServicesTest {

	@Test
	void returnOddSizeOfImagesTest() {
		DogServices dogServices = new DogServices();
		
		// Buat data dummy isi 3
		List<DogImages> dummyList1 = new ArrayList<>();
		dummyList1.add(new DogImages());
		dummyList1.add(new DogImages());
		dummyList1.add(new DogImages());
		
		List<DogImages> hasil1 = dogServices.returnOddSizeOfImages(dummyList1);
		assert hasil1.size() == 3;
		//assert : menegaskan -> apakah benar 3 ?
		
	}

}
