package sia.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tahun_akademik")
public class TahunAkademikEntity extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 100)
	private String tahun_ajaran;
	
	private Long predikat_spiritual;
	
	private String semester;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTahun_ajaran() {
		return tahun_ajaran;
	}

	public void setTahun_ajaran(String tahun_ajaran) {
		this.tahun_ajaran = tahun_ajaran;
	}

	public Long getPredikat_spiritual() {
		return predikat_spiritual;
	}

	public void setPredikat_spiritual(Long predikat_spiritual) {
		this.predikat_spiritual = predikat_spiritual;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	
	
}
