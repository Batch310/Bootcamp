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

	//UPDATE
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update variant\r\n" + "set category_id = :#{#dto.category_id}, "
			+ "initial = :#{#dto.initial}, " + "name = :#{#dto.name}, " + "active = :#{#dto.active}, "
			+ "modified_by = CAST(:#{#dto.modify_by} AS INT), " + "modified_on = :modifyDate\r\n" + "where id = :#{#dto.id}")
	public void updateVariant(@Param("dto") VariantDTO dto, @Param("modifyDate") Date modifyDate);
	
	//GET BY CATEGORY ID
	@Query(nativeQuery = true, value = "select * from variant where category_id = :cat_id")
	public List<VariantEntity> getVariantsByCategoryId(@Param("cat_id") Long categoryId);

	//PAGINATION
		@Query(nativeQuery = true,
					name ="pagination_variant"
					)
	     public List<VariantDTO> paginationVariant(
	    		 @Param("keyword") String keywordku,
	    		 @Param("limit") int limit,
	    		 @Param("offset") int offset);
	
	// DELETE
	// Cara 2 - Delete menggunakan Native Query

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "delete from variant\r\n" + "where id = :id")
	public void deleteById(@Param("id") Long id);
	

	// DELETE UPDATE
		@Modifying
		@Transactional
		@Query(nativeQuery = true, value = "update variant\r\n"
				+ "set  deleted_by = CAST(:#{#dto.deleted_by}  AS INT), deleted_on = :deleteDate,is_delete = true where id = :#{#dto.id}")
		public void deleteUpdateVariant(@Param("dto") VariantDTO dto, @Param("deleteDate") Date deleteDate);

	
	
	//Search
	@Query(nativeQuery = true, value = "select * from variant where name ilike '%'||:keyword||'%' order by name asc")
	public List<VariantEntity> search(@Param("keyword") String keyword);
	
	// QUERY UNTUK VALIDASI

	// Validasi apakah Initial sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select initial " + "from variant "
			+ "where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);

	// Validasi apakah name sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select name " + "from variant " + "where name = :name)")
	public Boolean isNameExists(@Param("name") String name);

	// Validasi apakah initial sudah sama dan bukan dari id yg sama
	@Query(nativeQuery = true, value = "select exists (select initial " + "from variant "
			+ "where initial = :initial AND id != :id)")
	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);

	// Validasi apakah name sudah ada di DB dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select name " + "from variant "
			+ "where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);

	// Validasi apakah id category dipakai di variant
	@Query(nativeQuery = true, value = "select exists (select * from product where variant_id = :id)")
	public Boolean isVariantUsedByProduct(@Param("id") Long id);
	
	//Validasi apakah category yang mau diinsert ada
	@Query(nativeQuery = true, value = "select exists (select * from category where id = :id)")
	public Boolean isCategoryExists(@Param("id") Long id);
	
	//GET count semua data Variant
	@Query(nativeQuery = true, value = "select count(*) from variant where name ilike '%'|| :keyword||'%'")
	public int countTotalData(@Param("keyword") String keyword);
}
