package sia.project.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "siswa")
public class SiswaEntity extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 20)
	private Long id;
	
	private String foto;
	
	@Column(length = 20)
	private String nis;
	
	@Column(length = 20)
	private String nisn;
	
	@Column(length = 255)
	private String nama_lengkap;
	
	@Column(length = 255)
	private String nama_panggilan;
	
	@Column(length = 255)
	private String tempat;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm",
			timezone = "Asia/Jakarta")
	private Date tanggal_lahir;
	
	@Column(length = 50)
	private String jenis_kelamin;
	
	@Column(length = 50)
	private String agama;
	
	@Column(length = 13)
	private String no_telp;
	
	@Column(length = 100)
	private String email;
	
	private String alamat;
	
	@Column(length = 11)
	private Long jurusan_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getNisn() {
		return nisn;
	}

	public void setNisn(String nisn) {
		this.nisn = nisn;
	}

	public String getNama_lengkap() {
		return nama_lengkap;
	}

	public void setNama_lengkap(String nama_lengkap) {
		this.nama_lengkap = nama_lengkap;
	}

	public String getNama_panggilan() {
		return nama_panggilan;
	}

	public void setNama_panggilan(String nama_panggilan) {
		this.nama_panggilan = nama_panggilan;
	}

	public String getTempat() {
		return tempat;
	}

	public void setTempat(String tempat) {
		this.tempat = tempat;
	}

	public Date getTanggal_lahir() {
		return tanggal_lahir;
	}

	public void setTanggal_lahir(Date tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}

	public String getJenis_kelamin() {
		return jenis_kelamin;
	}

	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}

	public String getAgama() {
		return agama;
	}

	public void setAgama(String agama) {
		this.agama = agama;
	}

	public String getNo_telp() {
		return no_telp;
	}

	public void setNo_telp(String no_telp) {
		this.no_telp = no_telp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Long getJurusan_id() {
		return jurusan_id;
	}

	public void setJurusan_id(Long jurusan_id) {
		this.jurusan_id = jurusan_id;
	}
	
	
	
}
