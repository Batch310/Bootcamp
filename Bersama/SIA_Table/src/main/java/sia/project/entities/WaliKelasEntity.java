package sia.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wali_kelas")
public class WaliKelasEntity extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 11)
	private Long kelas_id;
	
	@Column(length = 11)
	private Long tahun_akademik_id;
	
	@Column(length = 11)
	private Long guru_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getKelas_id() {
		return kelas_id;
	}

	public void setKelas_id(Long kelas_id) {
		this.kelas_id = kelas_id;
	}

	public Long getTahun_akademik_id() {
		return tahun_akademik_id;
	}

	public void setTahun_akademik_id(Long tahun_akademik_id) {
		this.tahun_akademik_id = tahun_akademik_id;
	}

	public Long getGuru_id() {
		return guru_id;
	}

	public void setGuru_id(Long guru_id) {
		this.guru_id = guru_id;
	}
	
	
	
}
