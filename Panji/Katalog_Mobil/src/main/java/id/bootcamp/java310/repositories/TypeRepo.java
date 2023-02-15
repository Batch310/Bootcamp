package id.bootcamp.java310.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.dto.TypeDto;
import id.bootcamp.java310.entities.TypeEntity;

@Repository
public interface TypeRepo extends JpaRepository<TypeEntity, Long>{

	// Read
	@Query(nativeQuery = true, name = "get_type")
	public List<TypeDto> getAllType();
}
