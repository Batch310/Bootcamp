package id.bootcamp.java310.dogservice.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import id.bootcamp.java310.dogservice.model.dto_data_migration.BreedsDTO;
import id.bootcamp.java310.dogservice.model.dto_data_migration.SubBreedsDTO;
import id.bootcamp.java310.dogservice.model.dto_data_migration.DogImagesDTO;
import id.bootcamp.java310.dogservice.model.entity.Breeds;
import id.bootcamp.java310.dogservice.model.entity.DogImages;
import id.bootcamp.java310.dogservice.model.entity.SubBreeds;
import id.bootcamp.java310.dogservice.repository.BreedRepository;
import id.bootcamp.java310.dogservice.repository.DogImageRepository;
import id.bootcamp.java310.dogservice.repository.SubBreedRepository;
import lombok.var;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MigrateDataFromDogAPI {

	private final RestTemplate restTemplate;
	private final BreedRepository breedRepository;
	private final SubBreedRepository subBreedRepository;
	private final DogImageRepository dogImageRepository;

	public MigrateDataFromDogAPI(RestTemplate restTemplate, BreedRepository breedRepository,
			SubBreedRepository subBreedRepository, DogImageRepository dogImageRepository) {
		super();
		this.restTemplate = restTemplate;
		this.breedRepository = breedRepository;
		this.subBreedRepository = subBreedRepository;
		this.dogImageRepository = dogImageRepository;
	}

	public void run() {
		log.info("data migration from Dog API to H2 DB start");
		log.info("please wait...");
		migrateDataFromDogDPItoDB();
		log.info("data migration from Dog API to H2 DB finish");
		log.info("Dog Service is ready");

	}

	private void migrateDataFromDogDPItoDB() {
		BreedsDTO breedsDTO = restTemplate.getForObject("https://dog.ceo/api/breeds/list/all", BreedsDTO.class);
		assert breedsDTO != null;
		LinkedHashMap<Object, Object> breedMap = breedsDTO.getMessage();
		for (Object breedKey : breedMap.keySet()) {
			String breedName = breedKey.toString();
			Breeds breed = saveBreedToDB(breedName);
			migrateSubBreed(breedName, breed);
			log.info("migrating '" + breedName + "' and its sub-breed + images from Dog API to DB");
		}
	}

	private Breeds saveBreedToDB(String breedName) {
		Breeds breed = new Breeds();
		breed.setName(breedName);
		breedRepository.save(breed);
		return breed;
	}

	private void migrateSubBreed(String breedName, Breeds breed) {
		String subBreedsURL = "https://dog.ceo/api/breed/" + breedName + "/list";
		SubBreedsDTO subBreedsDTO = restTemplate.getForObject(subBreedsURL, SubBreedsDTO.class);
		assert subBreedsDTO != null;
		var subBreedList = subBreedsDTO.getMessage();
		if (!subBreedList.get(breedName).isEmpty()) {
			for (Object sub : subBreedList.get(breedName)) {
				String subBreedName = sub.toString();
				SubBreeds subBreed = new SubBreeds();
				subBreed.setName(subBreedName);
				subBreed.setBreeds(breed);
				subBreedRepository.save(subBreed);
				migrateDogImageByBreedAndItsSubBreed(breedName, breed, subBreedName, subBreed);
			}
		} else {
			migrateDogImageByBreedThatDoNotHaveSubBreed(breedName, breed);
		}

	}

	private void migrateDogImageByBreedAndItsSubBreed(String breedName, Breeds breed, String subBreedName,
			SubBreeds subBreeds) {
		String dogImagesUrl = "https://dog.ceo/api/breed/" + breedName + "/" + subBreedName + "/images";
		var dogImagesList = getDogImagesUrlLists(dogImagesUrl);
		for (Object img : dogImagesList) {
			String imgUrl = img.toString();
			DogImages dogImage = new DogImages();
			dogImage.setBreeds(breed);
			dogImage.setSubBreeds(subBreeds);
			dogImage.setUrl(imgUrl);
			dogImageRepository.save(dogImage);
		}
	}

	private void migrateDogImageByBreedThatDoNotHaveSubBreed(String breedName, Breeds breed) {
		String dogImagesUrl = "https://dog.ceo/api/breed/" + breedName + "/images";
		var dogImagesList = getDogImagesUrlLists(dogImagesUrl);
		for (Object img : dogImagesList) {
			String imgUrl = img.toString();
			DogImages dogImage = new DogImages();
			dogImage.setBreeds(breed);
			dogImage.setUrl(imgUrl);
			dogImageRepository.save(dogImage);
		}
	}

	private List<Object> getDogImagesUrlLists(String dogImagesUrl) {
		DogImagesDTO dogImagesDTO = restTemplate.getForObject(dogImagesUrl, DogImagesDTO.class);
		assert dogImagesDTO != null;
		return dogImagesDTO.getMessage();
	}
}
