package id.bootcamp.java310.dogservice.repositories;

import id.bootcamp.java310.dogservice.entities.Breeds;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<Breeds, Integer> {
    Breeds findBreedsByName(String name);
}