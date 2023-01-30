package id.bootcamp.java310.minipro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.minipro.dto.MedicalItemCategoryDto;
import id.bootcamp.java310.minipro.entities.MedicaltemCategoryEntity;


@Repository
public interface MedicalItemCategoryRepository extends JpaRepository<MedicaltemCategoryEntity, Long> {
	
	//GET API
	@Query(nativeQuery = true, name = "get_all_medical_item_category")
    public List<MedicalItemCategoryDto> getAllName();

}
