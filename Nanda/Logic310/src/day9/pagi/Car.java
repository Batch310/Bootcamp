package day9.pagi;

public class Car extends Vehicle {
	String kemudi;
	
	public Car() {
		
	}
	
	public Car(String nama, String kemudi) {
		super(nama);
		this.kemudi = kemudi;
	}



	public void bukaJendela() {
		System.out.println("Buka Jendela");
	}
}
