package id.bootcamp.java310.pos.repositories;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

	// Cara 2 + Query dasar + sedikit Custom
	// Kelemahan cara 2
	// 1. Query tidak boleh ada join
	// 2. Select harus *
	// 3. Table harus sesuai repository
	@Query(nativeQuery = true, value = "select * from category order by name asc")
	public List<CategoryEntity> getAllNameAsc();

	// Cara 3 - Query lebih lengkap
	@Query(nativeQuery = true, value = "select \r\n" + "        id,\r\n" + "        initial,\r\n" + "        name,\r\n"
			+ "        active\r\n" + "from category\r\n" + "order by initial asc")
	public List<Tuple> getAllCategories3();
	
	//Cara 4 - Query lebih lengkap, didefinisikan dulu
	@Query(nativeQuery = true, name = "get_categories_cara4")
	public List<CategoryDTO> getAllCategories4();
	
	//Cara 5 - Java Persistence Query Language (JPQL)
	//Querynya Java
	@Query(value = "select new "
			+ "id.bootcamp.java310.pos.dto.CategoryDTO(id, initial, name, active) "
			+ "from CategoryEntity")
	public List<CategoryDTO> getAllCategories5();
}
