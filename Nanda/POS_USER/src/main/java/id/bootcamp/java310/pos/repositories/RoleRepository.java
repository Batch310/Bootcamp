package id.bootcamp.java310.pos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import id.bootcamp.java310.pos.dto.RoleDTO;
import id.bootcamp.java310.pos.entities.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

	@Query(value = "select new id.bootcamp.java310.pos.dto.RoleDTO(id, name) from RoleEntity")
	public List<RoleDTO> getAllRole();
	
	
}
