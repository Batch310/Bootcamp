package id.bootcamp.java310.dogservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import id.bootcamp.java310.dogservice.model.entity.Breeds;
import id.bootcamp.java310.dogservice.model.entity.DogImages;

public interface DogImageRepository extends JpaRepository<DogImages, Integer> {

	List<DogImages> findDogImagesByBreeds(Breeds breeds);

	List<DogImages> findBySubBreedsId(int id);

}
