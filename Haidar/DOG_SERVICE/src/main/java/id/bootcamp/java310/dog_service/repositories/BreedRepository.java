package id.bootcamp.java310.dog_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import id.bootcamp.java310.dog_service.entities.Breeds;

public interface BreedRepository extends JpaRepository<Breeds, Integer> {
    Breeds findBreedsByName(String name);
}