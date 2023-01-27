package id.bootcamp.java310.dogservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import id.bootcamp.java310.dogservice.model.entity.Breeds;
import id.bootcamp.java310.dogservice.model.entity.SubBreeds;

public interface SubBreedRepository extends JpaRepository<SubBreeds, Integer> {

	List<SubBreeds> findSubBreedsByBreeds(Breeds breeds);

	List<SubBreeds> findByNameAndBreeds(String name, Breeds breeds);

}
