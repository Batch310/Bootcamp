package day9.pagi;

public class Car extends Vehicle {

	String kemudi;

	public Car() {
		super();
	}
	
	public Car(String nama, String kemudi) {
		super(nama);
		this.kemudi = kemudi;
	}

	public Car(String nama) {
		super(nama);
		// TODO Auto-generated constructor stub
	}

	public void bukaJendela() {
		System.out.println("Buka Jendela");
	}
}
