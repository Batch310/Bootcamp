package id.bootcamp.java310.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.entities.OrderHeaderEntity;

@Repository
public interface OrderHeaderRepository extends JpaRepository<OrderHeaderEntity, Long>{

	//Cek Digit tertinggi data di db
	@Query(nativeQuery = true, value = "SELECT MAX(ID) FROM ORDER_HEADER")
	public Long getLatestId();
	
}
