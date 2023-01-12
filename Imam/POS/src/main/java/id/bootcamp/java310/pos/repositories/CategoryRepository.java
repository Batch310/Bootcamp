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

	// Cara 2 => query dasar + sedikit custom
	// Kelemahan cara 2
	// 1. Query gaboleh join
	// 2. select harus *
	// 3. tabelnya harus sesuai repository
//	@Query(nativeQuery = true, value = "select * from category order by name asc")
//	public List<CategoryEntity> getAllNameAsc();
//
//	// Cara 3 => Query lebih lengkap
//	@Query(nativeQuery = true, value = "select \r\n"
//			+ "        id,\r\n"
//			+ "        initial,\r\n"
//			+ "        name,\r\n"
//			+ "        active\r\n"
//			+ "from category\r\n"
//			+ "order by initial asc")
//	public List<Tuple> getAll3();
//	

	// Cara 4 => Query lebih lengkap, Didefinikan dulu

	@Query(nativeQuery = true, name = "get_categories_cara4"

	)
	public List<CategoryDTO> getAll4();

//	//Cara 5 => Java Persitence Query Language (JPQL)
//	//Querynya Java
//	
	// @Query(value = "select new" + "
	// id.bootcamp.java310.pos.dto.CategoryDTO(id,initial,name,active)"
	// + " from CategoryEntity order by name asc")
	// public List<CategoryDTO> getAll5();
//	
	// ----------------------------------------------------------

	// INSERT
	// Cara 2 => Insert Memakai native query

	@Query(nativeQuery = true, value = "INSERT INTO public.category(\r\n"
			+ "        active, create_by, create_date, initial, name)\r\n" + "        VALUES (" + ":#{#dto.active}, "
			+ ":#{#dto.create_by}," + ":createDate, " + ":#{#dto.initial}, " + ":#{#dto.name}) returning id")
	public Long insert2(@Param("dto") CategoryDTO dto, @Param("createDate") Date createDate);

	// UPDATE
	// gunakan Cara ini saja => Update menggunakan Native Query
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update category\r\n" + "set initial = :#{#dto.initial}, "
			+ "name = :#{#dto.name}, " + "active = :#{#dto.active}, " + "modify_by = :#{#dto.modify_by} , "
			+ "modify_date = :modifyDate\r\n" + "where id = :#{#dto.id}")

	public void update(@Param("dto") CategoryDTO dto, @Param("modifyDate") Date modifyDate);

	// DELETE
	// Cara 2 => Delete dengan nativeQuery

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "delete from category\r\n" + "where id = :id")
	public void delete(@Param("id") Long id);

	// QUERY UNTUK VALIDASI

	// VALIDASI INSERT
	// Validasi apakah initial sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select initial from category " + "where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);

	// Validasi apakah initial sudah ada di DB
	@Query(nativeQuery = true, value = "select exists (select name from category " + "where name = :name)")
	public Boolean isNameExists(@Param("name") String name);
	

	// VALIDASI UPDATE
	// Validasi apakah initial sudah sama dan bukan dari id yg sama
	@Query(nativeQuery = true, value = "select exists (select initial from category \r\n"
			+ "			where initial = :initial  AND id != :id )")
	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);

	// Validasi apakah Name sudah sama dan bukan dari id yg sama
	@Query(nativeQuery = true, value = "select exists (select name from category "
			+ "where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);
	
	
	// VALIDASI DELETE
	// Validasi apakah Name sudah sama dan bukan dari id yg sama
	@Query(nativeQuery = true, 
			value =   "select exists (select * from variant where category_id = :id)")
	public Boolean isCategoryUseByVariant(@Param("id") Long id);

}
