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
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{ //Jpa memiliki fungsi query

	//Cara 2 = menggunakan Query biasa dengan tambhaan custom
	//memiliki dua kelemahan;
	//1. query tidak boleh join
	//2. select harus *
	//3. tabel harus sesuai repository
	@Query(nativeQuery = true, 
			value = "select * from category order by name asc"
			)
	public List<CategoryEntity> getAllNameAsc();
	
	//Cara 3 -Query lebih lengkap
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
	
	//Cara 4 - query lebih lengkap, didefinisikan dahulu
	@Query(nativeQuery = true,
			name = "get_categories_cara_4"
			)
	public List<CategoryDTO> getAll4();
	
	//SEARCH
	@Query(nativeQuery = true,
			name = "search_category"
			)
	public List<CategoryDTO> searchCategory(@Param ("keyword") String keywordku);
	
	//PAGINATION
	@Query(nativeQuery = true,
			name = "pagination_category"
			)
	public List<CategoryDTO> paginationCategory(@Param ("keyword") String keywordku, @Param ("limit") int limit, @Param ("offset")  int page );

	
	
	//Cara 5 - Java Persistence Query Language (JPQL)
	//merupakan query dari Java
	@Query(value = "select new id.bootcamp.java310.pos.dto.CategoryDTO(id,initial,name,active)"
			+ " from CategoryEntity")
	public List<CategoryDTO> getAll5();
	
	
	//INSERT
	//Cara 2 = insert menggunakan native query
	
	//Cara 2 memakai native
	@Query(nativeQuery = true,
			value = "INSERT INTO public.category(\r\n"
					+ "        active, create_by, create_date, initial, name)\r\n"
					+ "        VALUES ("
					+ ":#{#dto.active},"
					+ ":#{#dto.create_by}, "
					+ ":createDate, "
					+ ":#{#dto.initial}, "
					+ ":#{#dto.name}) returning id"
			)
	public Long insert2(@Param("dto") CategoryDTO dto,
						  @Param("createDate") Date createDate);
	
	//UPDATE
	//Cara  1 update menggunaan native query
	@Modifying
	@Transactional 
	@Query(nativeQuery = true,
			value = "update category\r\n"
					+ "set initial = :#{#dto.initial}, "
					+ "name = :#{#dto.name}, "
					+ "active = :#{#dto.active}, "
					+ "modify_by = :#{#dto.modify_by}, "
					+ "modify_date = :modifyDate\r\n"
					+ "where id = :#{#dto.id}"
					)
	
	public void update(@Param("dto") CategoryDTO dto,
	  					@Param("modifyDate") Date modifyDate);
	
	//DELETE
	//CARA 2 MENGGUNAKAN NATIVE QUERY
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
				value= "delete from category\r\n"
						+ "where id = :id"
			)
	public void delete(@Param("id") Long id);
	
	
	//QUERY untuk VALIDASI
	
	//validasi apakah initial sudah ada di db
		
	@Query(nativeQuery = true,
			value = "select exists(select initial "
					+ "from category where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);
	
	
	@Query(nativeQuery = true,
			value = "select exists(select name "
					+ "from category where name = :name)")
	public Boolean isNameExists(@Param("name") String name);
	
	//Validasi apakah name sudah ada di DB dan bukan dari id yang sama
	//validasi update
	@Query(nativeQuery = true,
			value = "select exists(select name "
					+ "from category where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("name") String name,@Param("id") Long id);
	
	@Query(nativeQuery = true,
			value = "select exists(select initial "
					+ "from category where initial = :initial and id != :id)")
	public Boolean isInitialExists(@Param("initial") String initial,@Param("id") Long id);
	
	//Membuat validasi apakah id category dipakai di variant
	//delete
	@Query(nativeQuery = true,
			value = "select exists(select * from variant where category_id = :id)"
			)
	public Boolean isCategoryUsedByVariant(@Param("id") Long id);

	
	//get count semua data category
	@Query(nativeQuery = true,
			value = "select count(*) from category where name ilike '%' || :keyword || '%'"
			)
	public int countTotalData(@Param ("keyword") String keyword);
}
