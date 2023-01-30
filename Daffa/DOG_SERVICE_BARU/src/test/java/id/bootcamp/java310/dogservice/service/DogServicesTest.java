package id.bootcamp.java310.dogservice.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import id.bootcamp.java310.dogservice.model.entity.DogImages;

class DogServicesTest {

	@Test
	void returnOddSizesOfImagesTest() {
		DogServices dogServices = new DogServices();

		List<DogImages> dummyList1 = new ArrayList<>();
		dummyList1.add(new DogImages());
		dummyList1.add(new DogImages());
		dummyList1.add(new DogImages());

		List<DogImages> hasil1 = dogServices.returnOddSizesOfImages(dummyList1);
		assert hasil1.size() == 3;
		
		
//		fail("Not yet implemented");
	}

}
