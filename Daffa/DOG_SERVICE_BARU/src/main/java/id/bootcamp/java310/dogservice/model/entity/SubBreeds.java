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
public class SubBreeds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    private Breeds breeds;

    @OneToMany(mappedBy = "subBreeds", cascade = CascadeType.ALL)
    private List<DogImages> dogImages = new ArrayList<>();

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

	public Breeds getBreeds() {
		return breeds;
	}

	public void setBreeds(Breeds breeds) {
		this.breeds = breeds;
	}

	public List<DogImages> getDogImages() {
		return dogImages;
	}

	public void setDogImages(List<DogImages> dogImages) {
		this.dogImages = dogImages;
	}
    
    

}
