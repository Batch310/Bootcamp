package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;

public interface VariantRepository extends JpaRepository<VariantEntity, Long> {
	//READ Category
	//Cara 4
	@Query(nativeQuery = true, name = "get_all_categories")
	public List<VariantDTO> getAllVariants();
	
	//INSERT
	@Query(nativeQuery = true,
			value = "INSERT INTO public.variant "
					+ "(active, category_id, create_by, create_date, initial, name) VALUES "
					+ "(:#{#dto.active}, "
					+ ":#{#dto.category_id},"
					+ ":#{#dto.create_by}, "
					+ ":createDate, "
					+ ":#{#dto.initial}, "
					+ ":#{#dto.name}) returning id")
	public Long insert(@Param("dto") VariantDTO dto,
						  @Param("createDate") Date createDate);
	
	//UPDATE
	@Query(nativeQuery = true,
			value = "UPDATE PUBLIC.VARIANT\r\n"
					+ "SET CATEGORY_ID = :#{#dto.category_id}, "
					+ "INITIAL = :#{#dto.initial}, "
					+ "NAME = :#{#dto.name}, "
					+ "ACTIVE = :#{#dto.active}, "
					+ "MODIFY_BY = :#{#dto.modify_by}, "
					+ "MODIFY_DATE = :modifyDate\r\n"
					+ "WHERE ID = :#{#dto.id} returning id")
	public Long update(@Param("dto") VariantDTO dto,
						  @Param("modifyDate") Date modifyDate);
	
	//DELETE
	@Query(nativeQuery = true,
			value = "DELETE FROM PUBLIC.VARIANT\r\n"
					+ "WHERE ID = :id returning id")
	public Long delete(@Param("id") Long id);
	
	// Query untuk Validasi
	// Ketika insert initial yang sudah ada pada database
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT initial " 
			+ "from variant " 
			+ "where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);

	// Ketika insert name yang sudah ada pada database
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT name " 
			+ "from variant " 
			+ "where name = :name)")
	public Boolean isNameExists(@Param("name") String name);
	
	// Ketika insert/update Category id diisikan oleh category yang tidak ada
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT id " 
			+ "from category "
			+ "where id = :id)")
	public Boolean isCategoryExists(@Param("id") Long id);
	
	// Ketika update initial yang sudah ada pada database
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT initial " 
					+ "from variant " 
					+ "where initial = :initial AND id != :id")
	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);
	
	// Ketika update name yang sudah ada pada database
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT name " 
			+ "from variant " 
			+ "where name = :name AND id != :id")
	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);
	
	// Ketika delete id yang tidak ada
	@Query(nativeQuery = true, value = "SELECT EXISTS (SELECT * " 
			+ "from product " 
			+ "where variant_id = :id)")
	public Boolean isVariantUsedByProduct(@Param("id") Long id);
}
