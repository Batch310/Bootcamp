package com.example.dogservice.model.dto_for_crud.data_out;

import lombok.Data;

import java.util.List;

@Data
public class DogImageDTO {
    private List<String> message;
    private String status;
	public List<String> getMessage() {
		return message;
	}
	public void setMessage(List<String> message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
