package sia.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "catatan_pelajar")
public class CatatanPelajarEntity extends BaseProperties{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 11)
	private Long wali_kelas_id;
	
	@Column(length = 11)
	private Long siswa_id;
	
	private String catatan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getWali_kelas_id() {
		return wali_kelas_id;
	}

	public void setWali_kelas_id(Long wali_kelas_id) {
		this.wali_kelas_id = wali_kelas_id;
	}

	public Long getSiswa_id() {
		return siswa_id;
	}

	public void setSiswa_id(Long siswa_id) {
		this.siswa_id = siswa_id;
	}

	public String getCatatan() {
		return catatan;
	}

	public void setCatatan(String catatan) {
		this.catatan = catatan;
	}
	

}
