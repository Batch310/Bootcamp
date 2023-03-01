package sia.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "kelas")
public class KelasEntity extends BaseProperties{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 50)
	private String nama_kelas;
	
	@Column(length = 11)
	private Long jurusan_id;
	
	@Column(length = 50)
	private String jurusan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama_kelas() {
		return nama_kelas;
	}

	public void setNama_kelas(String nama_kelas) {
		this.nama_kelas = nama_kelas;
	}

	public Long getJurusan_id() {
		return jurusan_id;
	}

	public void setJurusan_id(Long jurusan_id) {
		this.jurusan_id = jurusan_id;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	
}
