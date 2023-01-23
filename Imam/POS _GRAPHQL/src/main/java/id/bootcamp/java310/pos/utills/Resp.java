package id.bootcamp.java310.pos.utills;

import com.fasterxml.jackson.annotation.JsonInclude;

//Mengemas Response API dari CRUD
//Saat mengemas jangan sentuh lagi service, repository,entity
// <T> generic clas 

//Hilangkan balikan not null
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resp<T> {
	
	private int code;
	private String message;
	private T data;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
	
	

}
