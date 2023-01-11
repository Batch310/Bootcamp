package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	
	//READ
	//Cara 2 - Query dasar + Sedikit custom
	//Kelemahan:
	//1. Query tidak boleh ada join tabel
	//2. Select harus bintang
	//3. Tabel harus sesuai repository
	
	@Query(nativeQuery = true,
		    value = "select * from category order by name asc"
			)
	public List<CategoryEntity> getAllNameAsc();
	
	//Cara 3 - Query Lebih Lengkap
	@Query(nativeQuery = true,
			value = "select id, initial, name, active from category order by initial asc;"
			) 
	public List<Tuple> getAll3();
	
	//Cara 4 - Query Lebih Lengkap, Didefinisikan Dulu - Step 1
	@Query(nativeQuery = true, name = "get_categories_cara4")
	public List<CategoryDTO> getAll4();
	
	//Cara 5 - Menggunakan Java Persistence Query Language (JPQL) - Step 1
	//Querynya Java
	//Select new alamat.nama_class(kolom yang ingin di select) from Entity. Catatan: Harus ada Constructor dulu pada DTO terkait 
	@Query(value = "select new id.bootcamp.java310.pos.dto.CategoryDTO(id,initial,name,active) from CategoryEntity order by initial asc")
	public List<CategoryDTO> getAll5();
	
	//INSERT/CREATE
	//Cara 2 - Insert menggunakan native query - Step 1
	@Query(nativeQuery = true,
			value = "INSERT INTO public.category "
					+ "(active, create_by, create_date, initial, name) VALUES "
					+ "(:#{#dto.active}, "
					+ ":#{#dto.create_by}, "
					+ ":createDate, "
					+ ":#{#dto.initial}, "
					+ ":#{#dto.name}) returning id")
	public Long insert2(@Param("dto") CategoryDTO dto,
						  @Param("createDate") Date createDate);
	
	//UPDATE
	//Cara 1 - Update menggunakan Native Query
	@Modifying //Query untuk mengubah data yang tidak membalikkan data atau mengirim return value
	@Transactional
	@Query(nativeQuery = true,
			value = "update category\r\n"
					+ "set initial = :#{#dto.initial}, "
					+ "name = :#{#dto.name}, "
					+ "active = :#{#dto.active}, "
					+ "modify_by = :#{#dto.modify_by}, "
					+ "modify_date = :modifyDate\r\n"
					+ "where id = :#{#dto.id}")
	public void update(@Param("dto") CategoryDTO dto,
			  @Param("modifyDate") Date modifyDate);
	
	//DELETE
	//Cara 2 - Menggunakan Native Query - Step 1
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
			value = "delete from category\r\n"
					+ "where id = :id")
	public void delete(@Param("id") Long id);
}
