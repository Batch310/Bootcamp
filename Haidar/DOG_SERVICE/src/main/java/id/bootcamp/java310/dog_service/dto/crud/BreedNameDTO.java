package id.bootcamp.java310.dog_service.dto.crud;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class BreedNameDTO {
    private Map<String,List<String>> message;
    private String status;
}
