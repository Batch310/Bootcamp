package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;

@Repository
public interface VariantRepository extends JpaRepository<VariantEntity, Long> {

	@Query(nativeQuery = true,
			value = "INSERT INTO public.variant(\r\n"
					+ "        active, category_id, create_by, create_date, initial, name)\r\n"
					+ "        VALUES (true, "
					+ ":#{#dto.active}, "
					+ ":#{#dto.category_id}, "
					+ ":#{#dto.create_by}, "
					+ ":createDate"
					+ ":#{#dto.initial}, "
					+ ":#{#dto.name}) returning id")
	
	public Long insertVariant(@Param("dto")CategoryDTO dto,
						@Param("createDate")Date createDate);
}
