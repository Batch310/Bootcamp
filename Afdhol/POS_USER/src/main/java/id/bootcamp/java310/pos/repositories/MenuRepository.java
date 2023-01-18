package id.bootcamp.java310.pos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.entities.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity, Long>{

	
	@Query(nativeQuery = true,
			name = "get_menu"
			)
	public List<MenuDTO> getMenu(@Param ("role_code") String role_code);

}
