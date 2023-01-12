package id.bootcamp.java310.pos.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

//Berfungsi mengemas Response API dari CRUD
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Responses<T> { //<T> adalah generic class, tipe data belum ditentukan. Bisa lebih dari satu, misal <T,U>
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
