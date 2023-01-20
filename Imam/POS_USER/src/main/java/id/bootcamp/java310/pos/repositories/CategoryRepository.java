package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

	// Cara 2 - Query dasar + sedikit Custom
	// Kelemahan Cara 2
	// 1. Querynya gk boleh join
	// 2. select harus *
	// 3. tabelnya harus sesuai repository
	@Query(nativeQuery = true, value = "select * from category order by name asc")
	public List<CategoryEntity> getAllNameAsc();

	// Cara 3 - Query Lebih Lengkap
	@Query(nativeQuery = true, value = "select \r\n" + "        id,\r\n" + "        initial,\r\n" + "        name,\r\n"
			+ "        active\r\n" + "from category\r\n" + "order by initial asc")
	public List<Tuple> getAll3();

	// Cara 4 - Query Lebih Lengkap, Didefinisikan Dulu
	@Query(nativeQuery = true, name = "get_categories_cara4")
	public List<CategoryDTO> getAll4();

	// Cara 5 - Java Persistence Query Language (JPQL)
	// Querynya Java
	@Query(value = "select new" + " id.bootcamp.java310.pos.dto.CategoryDTO(id,initial,name,active)"
			+ " from CategoryEntity order by initial asc")
	public List<CategoryDTO> getAll5();

	// INSERT
	// Cara 2 - Insert memakai native query
	@Query(nativeQuery = true, value = "INSERT INTO public.category(\r\n"
			+ "        active, create_by, create_date, initial, name)\r\n" + "        VALUES (" + ":#{#dto.active}, "
			+ ":#{#dto.create_by}, " + ":createDate, " + ":#{#dto.initial}, " + ":#{#dto.name}) returning id")
	public Long insert2(@Param("dto") CategoryDTO dto, @Param("createDate") Date createDate);

	// UPDATE
	// Cara 1 - Update menggunakan Native Query
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update category\r\n" + "set initial = :#{#dto.initial}, "
			+ "name = :#{#dto.name}, " + "active = :#{#dto.active}, " + "modified_by = CAST(:#{#dto.modify_by} AS INT), "
			+ "modified_on = :modifyDate\r\n" + "where id = :#{#dto.id}")
	public void update(@Param("dto") CategoryDTO dto, @Param("modifyDate") Date modifyDate);

	// DELETE
	// Cara 2 - Delete menggunakan Native Query

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "delete from category\r\n" + "where id = :id")
	public void delete(@Param("id") Long id);
	
	// DELETE UPDATE
		@Modifying
		@Transactional
		@Query(nativeQuery = true, value = "update category\r\n"
				+ "set  deleted_by = CAST(:#{#dto.deleted_by}  AS INT), deleted_on = :deleteDate,is_delete = true where id = :#{#dto.id}")
		public void deleteUpdate(@Param("dto") CategoryDTO dto, @Param("deleteDate") Date deleteDate);

	// SEARCH
	@Query(nativeQuery = true, name = "search_category")
	public List<CategoryDTO> searchCategory(@Param("keyword") String keywordku);

	// Pagination
	@Query(nativeQuery = true, name = "pagination_category")
	public List<CategoryDTO> paginationCategory(@Param("keyword") String keyword, @Param("limit") int limit,
			@Param("offset") int offset);

	// QUERY UNTUK VALIDASI

	// Validasi apakah Initial sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select initial " + "from category "
			+ "where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);

	// Validasi apakah name sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select name " + "from category " + "where name = :name)")
	public Boolean isNameExists(@Param("name") String name);

	// Validasi apakah initial sudah sama dan bukan dari id yg sama
	@Query(nativeQuery = true, value = "select exists (select initial " + "from category "
			+ "where initial = :initial AND id != :id)")
	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);

	// Validasi apakah name sudah ada di DB dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select name " + "from category "
			+ "where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);

	// Validasi apakah id category dipakai di variant
	@Query(nativeQuery = true, value = "select exists (select * from variant where category_id = :id)")

	public Boolean isCategoryUsedByVariant(@Param("id") Long id);

	// Get count semua data category
	@Query(nativeQuery = true, value = "select count(*) from category where name ilike '%' || :keyword || '%' and is_delete = false")
	public int countTotalData(@Param("keyword") String keyword);

}
