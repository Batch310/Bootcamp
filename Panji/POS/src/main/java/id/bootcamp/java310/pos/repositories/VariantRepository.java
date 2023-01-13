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
					+ "modify_date = :modifyDate\r\n"
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
	
	//Query Untuk validasi
	//Validasi apakah initial sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select initial from variant where initial = :initial)")
	public boolean isInitialExists(@Param("initial") String initial);
	
	// Validasi apakah nama sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select name from variant where name = :name)")
	public boolean isNameExists(@Param("name") String name);
	
	// Validasi apakah initial sudah ada di DB dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select initial from variant where initial = :initial and id != :id)")
	public boolean isInitialExists(@Param("initial") String name, @Param("id") Long id);
	
	// Validasi apakah nama sudah ada di DB dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select name from variant where name = :name and id != :id)")
	public boolean isNameExists(@Param("name") String name, @Param("id") Long id);
	
	// Validasi apakah id category dipakai variant
	@Query(nativeQuery = true, value = "select exists(select * from product where variant_id = :id)")
	public boolean isVariantUsedByProduct(@Param("id") Long id);
	
	// Validasi apakah category_id yang diisikan tidak ada di category
	@Query(nativeQuery = true, value = "select exists(select id from category where id = :category_id)")
	public boolean isBentarTakCobaDulu(@Param("category_id") Long id);
}