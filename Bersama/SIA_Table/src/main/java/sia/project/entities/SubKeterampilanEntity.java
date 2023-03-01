package sia.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sub_keterampilan")
public class SubKeterampilanEntity extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 11)
	private Long kategori_penilaian_id;
	
	@Column(length = 100)
	private String nama;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getKategori_penilaian_id() {
		return kategori_penilaian_id;
	}

	public void setKategori_penilaian_id(Long kategori_penilaian_id) {
		this.kategori_penilaian_id = kategori_penilaian_id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	
	
}
