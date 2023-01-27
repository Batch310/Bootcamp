package id.bootcamp.java310.dog_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import id.bootcamp.java310.dog_service.entities.Breeds;
import id.bootcamp.java310.dog_service.entities.DogImages;

import java.util.List;

public interface DogImageRepository extends JpaRepository<DogImages, Integer> {
    List<DogImages> findDogImagesByBreeds(Breeds breeds);

    List<DogImages> findBySubBreedsId(int id);
}
