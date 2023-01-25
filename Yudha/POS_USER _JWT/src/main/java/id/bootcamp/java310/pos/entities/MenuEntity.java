package id.bootcamp.java310.pos.entities;

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

import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.dto.UserDTO;

@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "menu_query", query = 
				"select \r\n"
				+ "        m.name,\r\n"
				+ "                m.url\r\n"
				+ "from menu m \r\n"
				+ "join menu_role mr\r\n"
				+ "        on m.id = mr.menu_id\r\n"
				+ "join role r\r\n"
				+ "        on mr.role_id = r.id\r\n"
				+ "where r.code = :role_code", 
				resultSetMapping = "menu_result") })
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(name = "menu_result", classes = @ConstructorResult(targetClass = MenuDTO.class, columns = {
				@ColumnResult(name = "name", type = String.class),
				@ColumnResult(name = "url", type = String.class),
				})) })


@Entity
@Table(name = "menu")
public class MenuEntity extends BaseProperties{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(length = 20)
	private String name;
	
	@Column(length = 50)
	private String url;
	
	private Long parent_id;
	
	@Column(length = 100)
	private String big_icon;
	
	@Column(length = 100)
	private String small_icon;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getParent_id() {
		return parent_id;
	}

	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}

	public String getBig_icon() {
		return big_icon;
	}

	public void setBig_icon(String big_icon) {
		this.big_icon = big_icon;
	}

	public String getSmall_icon() {
		return small_icon;
	}

	public void setSmall_icon(String small_icon) {
		this.small_icon = small_icon;
	}
	
	
}
