package id.bootcamp.java310.dogservice.model.dto_data_crud.data_out;

import lombok.Data;

import java.util.List;

@Data
public class DogImageDTO {
	private List<String> message;
	private String status;

}
