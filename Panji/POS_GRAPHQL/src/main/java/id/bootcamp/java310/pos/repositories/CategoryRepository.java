package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;
import javax.transaction.Transactional;

import org.hibernate.annotations.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

	// Cara 2
	// Kelemahan cara 2
	// 1. Querynya gak boleh join
	// 2. Select harus *
	// 3. Tabelnya harus sesuia repository
	@Query(nativeQuery = true, value = "select * from category order by name asc")
	public List<CategoryEntity> getAllNameAsc();

	// Cara 3 - query lebih lengkap
	@Query(nativeQuery = true, value = "select \r\n" + "        id,\r\n" + "        initial,\r\n" + "        name,\r\n"
			+ "        active\r\n" + "from category\r\n" + "order by initial asc")
	public List<Tuple> getAll3();
	
	// Cara 4 - query lengkpa tapi didefinisikan dulu
	
	@Query(nativeQuery = true,
			name = "get_categories_cara4"
			)
	public List<CategoryDTO> getAll4();
	
	// Cara 5 - Java Persistance Query Language (JPQL)
	// Query
	@Query(value = "select new"
			+ " id.bootcamp.java310.pos.dto.CategoryDTO(id,initial,name,active)"
			+ " from CategoryEntity order by initial asc")
	public List<CategoryDTO> getAll5();
	
	// Search
	@Query(nativeQuery = true,
			name = "search_category")
	public List<CategoryDTO> getSearch(@Param("keyword") String keyword);
	
	// Pagination
	@Query(nativeQuery = true,
			name = "pagination_category")
	public List<CategoryDTO> getPagination(@Param("keyword") String keyword, @Param("limit") int limit, @Param("offset") int offset);
	
	
	// Create / insert
	// cara 2 - insert memakai native query
	@Query(nativeQuery = true,
			value = "INSERT INTO public.category(\r\n"
			+ "		active, create_by, create_date, initial, name)\r\n"
			+ "		VALUES ("
			+ ":#{#dto.active}, "
			+ ":#{#dto.create_by}, "
			+ ":createDate, "
			+ ":#{#dto.initial}, "
			+ ":#{#dto.name}) returning id"
			)
	public Long insert2(@Param("dto") CategoryDTO dto,
						@Param("createDate") Date createDate);
	
	// Update
	// Cara 1 - update menggunakan native query
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
			value = "update category\r\n"
					+ "set initial = :#{#dto.initial},"
					+ "name = :#{#dto.name},"
					+ "active = :#{#dto.active},"
					+ "modify_by = :#{#dto.modify_by},"
					+ "modify_date = :modifyDate\r\n"
					+ "where id = :#{#dto.id}")
	public void update(@Param("dto") CategoryDTO dto,
						@Param("modifyDate") Date modifyDate);
	
	// Delete
	// Cara 2 - delete menggunakan native query
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
			value = "delete from category\r\n"
					+ "where id = :id"
					)
	public void delete(@Param("id") Long id);
	
	//Query untuk validasi
	//Validasi apakah initial sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select initial from category where initial = :initial)")
	public boolean isInitialExists(@Param("initial") String initial);
	
	//Validasi apakah name sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select name from category where name = :name)")
	public boolean isNameExists(@Param("name") String name);
	
	// Validasi apakah initial sudah ada di DB dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select initial from category where initial = :initial and id != :id)")
	public boolean isInitialExists(@Param("initial") String name, @Param("id") Long id);
	
	// Validasi apakah nama sudah ada di DB dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists (select name from category where name = :name and id != :id)")
	public boolean isNameExists(@Param("name") String name, @Param("id") Long id);
	
	// Validasi apakah id category dipakai variant
	@Query(nativeQuery = true, value = "select exists(select * from variant where category_id = :id)")
	public boolean isCategoryUsedByVariant(@Param("id") Long id);
	
	// Hitung total data
	@Query(nativeQuery = true, value = "select count(*) from category where name ilike '%' || :keyword ||'%'")
	public int countTotalData(@Param("keyword") String keyword);
		
}
