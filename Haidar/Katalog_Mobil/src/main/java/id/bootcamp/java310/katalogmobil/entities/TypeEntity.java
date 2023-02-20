package id.bootcamp.java310.katalogmobil.entities;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import id.bootcamp.java310.katalogmobil.dto.TypeDTO;
import lombok.Getter;
import lombok.Setter;

@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "get_all_types", query = "SELECT \r\n"
				+ "	id, \r\n"
				+ "	nama \r\n"
				+ "FROM public.type \r\n"
				+ "ORDER BY nama ASC; ", resultSetMapping = "get_all_types_result"),
		@NamedNativeQuery(name = "get_type_detail", query = "SELECT \r\n"
				+ "	t.id,\r\n"
				+ "	t.brand_id,\r\n"
				+ "	b.nama as nama_brand,\r\n"
				+ "	t.nama,\r\n"
				+ "	t.tahun,\r\n"
				+ "	t.harga,\r\n"
				+ "	t.kapasitas_kursi,\r\n"
				+ "	t.bahan_bakar,\r\n"
				+ "	t.transmisi,\r\n"
				+ "	t.url_foto_besar\r\n"
				+ "FROM public.brand b\r\n"
				+ "INNER JOIN public.type t\r\n"
				+ "	ON b.id = t.brand_id\r\n"
				+ "WHERE t.brand_id = :brand_id AND t.id = :id\r\n"
				+ "ORDER BY t.nama ASC;", resultSetMapping = "get_type_detail_result")
})
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(name = "get_all_types_result", classes = @ConstructorResult(targetClass = TypeDTO.class, columns = {
				@ColumnResult(name = "id", type = Long.class),
				@ColumnResult(name = "nama", type = String.class)
})),
		@SqlResultSetMapping(name = "get_type_detail_result", classes = @ConstructorResult(targetClass = TypeDTO.class, columns = {
				@ColumnResult(name = "id", type = Long.class), 
				@ColumnResult(name = "brand_id", type = Long.class),
				@ColumnResult(name = "nama_brand", type = String.class),
				@ColumnResult(name = "nama", type = String.class),
				@ColumnResult(name = "tahun", type = String.class),
				@ColumnResult(name = "harga", type = String.class),
				@ColumnResult(name = "kapasitas_kursi", type = String.class),
				@ColumnResult(name = "bahan_bakar", type = String.class),
				@ColumnResult(name = "transmisi", type = String.class),
				@ColumnResult(name = "url_foto_besar", type = String.class)
}))
})

@Getter
@Setter
@Entity
@Table(name = "type")
public class TypeEntity {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "brand_id", insertable = false, updatable = false)
	private BrandEntity brandEntity;
	
	private Long brand_id;
	
	@Column(unique = true)
	private String nama;
	
	private String tahun;
	
	private String harga;
	
	private String kapasitas_kursi;
	
	private String bahan_bakar;
	
	private String transmisi;
	
	private String url_foto_kecil;
	
	private String url_foto_besar;
	
}
