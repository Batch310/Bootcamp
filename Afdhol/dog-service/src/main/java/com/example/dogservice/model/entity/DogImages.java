package com.example.dogservice.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DogImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String url;

    @ManyToOne
    private Breeds breeds;

    @ManyToOne
    private SubBreeds subBreeds;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Breeds getBreeds() {
		return breeds;
	}

	public void setBreeds(Breeds breeds) {
		this.breeds = breeds;
	}

	public SubBreeds getSubBreeds() {
		return subBreeds;
	}

	public void setSubBreeds(SubBreeds subBreeds) {
		this.subBreeds = subBreeds;
	}
    
    
    
    
}
