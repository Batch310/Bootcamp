package sia.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mata_pelajaran")
public class MataPelajaranEntity extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 11)
	private Long id;
	
	@Column(length = 100)
	private String nama;
	
	@Column(length = 11)
	private Long sub_katpenilaian_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Long getSub_katpenilaian_id() {
		return sub_katpenilaian_id;
	}

	public void setSub_katpenilaian_id(Long sub_katpenilaian_id) {
		this.sub_katpenilaian_id = sub_katpenilaian_id;
	}
	
	
}

