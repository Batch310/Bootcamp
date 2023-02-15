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

import id.acc.landingpage.entities.Brand;



@Repository
public interface PesananRepository extends JpaRepository<Brand, Long> {

	
//	@Query(nativeQuery = true, value = "select * from category order by name asc")
//	public List<Brand> getAllNameAsc();

//	// Cara 3 - Query Lebih Lengkap
//	@Query(nativeQuery = true, value = "select \r\n" + "        id,\r\n" + "        initial,\r\n" + "        name,\r\n"
//			+ "        active\r\n" + "from category\r\n" + "order by initial asc")
//	public List<Tuple> getAll3();
//
//	// Cara 4 - Query Lebih Lengkap, Didefinisikan Dulu
//	@Query(nativeQuery = true, name = "get_categories_cara4")
//	public List<CategoryDTO> getAll4();
//
//	// Cara 5 - Java Persistence Query Language (JPQL)
//	// Querynya Java
//	@Query(value = "select new" + " id.bootcamp.java310.pos.dto.CategoryDTO(id,initial,name,active)"
//			+ " from CategoryEntity order by initial asc")
//	public List<CategoryDTO> getAll5();

	
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
