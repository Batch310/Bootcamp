package id.bootcamp.java310.dog_service.dto.data_migration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BreedsDTO {
    private LinkedHashMap<Object, Object> message;
    private String status;
}
