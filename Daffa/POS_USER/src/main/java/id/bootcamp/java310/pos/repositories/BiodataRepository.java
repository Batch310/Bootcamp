package id.bootcamp.java310.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.entities.BiodataEntity;

@Repository
public interface BiodataRepository extends JpaRepository<BiodataEntity, Long>{
	@Query(nativeQuery = true, name = "profile_query")
	public ProfileDTO profile(@Param("user_id") Long user_id);
}
