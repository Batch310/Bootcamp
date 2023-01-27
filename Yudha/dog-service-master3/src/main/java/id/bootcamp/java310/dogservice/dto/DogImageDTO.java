package id.bootcamp.java310.dogservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class DogImageDTO {
    private List<String> message;
    private String status;
}
