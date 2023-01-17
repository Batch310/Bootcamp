package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

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

	// Insert
	// Cara 2 - insert memakai native query
	@Query(nativeQuery = true, value = "INSERT INTO public.variant(\r\n"
			+ "        active, category_id, create_by, create_date, initial, name)\r\n" + "        VALUES (true, "
			+ ":#{#dto.active}, " + ":#{#dto.category_id}, " + ":#{#dto.create_by}, " + ":createDate"
			+ ":#{#dto.initial}, " + ":#{#dto.name}) returning id")

	public Long insertVariant(@Param("dto") CategoryDTO dto, @Param("createDate") Date createDate);

	// Update
	// Cara 1 - Update menggunakan Native Query
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update variant\r\n" 
			+ "set category_id = :#{#dto.category_id}, "
			+ "initial = :#{#dto.initial}, " 
			+ "name = :#{#dto.name}, " 
			+ "active = :#{#dto.active}, "
			+ "modify_by = :#{#dto.modify_by}, " 
			+ "modify_date = :modifyDate\r\n" 
			+ "where id = :#{#dto.id}")
	public void update(@Param("dto") VariantDTO dto, @Param("modifyDate") Date modifyDate);

	// Delete
	// Cara 2 - menggunakan native query

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "delete from variant\r\n" + "where id = :id")
	public void delete(@Param("id") Long id);
	
	// Validasi search
	@Query(nativeQuery = true, name = "search_variant")
	public List<VariantDTO> searchVariant(@Param("keyword")String keywordku);
	
	// Validasi pagination
		@Query(nativeQuery = true, name = "pagination_variant")
		public List<VariantDTO> paginationVariant(@Param("keyword")String keywordku,@Param("limit")int limit, @Param("offset")int offset);

	// Validasi apakah initial sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select initial from variant where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String name);

	// Validasi apakah name sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select name from variant where name = :name)")
	public Boolean isNameExists(@Param("name") String name);

	// Validasi apakah initial sudah sama dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select initial from variant where initial = :initial AND id != :id)")
	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);

	// Validasi apakah name sudah sama dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select name from variant where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);

	// validasi apakah id category dipakai di variant
	@Query(nativeQuery = true, value = "select exists (select * from variant where category_id = :id)")
	public Boolean isCategoryUsedByVariant(@Param("id") Long id);
	
	//Ketika insert/update Category id diisikan oleh category yang tidak ada
	@Query(nativeQuery = true, value = "select exists (select id from category where id = :id)")
	public Long isCategoryExists(@Param("id") Long id);
	
	//get count semua daftar kategori
	//Get count semua data category
	@Query(nativeQuery = true, value = "select count(*) from category where name ilike '%' || :keyword ||'%'")
	public int countTotalData(@Param("keyword")String keyword);

}
