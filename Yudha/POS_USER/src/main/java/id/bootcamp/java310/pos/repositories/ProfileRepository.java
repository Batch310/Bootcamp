package id.bootcamp.java310.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.ProfileDTO;

import id.bootcamp.java310.pos.entities.BiodataEntity;

@Repository
public interface ProfileRepository extends JpaRepository<BiodataEntity, Long> {
	@Query(nativeQuery = true, name = "profil_query")
	public ProfileDTO getProfile(
			@Param("user_id") Long user_id
			);
}