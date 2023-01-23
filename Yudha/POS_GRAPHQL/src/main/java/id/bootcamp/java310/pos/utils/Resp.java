package id.bootcamp.java310.pos.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

// Mengemas Response API dari CRUD
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resp<T> { // T Generic class : data yg belum ditentukan
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
