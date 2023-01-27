package id.bootcamp.java310.dogservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.bootcamp.java310.dogservice.model.entity.Breeds;

public interface BreedRepository extends JpaRepository<Breeds, Integer> {

	Breeds findBreedsByName(String name);

}
