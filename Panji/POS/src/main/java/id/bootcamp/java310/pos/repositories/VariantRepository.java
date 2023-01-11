package id.bootcamp.java310.pos.repositories;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;

@Repository
public interface VariantRepository extends JpaRepository<VariantEntity, Long>{

	// Create
	@Query(nativeQuery = true,
			value = "INSERT INTO public.variant(\r\n"
					+ "	        active, category_id, create_by, create_date, initial, name)\r\n"
					+ "	        VALUES ("
					+ ":#{#dto.active},"
					+ ":#{#dto.category_id},"
					+ ":#{#dto.create_by},"
					+ ":createDate,"
					+ ":#{#dto.initial},"
					+ ":#{#dto.name}) returning id"
					)
	public Long insert2(@Param("dto") VariantDTO dto,
						@Param("createDate") Date createDate);
	
	// Update
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
			value = "update variant\r\n"
					+ "set category_id = :#{#dto.category_id},"
					+ "initial = :#{#dto.initial},"
					+ "name = :#{#dto.name},"
					+ "active = :#{#dto.active},"
					+ "modify_by = :#{#dto.modify_by},"
					+ "modify_date = :modifyDate"
					+ "where id = :#{#dto.id}")
	public void update(@Param("dto") VariantDTO dto,
						@Param("modifyDate") Date createDate);
	
	// Delete
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
	value = "delete from variant\r\n"
			+ "where id = :id")
	public void delete(@Param("id") Long id);
}
