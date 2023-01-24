package id.bootcamp.java310.pos.repositories;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.ProductDTO;
import id.bootcamp.java310.pos.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update product\r\n"
			+ "set variant_id = :#{#dto.variant_id},\r\n"
			+ "initial = :#{#dto.initial},\r\n"
			+ "name = :#{#dto.name},\r\n"
			+ "description = :#{#dto.description},\r\n"
			+ "price = :#{#dto.price},\r\n"
			+ "stock = :#{#dto.stock},\r\n"
			+ "active = :#{#dto.active},\r\n"
			+ "modify_by = :#{#dto.create_by},\r\n"
			+ "create_by = :modifyDate\r\n"
			+ "where id = :#{#dto.id}")
	public void updateItem(@Param("dto") ProductDTO dto, @Param("modifyDate") Date modifyDate);
	
	@Query(nativeQuery = true, 
			value = "select * from product where initial ilike '%'|| :keyword ||'%' OR name ilike '%'|| :keyword ||'%' OR description ilike '%'|| :keyword ||'%' limit 3")
	public List<Product> searchProducts(@Param("keyword") String keyword);
	
	// QUERY UNTUK VALIDASI
	// Validasi apakah Initial sudah ada di DB
	@Query(nativeQuery = true, value = "select exists(select * from product where initial = :initial)")
	public Boolean isInitialExists(@Param("initial") String initial);

	// Validasi apakah name sudah ada di DB
	@Query(nativeQuery = true, value = "select exists(select * from product where name = :name)")
	public Boolean isNameExists(@Param("name") String name);

	// Validasi apakah initial sudah sama dan bukan dari id yg sama
	@Query(nativeQuery = true, value = "select exists(select * from product where initial = :initial AND id != :id)")
	public Boolean isInitialExists(@Param("initial") String initial, @Param("id") Long id);

	// Validasi apakah name sudah ada di DB dan bukan dari id yang sama
	@Query(nativeQuery = true, value = "select exists(select * from product where name = :name AND id != :id)")
	public Boolean isNameExists(@Param("name") String name, @Param("id") Long id);

	// Validasi apakah id product dipakai di order_detail
	@Query(nativeQuery = true, value = "select exists(select * from order_detail where product_id = :id)")
	public Boolean isProductUsedByOrderDetail(@Param("id") Long id);

	// Validasi apakah category yang mau diinsert ada
	@Query(nativeQuery = true, value = "select exists(select * from variant where id = :id)")
	public Boolean isVariantExists(@Param("id") Long id);

}
