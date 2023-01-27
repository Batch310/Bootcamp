package id.bootcamp.java310.dogservice.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Breeds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "breeds", cascade = CascadeType.ALL)
    private List<SubBreeds> subBreeds = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SubBreeds> getSubBreeds() {
		return subBreeds;
	}

	public void setSubBreeds(List<SubBreeds> subBreeds) {
		this.subBreeds = subBreeds;
	}
    
    

}
