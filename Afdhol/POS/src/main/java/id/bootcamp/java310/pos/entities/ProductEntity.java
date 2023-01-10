package id.bootcamp.java310.pos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {

@Id
@Column(nullable = false)
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@ManyToOne
@JoinColumn(name="variant_id",insertable = false,updatable = false)
private Variantentity variant;

@Column(name = "variant_id",nullable = false)
private Long variantId;

@Column(length = 10, name = "initial",nullable = false,unique = true)
private String initial;

@Column(length = 50, name = "name",nullable = false,unique = true)
private String name;

@Column(length = 500, name = "description",nullable = false)
private String description;

@Column(columnDefinition = "Decimal(18,2)",nullable = false)
private Double price;

@Column(columnDefinition = "Decimal(18,2)",nullable = false)
private Double stock;

@Column(nullable = false)
private Boolean active;

@Column(name = "create_by", length = 50,nullable = false)
private String createBy;

@Column(name="create_date",nullable = false)
private Date createDate;

@Column(name="modify_by",length = 50)
private String modifyBy;

@Column(name="modify_date")
private Date modifyDate;
	
}
