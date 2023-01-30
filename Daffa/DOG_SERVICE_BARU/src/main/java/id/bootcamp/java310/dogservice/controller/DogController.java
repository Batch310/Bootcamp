package id.bootcamp.java310.dogservice.controller;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.dogservice.model.dto_data_crud.response_message.Message;
import id.bootcamp.java310.dogservice.model.dto_data_crud.response_message.NotFound;
import id.bootcamp.java310.dogservice.model.entity.Breeds;
import id.bootcamp.java310.dogservice.model.entity.DogImages;
import id.bootcamp.java310.dogservice.model.entity.SubBreeds;
import id.bootcamp.java310.dogservice.repository.BreedRepository;
import id.bootcamp.java310.dogservice.repository.DogImageRepository;
import id.bootcamp.java310.dogservice.repository.SubBreedRepository;
import id.bootcamp.java310.dogservice.service.DogServices;
import id.bootcamp.java310.dogservice.service.MappingService;

@RestController
@RequestMapping("/api")
public class DogController {

	private final BreedRepository breedRepository;
	private final SubBreedRepository subBreedRepository;
	private final DogImageRepository dogImageRepository;
	private final MappingService mappingService;
	private final DogServices dogServices;

	public DogController(BreedRepository breedRepository, SubBreedRepository subreedBreedRepository,
			DogImageRepository dogImageRepository, MappingService mappingService, DogServices dogServices) {
		super();
		this.breedRepository = breedRepository;
		this.subBreedRepository = subreedBreedRepository;
		this.dogImageRepository = dogImageRepository;
		this.mappingService = mappingService;
		this.dogServices = dogServices;
	}

	@GetMapping("/breeds/list/all")
	@Transactional(timeout = 5)
	public Object getAllBreedNameWithoutItsSubBreed() {
		List<Breeds> breedList = breedRepository.findAll();
		return mappingService.convertToAllBreedNameDTO_2(breedList);
	}

	@GetMapping("/breed/{breedName}/list")
	@Transactional(timeout = 2)
	public Object getSubBreedOfBreed(@PathVariable String breedName) {
		Breeds breeds = breedRepository.findBreedsByName(breedName);
		if (breeds == null)
			return new NotFound("error", "Breed not found (master breed does not exist)", 404);
		List<SubBreeds> subBreeds = subBreedRepository.findSubBreedsByBreeds(breeds);
		return mappingService.convertToAllSubBreedNameDTO(subBreeds);
	}

	@Cacheable(cacheNames = {"Breed"}, key = "#breedName")
	@GetMapping("/breed/{breedName}/images")
	public Object getImagesByBreed(@PathVariable String breedName) {
		System.out.println("Sleep selama 5 detik");
		
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Breeds breeds = breedRepository.findBreedsByName(breedName);
		if (breeds == null)
			return new NotFound("error", "Breed not found (master breed does not exist)", 404);
		List<DogImages> dogImages = dogImageRepository.findDogImagesByBreeds(breeds);
		if (breeds.getName().equals("shiba"))
			return mappingService.convertToDogImageDTO(dogServices.returnOddSizesOfImages(dogImages));
		if (breeds.getName().equals("terrier"))
			return mappingService.convertToTerrierDTO(dogImages, breeds);
		return mappingService.convertToDogImageDTO(dogImages);
	}

	@GetMapping("/breed/{breedName}/{subBreedName}/images")
	public Object getImagesByBreedAndItsSubBreed(@PathVariable String breedName, @PathVariable String subBreedName) {
		Breeds breeds = breedRepository.findBreedsByName(breedName);
		if (breeds == null)
			return new NotFound("error", "Breed not found (master breed does not exist)", 404);
		List<SubBreeds> subBreeds = subBreedRepository.findByNameAndBreeds(subBreedName, breeds);
		if (subBreeds.isEmpty())
			return new NotFound("error", "Breed not found (sub breed does not exist)", 404);
		List<DogImages> dogImages = dogImageRepository.findBySubBreedsId(subBreeds.get(0).getId());
		return mappingService.convertToDogImageDTO(dogImages);
	}

	@PostMapping("/post/breed/{newBreedName}")
	public Object postNewBreed(@PathVariable String newBreedName) {
		Breeds breeds = breedRepository.findBreedsByName(newBreedName);
		if (breeds != null)
			return new Message("breed is already exist");
		Breeds newBreed = new Breeds();
		newBreed.setName(newBreedName);
		breedRepository.save(newBreed);
		return new Message("new breed successfully added");
	}

	@PostMapping("/post/subbreed/{breedName}/{newSubBreedName}")
	public Object postNewSubBreed(@PathVariable String newSubBreedName, @PathVariable String breedName) {
		Breeds breeds = breedRepository.findBreedsByName(breedName);
		if (breeds == null)
			return new Message("breed is not exist, add breed first");
		SubBreeds subBreeds = new SubBreeds();
		subBreeds.setBreeds(breeds);
		subBreeds.setName(newSubBreedName);
		subBreedRepository.save(subBreeds);
		return new Message("new sub-breed of " + breedName + " successfully added");
	}

	@PostMapping("/post/image/{breedName}/{subBreedName}/{imageUrl}")
	public Object postNewImage(@PathVariable String breedName, @PathVariable String imageUrl,
			@PathVariable String subBreedName) {
		Breeds breeds = breedRepository.findBreedsByName(breedName);
		if (breeds == null)
			return new NotFound("error", "Breed not found (master breed does not exist)", 404);
		List<SubBreeds> subBreeds = subBreedRepository.findByNameAndBreeds(subBreedName, breeds);
		if (subBreeds.isEmpty())
			return new NotFound("error", "Breed not found (sub breed does not exist)", 404);
		DogImages dogImages = new DogImages();
		dogImages.setBreeds(breeds);
		dogImages.setSubBreeds(subBreeds.get(0));
		dogImages.setUrl(imageUrl);
		dogImageRepository.save(dogImages);
		return new Message("new image successfully added");
	}

	@DeleteMapping("/delete/breed/{id}")
	public Object deleteBreed(@PathVariable Integer id) {
		Breeds breeds = breedRepository.findById(id).orElse(null);
		if (breeds == null)
			return new Message("id not found");
		breedRepository.deleteById(id);
		return new Message("delete success");
	}

	@DeleteMapping("/delete/subbreed/{id}")
	public Object deleteSubBreed(@PathVariable Integer id) {
		SubBreeds subBreeds = subBreedRepository.findById(id).orElse(null);
		if (subBreeds == null)
			return new Message("id not found");
		subBreedRepository.deleteById(id);
		return new Message("delete success");
	}

	@DeleteMapping("/delete/image/{id}")
	public Object deleteImage(@PathVariable Integer id) {
		DogImages dogImages = dogImageRepository.findById(id).orElse(null);
		if (dogImages == null)
			return new Message("id not found");
		dogImageRepository.deleteById(id);
		return "oke";
	}

	@PutMapping("/update/breed/{id}/{newName}")
	public Object updateBreedName(@PathVariable Integer id, @PathVariable String newName) {
		Breeds breeds = breedRepository.findById(id).orElse(null);
		if (breeds == null)
			return new Message("id not found");
		breeds.setName(newName);
		breedRepository.save(breeds);
		return new Message("update success");
	}

	@PutMapping("/update/subbreed/{id}/{newName}")
	public Object updateSubBreedName(@PathVariable Integer id, @PathVariable String newName) {
		SubBreeds subBreeds = subBreedRepository.findById(id).orElse(null);
		if (subBreeds == null)
			return new Message("id not found");
		subBreeds.setName(newName);
		subBreedRepository.save(subBreeds);
		return new Message("update success");
	}

	@PutMapping("/update/image/{id}/{imageUrl}")
	public Object updateImageUrl(@PathVariable Integer id, @PathVariable String imageUrl) {
		DogImages dogImages = dogImageRepository.findById(id).orElse(null);
		if (dogImages == null)
			return new Message("id not found");
		dogImages.setUrl(imageUrl);
		dogImageRepository.save(dogImages);
		return new Message("update success");
	}

}
