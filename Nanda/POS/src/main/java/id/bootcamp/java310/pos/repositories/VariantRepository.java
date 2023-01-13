package id.bootcamp.java310.pos.repositories;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;

@Repository
public interface VariantRepository extends JpaRepository<VariantEntity, Long> {

	// update
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update variant\r\n" + "set category_id = :#{#dto.category_id},"
			+ "initial = :#{#dto.initial}, " + "name = :#{#dto.name}, " + "active = :#{#dto.active}, "
			+ "modify_by = :#{#dto.modify_by}, " + "modify_date = :modifyDate\r\n" + "where id = :#{#dto.id}")
	public void update(@Param("dto") VariantDTO dto, @Param("modifyDate") Date modifyDate);

	// delete
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "delete from variant\r\n" + "where id = :id")
	public void delete(@Param("id") Long id);

	// QUERY UNTUK VALIDASI

	// Validasi inisial
	@Query(nativeQuery = true, value = "select exists (select initial from variant where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);

	// Validasi name
	@Query(nativeQuery = true, value = "select exists (select name from variant where name = :name)")
	public Boolean isNameExists(@Param("name") String name);

	// Validasi apakah initial sudah sama dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select initial from variant where initial = :initial AND id != :id)")
	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);

	// Validasi apakah Name sudah ada di db dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select name from variant where name = :name AND id = :id)")
	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);

	// Validasi apakah id category dipakai di variant
	@Query(nativeQuery = true, value = "select exists (select * from variant where category_id = :id")
	public Boolean isCategoryUsedByVariant(@Param("id") Long id);
	
	//Validasi apakah category id diisikan oleh category yang tidak ada
	@Query(nativeQuery = true, value = "select exists (select id from category where id = :id)")
	public Boolean isCategoryExists(@Param("id") Long id);

	//Validasi apakah variant id dipakai di product
	@Query(nativeQuery = true, value = "select exists (select variant_id from product where variant_id = :id)")
	public Boolean isVariantExists(@Param("id") Long id);
	

}
