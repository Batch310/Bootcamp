package id.bootcamp.java310.dogservice.model.dto_data_migration;

import java.util.LinkedHashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BreedsDTO {

	private LinkedHashMap<Object, Object> message;
	private String status;

}
