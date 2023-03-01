package sia.project.entities;

import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JadwalPelajaranEntity")
public class JadwalPelajaranEntity extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 11)
	private Long mata_pelajaran_id;
	
	@Column(length = 11)
	private Long tahun_akademik_id;
	
	@Column(length = 11)
	private Long wali_kelas_id;
	
	@Column(length = 11)
	private Long guru_id;
	
	@Column(length = 10)
	private String hari;
	
	@JsonFormat(pattern = "HH:mm", timezone = "Asia/Jakarta")
	private Time jam_mulai;
	
	@JsonFormat(pattern = "HH:mm", timezone = "Asia/Jakarta")
	private Time jam_selesai;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMata_pelajaran_id() {
		return mata_pelajaran_id;
	}

	public void setMata_pelajaran_id(Long mata_pelajaran_id) {
		this.mata_pelajaran_id = mata_pelajaran_id;
	}

	public Long getTahun_akademik_id() {
		return tahun_akademik_id;
	}

	public void setTahun_akademik_id(Long tahun_akademik_id) {
		this.tahun_akademik_id = tahun_akademik_id;
	}

	public Long getWali_kelas_id() {
		return wali_kelas_id;
	}

	public void setWali_kelas_id(Long wali_kelas_id) {
		this.wali_kelas_id = wali_kelas_id;
	}

	public Long getGuru_id() {
		return guru_id;
	}

	public void setGuru_id(Long guru_id) {
		this.guru_id = guru_id;
	}

	public String getHari() {
		return hari;
	}

	public void setHari(String hari) {
		this.hari = hari;
	}

	public Time getJam_mulai() {
		return jam_mulai;
	}

	public void setJam_mulai(Time jam_mulai) {
		this.jam_mulai = jam_mulai;
	}

	public Time getJam_selesai() {
		return jam_selesai;
	}

	public void setJam_selesai(Time jam_selesai) {
		this.jam_selesai = jam_selesai;
	}
	
	
}
