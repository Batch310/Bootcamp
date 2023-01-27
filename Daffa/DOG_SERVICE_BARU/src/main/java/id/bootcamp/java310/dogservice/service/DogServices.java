package id.bootcamp.java310.dogservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import id.bootcamp.java310.dogservice.model.entity.DogImages;

@Service
public class DogServices {

	public List<DogImages> returnOddSizesOfImages(List<DogImages> dogImages) {
		int sizes = dogImages.size();
		if (sizes == 0)
			return dogImages;
		if (sizes % 2 == 0)
			return dogImages.subList(0, sizes - 1);
		return dogImages;
	}
}
