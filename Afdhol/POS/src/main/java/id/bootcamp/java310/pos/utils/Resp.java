package id.bootcamp.java310.pos.utils;

//class Respon
//Mengemas Response API dari CRUD
public class Resp<T> { //generic class <T>, tipe data yang belum ditentukan
	
	private int code;
	private String message;
	private T data; //data yang dinamis
	
	
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
