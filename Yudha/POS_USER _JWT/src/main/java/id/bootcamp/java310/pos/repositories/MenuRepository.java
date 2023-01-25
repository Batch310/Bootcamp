package id.bootcamp.java310.pos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.entities.MenuEntity;
import id.bootcamp.java310.pos.entities.UserEntity;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
	@Query(nativeQuery = true, name = "menu_query")
	public List<MenuDTO> menu(@Param("role_code") String role_code);
}