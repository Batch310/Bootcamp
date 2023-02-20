package id.bootcamp.java310.katalogmobil.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pesan")
public class PesanEntity {
	
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "brand_id", insertable = false, updatable = false)
	private BrandEntity brandEntity;
	
	private Long brand_id;

	@ManyToOne
	@JoinColumn(name = "type_id", insertable = false, updatable = false)
	private TypeEntity typeEntity;
	
	private Long type_id;
	
}
