package id.bootcamp.java310.pos.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.entities.BiodataEntity;

public interface BiodataRepository extends JpaRepository<BiodataEntity, Long> {

	@Query(nativeQuery = true, name = "profile_query")
	public ProfileDTO getProfile(@Param("user_id") Long id);
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update biodata\r\n"
			+ "set image_path = :image_path\r\n"
			+ "where id = :biodata_id ")
	public void upload(@Param("image_path") String imagePath,
			@Param("biodata_id") Long biodataId);
	
	
	@Query(nativeQuery = true, value ="select biodata_id from m_user where id = :user_id")
	public Long getBiodataIdFromUserId(@Param("user_id") Long userId);
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value ="update biodata\r\n"
			+ "set fullname = :name, mobile_phone = :phone\r\n"
			+ "where id = :biodata_id")
	public void saveBiodata(@Param("name") String name,
			@Param("phone") String phone,
			@Param("biodata_id") Long id);
	
	@Query(nativeQuery = true, 
			value = "insert into biodata\r\n"
					+ "(fullname, created_by, created_on)\r\n"
					+ "values\r\n"
					+ "(:name, 1, now()) returning id")
	public Long saveBiodataRegister(@Param("name") String halo);
	
	
	
	
}
