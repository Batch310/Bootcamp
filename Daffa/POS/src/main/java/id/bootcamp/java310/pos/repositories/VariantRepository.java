package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

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

	@Query(nativeQuery = true, value = "INSERT INTO public.variant(\r\n"
			+ "        active, category_id, create_by, create_date, initial, name)\r\n" + "        VALUES ("
			+ ":#{#dto.active}, " + ":#{#dto.category_id}, " + ":#{#dto.create_by}, " + ":createDate, "
			+ ":#{#dto.initial}, " + ":#{#dto.name}) returning id")
	public Long insertVar(@Param("dto") VariantDTO dto, @Param("createDate") Date createDate);

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update variant\r\n" + "set category_id = :#{#dto.category_id}, "
			+ "initial = :#{#dto.initial}, " + "name = :#{#dto.name}, " + "active = :#{#dto.active}, "
			+ "modify_by = :#{#dto.modify_by}, " + "modify_date = :modifyDate\r\n" + "where id = :#{#dto.id}")
	public void updateVar(@Param("dto") VariantDTO dto, @Param("modifyDate") Date modifyDate);

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "delete from variant\r\n" + "where id = :id")
	public void delete(@Param("id") Long id);

	// SEARCH
	@Query(nativeQuery = true, name = "search_variant")
	public List<VariantDTO> searchVariant(@Param("keyword") String keyword);

	// Validasi apakah initial sudah ada di DB (Huruf Besar/Kecil diperhatikan) -
	// insert
	@Query(nativeQuery = true, value = "select exists (select initial from variant where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);

	// Validasi apakah name sudah ada di DB (Huruf Besar/Kecil diperhatikan) -
	// insert
	@Query(nativeQuery = true, value = "select exists (select name from variant where initial = :name)")
	public Boolean isNameExists(@Param("name") String name);

	// Validasi apakah initial sudah sama dan bukan dari id yang sama - update
	@Query(nativeQuery = true, value = "select exists (select initial from variant where initial = :initial AND id != :id)")
	public Boolean isInitialExists(@Param("id") Long id, @Param("initial") String initial);

	// Validasi apakah name sudah sama dan bukan dari id yang sama - update
	@Query(nativeQuery = true, value = "select exists (select initial from variant where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("id") Long id, @Param("name") String name);

	// Validasi apakah id variant dipakai di product
	@Query(nativeQuery = true, value = "select exists (select * from product where variant_id = :id)")
	public Boolean isVariantIdUsedByProduct(@Param("id") Long id);

	@Query(nativeQuery = true, value = "select exists (select id from category where id = :id)")
	public Boolean isCategoryExists(@Param("id") Long id);
}
