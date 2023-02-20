package id.bootcamp.java310.katalogmobil.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.katalogmobil.dto.BrandDTO;
import id.bootcamp.java310.katalogmobil.dto.TypeDTO;
import id.bootcamp.java310.katalogmobil.entities.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long> {

	//GET All
	@Query(nativeQuery = true, name = "get_all")
	public List<TypeDTO> getAll();
	
	//GET All Brand
	@Query(nativeQuery = true, name = "get_all_brand")
	public List<BrandDTO> getAllBrands();
		
	
}
