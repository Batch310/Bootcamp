package id.bootcamp.java310.pos.repositories;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;

@Repository
public interface VariantRepository extends JpaRepository<VariantEntity, Long> {

//Insert
	@Query(nativeQuery = true, value = "INSERT INTO public.variant(\r\n"
			+ "        active, "
			+ "category_id, "
			+ "create_by, "
			+ "create_date, "
			+ "initial, name)\r\n" 
			+ "        "
			+ "VALUES ("
			+ ":#{#vro.active}, " 
			+ ":#{#vro.category_id}, " 
			+ ":#{#vro.create_by}, " 
			+ ":createDate, "
			+ ":#{#vro.initial}, " 
			+ ":#{#vro.name}) returning id")
	public Long insert(@Param("vro") VariantDTO vro, @Param("createDate") Date createDate);

//update
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update variant\r\n" 
			+ "set category_id = :#{#vro.category_id}, "
			+ "initial = :#{#vro.initial}, " 
			+ "name = :#{#vro.name}, " 
			+ "active = :#{#vro.active}, "
			+ "modify_by = :#{#vro.modify_by}, " 
			+ "modify_date = :modifyDate\r\n" 
			+ "where id = :#{#vro.id}")

	public void update(@Param("vro") VariantDTO vro, @Param("modifyDate") Date modifyDate);

//delete
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "delete from variant\r\n" + "where id = :id")
	public void delete(@Param("id") Long id);
	
	
	
	
	//Validasi
	//select
	
	//jika initial 
	@Query(nativeQuery = true,
			value = "select exists(select initial "
					+ "from variant where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);
	
	@Query(nativeQuery = true,
			value = "select exists(select name "
					+ "from variant where name = :name)")
	public Boolean isNameExists(@Param("name") String name);
	
	@Query(nativeQuery = true,
			value = "select exists(select name "
					+ "from variant where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("name") String name,@Param("id") Long id);
	
	//update
	@Query(nativeQuery = true,
			value = "select exists(select initial "
					+ "from variant where initial = :initial and id != :id)")
	public Boolean isInitialExists(@Param("initial") String initial,@Param("id") Long id);
	
	@Query(nativeQuery = true,
			value = "select exists(select * from category where id = :id)")
	public Boolean isIdNotExists(@Param("id") Long id);
	
	
	//delete
	@Query(nativeQuery = true,
			value = "select exists(select * from product where variant_id = :id)"
			)
	public Boolean isCategoryUsedByVariant(@Param("id") Long id);

	
	
}





