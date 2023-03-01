package sia.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "penilaian_pelajaran")
public class PenilaianPelajaranEntity extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 11)
	private Long wali_kelas_id;
	
	@Column(length = 11)
	private Long siswa_id;
	
	@Column(length = 11)
	private Long mata_pelajaran_id;
	
	@Column(length = 3)
	private Long nilai_uts;
	
	private String deskripsi;
	
	@Column(length = 3)
	private Long nilai_harian;
	
	@Column(length = 3)
	private Long nilai_uas;
	
	@Column(length = 3)
	private Long nilai_praktek;

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

	public Long getMata_pelajaran_id() {
		return mata_pelajaran_id;
	}

	public void setMata_pelajaran_id(Long mata_pelajaran_id) {
		this.mata_pelajaran_id = mata_pelajaran_id;
	}

	public Long getNilai_uts() {
		return nilai_uts;
	}

	public void setNilai_uts(Long nilai_uts) {
		this.nilai_uts = nilai_uts;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public Long getNilai_harian() {
		return nilai_harian;
	}

	public void setNilai_harian(Long nilai_harian) {
		this.nilai_harian = nilai_harian;
	}

	public Long getNilai_uas() {
		return nilai_uas;
	}

	public void setNilai_uas(Long nilai_uas) {
		this.nilai_uas = nilai_uas;
	}

	public Long getNilai_praktek() {
		return nilai_praktek;
	}

	public void setNilai_praktek(Long nilai_praktek) {
		this.nilai_praktek = nilai_praktek;
	}
	
	
}
