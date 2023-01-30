package id.bootcamp.java310.dog_service.dto.crud;

import lombok.Data;

import java.util.List;

@Data
public class DogImageDTO {
    private List<String> message;
    private String status;
}
