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
	@Query(value = "select new id.bootcamp.java310.pos.dto.VariantDTO(id, category_id, category_name, initial, name, active) from VariantEntity")
	public List<VariantDTO> getCategory();
	
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

}
