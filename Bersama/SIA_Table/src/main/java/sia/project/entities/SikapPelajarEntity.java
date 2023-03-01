package sia.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sikap_pelajar")
public class SikapPelajarEntity extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 11)
	private Long predikat_spiritual;
	
	private String keterangan_spiritual;
	
	@Column(length = 11)
	private Long predikat_sosial;
	
	private String keterangan_sosial;
	
	@Column(length = 11)
	private Long siswa_id;
	
	@Column(length = 11)
	private Long wali_kelas_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPredikat_spiritual() {
		return predikat_spiritual;
	}

	public void setPredikat_spiritual(Long predikat_spiritual) {
		this.predikat_spiritual = predikat_spiritual;
	}

	public String getKeterangan_spiritual() {
		return keterangan_spiritual;
	}

	public void setKeterangan_spiritual(String keterangan_spiritual) {
		this.keterangan_spiritual = keterangan_spiritual;
	}

	public Long getPredikat_sosial() {
		return predikat_sosial;
	}

	public void setPredikat_sosial(Long predikat_sosial) {
		this.predikat_sosial = predikat_sosial;
	}

	public String getKeterangan_sosial() {
		return keterangan_sosial;
	}

	public void setKeterangan_sosial(String keterangan_sosial) {
		this.keterangan_sosial = keterangan_sosial;
	}

	public Long getSiswa_id() {
		return siswa_id;
	}

	public void setSiswa_id(Long siswa_id) {
		this.siswa_id = siswa_id;
	}

	public Long getWali_kelas_id() {
		return wali_kelas_id;
	}

	public void setWali_kelas_id(Long wali_kelas_id) {
		this.wali_kelas_id = wali_kelas_id;
	}
	
	
	
}
