package id.bootcamp.java310.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.entities.VariantEntity;

@Repository
public interface VariantRepository extends JpaRepository<VariantEntity, Long> {

}
