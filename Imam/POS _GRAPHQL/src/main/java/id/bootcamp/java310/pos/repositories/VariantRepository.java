package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;

@Repository
public interface VariantRepository extends JpaRepository<VariantEntity, Long> {

	//READ
	//cara 4
	@Query(nativeQuery = true,
			name = "get_variant"
			)
	public List<VariantDTO> getAllku();
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update variant\r\n" + "set category_id = :#{#dto.category_id}, "
			+ "initial = :#{#dto.initial}, " + "name = :#{#dto.name}, " + "active = :#{#dto.active}, "
			+ "modify_by = :#{#dto.modify_by}, " + "modify_date = :modifyDate\r\n" + "where id = :#{#dto.id}")
	public void updateVariant(@Param("dto") VariantDTO dto, @Param("modifyDate") Date modifyDate);
	
	@Query(nativeQuery = true, value = "select * from variant where category_id = :cat_id")
	public List<VariantEntity> getVariantsByCategoryId(@Param("cat_id") Long categoryId);
	
	
	
	//SEARCH
	@Query(nativeQuery = true,
			name ="search_variant"
			)
	public List<VariantDTO> searchVariant(@Param("keyword") String keywordku);
	
	//PAGINATION
	@Query(nativeQuery = true,
				name ="pagination_variant"
				)
     public List<VariantDTO> paginationVariant(
    		 @Param("keyword") String keywordku,
    		 @Param("limit") int limit,
    		 @Param("offset") int offset);
	
	
	
	
	//INSERT
	@Query(nativeQuery = true,
			value = "INSERT INTO public.variant(\r\n"
					+ "        active, category_id, create_by, create_date, initial, name)\r\n"
					+ "        VALUES ("
					+ ":#{#dto.active}, "
					+ ":#{#dto.category_id}, "
					+ ":#{#dto.create_by},"
					+ ":createDate, "
					+ ":#{#dto.initial}, "
					+ ":#{#dto.name}) returning id")
	public Long insertVar(@Param("dto") VariantDTO dto,
						@Param("createDate") Date createDate);
	


	//UPDATE
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
	      value = "update variant\r\n"
	    		   + "set category_id = :#{#dto.category_id}, "
					+ "initial = :#{#dto.initial}, "
					+ "name = :#{#dto.name}, "
					+ "active = :#{#dto.active}, "
					+ "modify_by = :#{#dto.modify_by} , "
					+ "modify_date = :modifyDate\r\n"
					+ "where id = :#{#dto.id}"
			)
     public void updateVar(@Param("dto") VariantDTO dto,
 			@Param("modifyDate") Date modifyDate);
	
	//DELETE
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
			value = "delete from variant\r\n"
					+ "where id = :id"
			
			)
	public void deleteVar(@Param("id")Long id);
	
	// QUERY VALIDASI
	
	//VALIDASI INSERT
	// Validasi apakah initial sudah ada di DB
		@Query(nativeQuery = true, value = "select exists (select initial from variant " + "where initial = :initial)")
		public Boolean isInitialExists(@Param("initial") String initial);

		// Validasi apakah initial sudah ada di DB
		@Query(nativeQuery = true, value = "select exists (select name from variant " + "where name = :name)")
		public Boolean isNameExists(@Param("name") String name);
	
		// Validasi Category tidak ada
		@Query(nativeQuery = true, value = "select exists (select * from category " + "where id = :id)")
		public Boolean isCategoryNotExists(@Param("id") Long id);
		
		// VALIDASI UPDATE
		// Validasi apakah initial sudah sama dan bukan dari id yg sama
		@Query(nativeQuery = true, value = "select exists (select initial from variant \r\n"
				+ "			where initial = :initial  AND id != :id )")
		public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);

		// Validasi apakah Name sudah sama dan bukan dari id yg sama
		@Query(nativeQuery = true, value = "select exists (select name from variant "
				+ "where name = :name AND id != :id)")
		public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);
		
		
		// VALIDASI DELETE
		// Validasi apakah Name sudah sama dan bukan dari id yg sama
		@Query(nativeQuery = true, 
				value =   "select exists (select * from product \r\n"
						+ "where variant_id = :var_id)")
		public Boolean isVariantUseByProduct(@Param("var_id") Long id);

		
		//GET count semua data Variant
		@Query(nativeQuery = true, value = "select count(*) from variant where name ilike '%'|| :keyword||'%'")
		public int countTotalData(@Param("keyword") String keyword);
		
	
	
	
	
	
	
}

