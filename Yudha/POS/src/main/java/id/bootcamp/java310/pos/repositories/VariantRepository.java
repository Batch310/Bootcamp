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
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.entities.VariantEntity;

@Repository
public interface VariantRepository extends JpaRepository<VariantEntity, Long> {
		//INSERT
		//Cara 2 - Insert memakai native query
	
		@Query(nativeQuery = true,
				value = "INSERT INTO public.variant(\r\n"
						+ "        active, category_id, create_by, create_date, initial, name)\r\n"
						+ "        VALUES (:#{#dto.active}, :#{#dto.category_id}, :#{#dto.create_by}, :createDate, :#{#dto.initial}, :#{#dto.name}) returning id")
		public Long insert2(@Param("dto") VariantDTO dto,
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
		
		
}
