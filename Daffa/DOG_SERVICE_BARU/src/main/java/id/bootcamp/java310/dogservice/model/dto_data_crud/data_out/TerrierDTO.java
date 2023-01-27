package id.bootcamp.java310.dogservice.model.dto_data_crud.data_out;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TerrierDTO {
	private Map<String, List<String>> message;
	private String status;

	public Map<String, List<String>> getMessage() {
		return message;
	}

	public void setMessage(Map<String, List<String>> message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
