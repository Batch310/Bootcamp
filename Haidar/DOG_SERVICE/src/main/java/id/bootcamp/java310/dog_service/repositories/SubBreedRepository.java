package id.bootcamp.java310.dog_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import id.bootcamp.java310.dog_service.entities.Breeds;
import id.bootcamp.java310.dog_service.entities.SubBreeds;

import java.util.List;

public interface SubBreedRepository extends JpaRepository<SubBreeds,Integer> {

    List<SubBreeds> findSubBreedsByBreeds(Breeds breeds);
    List<SubBreeds> findByNameAndBreeds(String name, Breeds breeds);




}
