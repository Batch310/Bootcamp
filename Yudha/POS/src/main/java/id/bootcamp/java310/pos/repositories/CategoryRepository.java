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
	
	//Cara 2 - Query dasar + sedikit Custom
	// Kelemahan Cara 2 :
	// 1. Query tdk boleh join
	// 2. select harus *List<CategoryEntity> findByActive(Boolean active)
	// 3. tabelnya harus sesuai repository
	@Query(nativeQuery = true,
			value = "select * from category order by name asc"
			)
	public List<CategoryEntity> getAllNameAsc();
	
	// Cara 3 - Query Lebih Lengkap
	@Query(nativeQuery = true,
			value = "select \r\n"
					+ "        id,\r\n"
					+ "        initial,\r\n"
					+ "        name,\r\n"
					+ "        active\r\n"
					+ "from category\r\n"
					+ "order by initial asc"
			)
	public List<Tuple> getAll3();
	
	// Cara 4 - Query Lebih Lengkap, didefinisikan dulu
	@Query(nativeQuery = true,
			name = "get_categories_cara4"
			)
	public List<CategoryDTO> getAll4();
		
	// Cara 5 - Menggunakan  Java Resistence Query Language (JPLQ)
	@Query(value = "select new"
			+ " id.bootcamp.java310.pos.dto.CategoryDTO(id,initial,name,active)"
			+ " from CategoryEntity order by initial asc")
	public List<CategoryDTO> getAll5();
	
	//INSERT
	//Cara 2 - Insert memakai native query
	@Query(nativeQuery = true,
			value = "INSERT INTO public.category(\r\n"
					+ "        active, create_by, create_date, initial, name)\r\n"
					+ "        VALUES (:#{#dto.active}, :#{#dto.create_by}, :createDate, :#{#dto.initial}, :#{#dto.name}) returning id")
	public Long insert2(@Param("dto") CategoryDTO dto,
						@Param("createDate") Date createDate);
	
	// UPDATE
	// CARA 1 - Update Menggunakan Naive Query
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
			value = "update category\r\n"
					+ "set initial = :#{#dto.initial}, name = :#{#dto.name}, active = :#{#dto.active}, modify_by = :#{#dto.modify_by}, modify_date = :modifyDate\r\n"
					+ "where id = :#{#dto.id}")
	public void update(@Param("dto") CategoryDTO dto,
						@Param("modifyDate") Date createDate);
	
	//DELETE
	//CARA 2 - DELETE menggunakan Native Query
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
			value = "delete from category\r\n"
					+ "where id = :id")
	public void delete(@Param("id") Long id);
}
