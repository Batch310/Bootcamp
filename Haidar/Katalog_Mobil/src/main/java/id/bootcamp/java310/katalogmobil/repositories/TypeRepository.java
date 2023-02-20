package id.bootcamp.java310.katalogmobil.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.katalogmobil.dto.TypeDTO;
import id.bootcamp.java310.katalogmobil.entities.TypeEntity;

@Repository
public interface TypeRepository extends JpaRepository<TypeEntity, Long> {

	@Query(nativeQuery = true, name = "get_all_types")
	List<TypeDTO> getAllTypes();

	@Query(nativeQuery = true, name = "get_type_detail")
	List<TypeDTO> getTypeDetail(@Param("brand_id") Long brandID, @Param("id") Long typeID);

	
	
}
