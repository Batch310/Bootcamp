package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import id.bootcamp.java310.pos.dto.RoleDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.entities.UserEntity;

@Repository
public interface RoleRepository extends JpaRepository<UserEntity, Long> {
	@Query(value="select new id.bootcamp.java310.pos.dto.RoleDTO(id,name) from RoleEntity")
	public List<RoleDTO> getAllRole();
}