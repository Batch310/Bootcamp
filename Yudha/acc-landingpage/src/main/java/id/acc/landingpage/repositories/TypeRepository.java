package id.acc.landingpage.repositories;

import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.acc.landingpage.dto.BrandDTO;
import id.acc.landingpage.dto.TypeDTO;
import id.acc.landingpage.entities.Brand;



@Repository
public interface TypeRepository extends JpaRepository<Brand, Long> {
	@Query(nativeQuery = true, name = "get_type")
	public List<TypeDTO> getAllType();
	
}
