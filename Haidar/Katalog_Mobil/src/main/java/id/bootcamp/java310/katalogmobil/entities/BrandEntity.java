package id.bootcamp.java310.katalogmobil.entities;

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

import id.bootcamp.java310.katalogmobil.dto.BrandDTO;
import id.bootcamp.java310.katalogmobil.dto.TypeDTO;
import lombok.Getter;
import lombok.Setter;

@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "get_all", query = "SELECT \r\n"
				+ "	t.id,\r\n"
				+ "	t.brand_id,	\r\n"
				+ "	b.nama as nama_brand,\r\n"
				+ "	t.nama,\r\n"
				+ "	t.tahun,\r\n"
				+ "	t.harga,\r\n"
				+ "	t.url_foto_kecil\r\n"
				+ "FROM public.brand b\r\n"
				+ "INNER JOIN public.type t\r\n"
				+ "	ON b.id = t.brand_id\r\n"
				+ "ORDER BY t.nama ASC;", resultSetMapping = "get_all_result"),
		@NamedNativeQuery(name = "get_all_brand", query = "SELECT * FROM public.brand ORDER BY nama ASC;", resultSetMapping = "get_all_brand_result")
})
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(name = "get_all_result", classes = @ConstructorResult(targetClass = TypeDTO.class, columns = {
				@ColumnResult(name = "id", type = Long.class), 
				@ColumnResult(name = "brand_id", type = Long.class),
				@ColumnResult(name = "nama_brand", type = String.class),
				@ColumnResult(name = "nama", type = String.class),
				@ColumnResult(name = "tahun", type = String.class),
				@ColumnResult(name = "harga", type = String.class),
				@ColumnResult(name = "url_foto_kecil", type = String.class)
})),
		@SqlResultSetMapping(name = "get_all_brand_result", classes = @ConstructorResult(targetClass = BrandDTO.class, columns = {
				@ColumnResult(name = "id", type = Long.class), 
				@ColumnResult(name = "nama", type = String.class)
}))
})

@Getter
@Setter
@Entity
@Table(name = "brand")
public class BrandEntity {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String nama;
	
}
