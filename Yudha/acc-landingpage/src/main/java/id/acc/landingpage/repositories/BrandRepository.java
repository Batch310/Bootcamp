package id.acc.landingpage.repositories;

import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.acc.landingpage.dto.BrandDTO;
import id.acc.landingpage.entities.Brand;



@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

	
	@Query(nativeQuery = true, name = "get_brand")
	public List<BrandDTO> getAllBrand();

	
//	// SEARCH
//	@Query(nativeQuery = true, name = "search_category")
//	public List<CategoryDTO> searchCategory(@Param("keyword") String keywordku);
//
//	// Pagination
//	@Query(nativeQuery = true, name = "pagination_category")
//	public List<CategoryDTO> paginationCategory(@Param("keyword") String keyword, @Param("limit") int limit,
//			@Param("offset") int offset);
//
//	// Pagination
//	@Query(nativeQuery = true, name = "get_pagination_category")
//	public List<CategoryDTO> getPaginationCategory(@Param("keyword") String keyword, @Param("limit") int limit,
//			@Param("offset") int offset);
//
//	// QUERY UNTUK VALIDASI
//
//	// Validasi apakah Initial sudah ada di DB
//	@Query(nativeQuery = true, value = "select exists (select initial " + "from category "
//			+ "where initial = :initial)")
//	public Boolean isInitialExists(@Param("initial") String initial);
//
//	// Validasi apakah name sudah ada di DB
//	@Query(nativeQuery = true, value = "select exists (select name " + "from category " + "where name = :name)")
//	public Boolean isNameExists(@Param("name") String name);
//
//	// Validasi apakah initial sudah sama dan bukan dari id yg sama
//	@Query(nativeQuery = true, value = "select exists (select initial " + "from category "
//			+ "where initial = :initial AND id != :id)")
//	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);
//
//	// Validasi apakah name sudah ada di DB dan bukan dari id yang sama
//	@Query(nativeQuery = true, value = "select exists (select name " + "from category "
//			+ "where name = :name AND id != :id)")
//	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);
//
//	// Validasi apakah id category dipakai di variant
//	@Query(nativeQuery = true, value = "select exists (select * from variant where category_id = :id)")
//
//	public Boolean isCategoryUsedByVariant(@Param("id") Long id);
//
//	// Get count semua data category
//	@Query(nativeQuery = true, value = "select count(*) from category where name ilike '%' || :keyword || '%'")
//	public int countTotalData(@Param("keyword") String keyword);

}
