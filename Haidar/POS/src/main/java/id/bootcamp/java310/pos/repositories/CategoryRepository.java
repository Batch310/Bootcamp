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
	
//	@Query(nativeQuery = true,
//		    value = "select * from category order by name asc"
//			)
//	public List<CategoryEntity> getAllNameAsc();
	
	//Cara 3 - Query Lebih Lengkap
//	@Query(nativeQuery = true,
//			value = "select id, initial, name, active from category order by initial asc;"
//			) 
//	public List<Tuple> getAll3();
	
	//Cara 4 - Query Lebih Lengkap, Didefinisikan Dulu - Step 1
	@Query(nativeQuery = true, name = "get_categories_cara4")
	public List<CategoryDTO> getAll4();
	
	//Query fungsi SEARCH - Step 2
	@Query(nativeQuery = true, name = "search_category")
	public List<CategoryDTO> searchCategory(@Param("keyword") String keyword);
	
	//Query fungsi PAGINATION - Step 2
	@Query(nativeQuery = true, name = "pagination_category")
	public List<CategoryDTO> paginationCategory(@Param("keyword") String keyword, @Param("limit") int limit, @Param("offset") int offset);
	
	//Cara 5 - Menggunakan Java Persistence Query Language (JPQL) - Step 1
	//Querynya Java
	//Select new alamat.nama_class(kolom yang ingin di select) from Entity. Catatan: Harus ada Constructor dulu pada DTO terkait 
//	@Query(value = "select new id.bootcamp.java310.pos.dto.CategoryDTO(id,initial,name,active) from CategoryEntity order by initial asc")
//	public List<CategoryDTO> getAll5();
	
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
	
	// Query Untuk Validasi
	// Ketika insert initial yang sudah ada pada database
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT initial " 
			+ "from category "
			+ "where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);

	// Ketika insert name yang sudah ada pada database
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT name " 
			+ "from category " 
			+ "where name = :name)")
	public Boolean isNameExists(@Param("name") String name);

	// Ketika update initial yang sudah ada pada database dengan id yang tidak sama
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT initial " 
			+ "from category "
			+ "where initial = :initial AND id != :id)")
	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);

	// Ketika update name yang sudah ada pada database dengan id yang tidak sama
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT name " 
			+ "from category "
			+ "where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);
	
	// Ketika delete id yang tidak ada
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT * " 
			+ "from variant " 
			+ "where category_id = :id)")
	public Boolean isCategoryUsedByVariant(@Param("id") Long id);
	
	//Get total data pada tabel category
	@Query(nativeQuery = true, value = "select count(*) from category where name ilike '%'|| :keyword ||'%'")
	public int countTotalData(@Param("keyword") String keyword);
}
