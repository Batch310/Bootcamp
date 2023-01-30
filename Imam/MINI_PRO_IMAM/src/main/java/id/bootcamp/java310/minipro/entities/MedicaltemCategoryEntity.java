package id.bootcamp.java310.minipro.entities;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import id.bootcamp.java310.minipro.dto.MedicalItemCategoryDto;



@NamedNativeQueries( value = {
				@NamedNativeQuery(
			name = "get_all_medical_item_category",
			query = "SELECT id, name\r\n"
					+ "	FROM public.m_medical_item_category\r\n",
			resultSetMapping = "get_all_medical_item_category_result"			
		)		
})
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(
		name = "get_all_medical_item_category_result",		
		classes = @ConstructorResult(
				targetClass = MedicalItemCategoryDto.class,
				columns = {
						@ColumnResult(name = "id", type = Long.class),
						@ColumnResult(name = "name", type = String.class),	
						
				}
				)		
				
		)		
})
@Entity
@Table(name = "m_medical_item_category")
public class MedicaltemCategoryEntity extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(length = 50)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
