package id.bootcamp.java310.dogservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import id.bootcamp.java310.dogservice.model.dto_data_crud.data_out.BreedNameDTO;
import id.bootcamp.java310.dogservice.model.dto_data_crud.data_out.DogImageDTO;
import id.bootcamp.java310.dogservice.model.dto_data_crud.data_out.SubBreedNameDTO;
import id.bootcamp.java310.dogservice.model.dto_data_crud.data_out.TerrierDTO;
import id.bootcamp.java310.dogservice.model.entity.Breeds;
import id.bootcamp.java310.dogservice.model.entity.DogImages;
import id.bootcamp.java310.dogservice.model.entity.SubBreeds;
import lombok.var;

@Service
public class MappingService {

	public BreedNameDTO convertToAllBreedNameDTO_2(List<Breeds> breeds) {
		BreedNameDTO breedNameDTO = new BreedNameDTO();
		Map<String, List<String>> hm = new HashMap<String, List<String>>();
		for (Breeds breed : breeds) {
			String key = breed.getName();
			List<String> values = new ArrayList<>();
			if (key.equals("sheepdog")) {
				for (SubBreeds sub : breed.getSubBreeds()) {
					StringBuilder sb = new StringBuilder();
					sb.append("sheepdog-");
					sb.append(sub.getName());
					hm.put(sb.toString(), values);
				}
			} else {
				if (breed.getSubBreeds() == null) hm.put(key, values);
				else {
					values = listSubBreedToListString(breed.getSubBreeds());
					hm.put(key, values);
				}
			}
		}
		Map<String, List<String>> sortedMap = hm.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		breedNameDTO.setMessage(sortedMap);
		breedNameDTO.setStatus("success");
		return breedNameDTO;
	}
	
	private List<String> listSubBreedToListString(List<SubBreeds> subBreeds){
		List<String> arr = new ArrayList<>();
		for (SubBreeds sub : subBreeds) {
			arr.add(sub.getName());
		}
		return arr;
	}
	
	public SubBreedNameDTO convertToAllSubBreedNameDTO(List<SubBreeds> subBreeds) {
		SubBreedNameDTO subBreedNameDTO = new SubBreedNameDTO();
		List<String> subBreedNameList = new ArrayList<>();
		for (SubBreeds subBreed : subBreeds) {
			subBreedNameList.add(subBreed.getName());
		}
		subBreedNameDTO.setMessage(subBreedNameList);
		subBreedNameDTO.setStatus("success");
		return subBreedNameDTO;
	}
	
	public DogImageDTO convertToDogImageDTO(List<DogImages> dogImages) {
		DogImageDTO dogImageDTO = new DogImageDTO();
		List<String> dogImageURL = new ArrayList<>();
		for (DogImages dogImage : dogImages) {
			dogImageURL.add(dogImage.getUrl());
		}
		dogImageDTO.setMessage(dogImageURL);
		dogImageDTO.setStatus("success");
		return dogImageDTO;
	}
	
	public TerrierDTO convertToTerrierDTO(List<DogImages> dogImages, Breeds breeds) {
		TerrierDTO terrierDTO = new TerrierDTO();
		Map<String, List<String>> hm = new HashMap<String, List<String>>();
		List<String> values = new ArrayList<>();
		List<SubBreeds> subBreeds = breeds.getSubBreeds();
		for (SubBreeds sub : subBreeds) {
			String key = breeds.getName() + "-" + sub.getName();
			values = toListStringImageURL(sub.getDogImages());
			hm.put(key, values);
		}
		terrierDTO.setMessage(hm);
		terrierDTO.setStatus("success");
		return terrierDTO;
	}
	
	private List<String> toListStringImageURL(List<DogImages> dogImages){
		var arr = new ArrayList<String>();
		for (DogImages dog : dogImages) {
			arr.add(dog.getUrl());
		}
		return arr;
	}
}
