package id.bootcamp.java310.dogservice.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class BreedNameDTO {
    private Map<String,List<String>> message;
    private String status;
}
