package com.example.dogservice.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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

	
    
    
    
}
