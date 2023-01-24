package id.bootcamp.java310.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.entities.ProductEntity;

@Repository
public interface ProductRepositoryBackup extends JpaRepository<ProductEntity, Long> {

}
