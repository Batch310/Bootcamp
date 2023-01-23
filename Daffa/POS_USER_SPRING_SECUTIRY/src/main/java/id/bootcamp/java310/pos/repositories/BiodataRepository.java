package id.bootcamp.java310.pos.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.entities.BiodataEntity;

@Repository
public interface BiodataRepository extends JpaRepository<BiodataEntity, Long> {
	@Query(nativeQuery = true, name = "profile_query")
	public ProfileDTO profile(@Param("user_id") Long user_id);

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update biodata\r\n" + "set image_path = :image_path\r\n"
			+ "where id = :biodata_id ")
	public void upload(@Param("image_path") String imagePath, @Param("biodata_id") Long biodataId);
	
	@Query(nativeQuery = true, value = "select biodata_id from m_user where id = :user_id")
	public Long getBiodataIdFromUserId(@Param("user_id") Long userId);
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update biodata\r\n"
			+ "set fullname = :fullname, mobile_phone = :mobile_phone\r\n"
			+ "where id = :biodata_id")
	public void updateBiodata(@Param("biodata_id") Long biodataId, @Param("fullname") String fullName, @Param("mobile_phone") String mobilePhone);
	
	
}
