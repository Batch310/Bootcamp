package id.bootcamp.java310.dogservice.repositories;

import id.bootcamp.java310.dogservice.entities.Breeds;
import id.bootcamp.java310.dogservice.entities.SubBreeds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubBreedRepository extends JpaRepository<SubBreeds,Integer> {

    List<SubBreeds> findSubBreedsByBreeds(Breeds breeds);
    List<SubBreeds> findByNameAndBreeds(String name, Breeds breeds);




}
