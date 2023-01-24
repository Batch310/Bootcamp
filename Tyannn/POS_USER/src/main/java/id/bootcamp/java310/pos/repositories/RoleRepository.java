package id.bootcamp.java310.pos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.RoleDTO;
import id.bootcamp.java310.pos.entities.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

	@Query(value = "select new id.bootcamp.java310.pos.dto.RoleDTO(id,name)"
			+" from RoleEntity")
	public List<RoleDTO> getAllRole();
	
	@Query(nativeQuery = true, value = "insert into m_user\r\n"
			+ "(email, password, role_id, biodata_id, created_by, created_on)\r\n"
			+ "values\r\n"
			+ "(:email, :password, :role_id, :biodata_id, 1, now())")
	public Long saveUserRegister(
			@Param("email") String email,
			@Param("password")String password,
			@Param("role_id")Long roleId,
			@Param("biodata_id")Long biodata);
}
