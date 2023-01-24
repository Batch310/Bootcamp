package id.bootcamp.java310.pos.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.entities.BiodataEntity;
import id.bootcamp.java310.pos.entities.UserEntity;

@Repository
public interface BiodataRepository extends JpaRepository<BiodataEntity, Long> {
	
	@Query(nativeQuery = true, name = "profile_query")
	public ProfileDTO profile(@Param("user_id")Long userId);
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value ="update biodata\r\n"
			+ "set image_path = :image_path\r\n"
			+ "where id = :biodata_id ")
	public void upload(@Param("image_path")String imagePath,@Param("biodata_id")Long biodataId);

	@Query(nativeQuery = true, value = "select biodata_id from m_user where id = :user_id")
	 public Long getbiodataIdFromUserId(@Param("user_id") Long userId);
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update biodata\r\n"
			+ "set fullname = :name, mobile_phone = :phone\r\n"
			+ "where id = :biodata_id")
	public void updateBiodata(@Param("name")String fullname,@Param("phone")String phone,@Param("biodata_id")Long bioadataId);
	
	@Query(nativeQuery = true, value = "insert into biodata\r\n"
			+ "(fullname, created_by, created_on)\r\n"
			+ "values\r\n"
			+ "(:name, 1, now()) returning id")
	public Long saveBiodataRegister(@Param("name") String name);
}
