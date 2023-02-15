package id.bootcamp.java310.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.dto.BrandDto;
import id.bootcamp.java310.entities.BrandEntity;

@Repository
public interface BrandRepo extends JpaRepository<BrandEntity, Long>{

	// Read 
	@Query(nativeQuery = true, name = "get_brands")
	public List<BrandDto> getAllBrands();
}
