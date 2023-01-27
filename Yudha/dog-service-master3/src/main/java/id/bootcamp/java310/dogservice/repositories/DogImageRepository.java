package id.bootcamp.java310.dogservice.repositories;

import id.bootcamp.java310.dogservice.entities.Breeds;
import id.bootcamp.java310.dogservice.entities.DogImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogImageRepository extends JpaRepository<DogImages, Integer> {
    List<DogImages> findDogImagesByBreeds(Breeds breeds);

    List<DogImages> findBySubBreedsId(int id);
}
