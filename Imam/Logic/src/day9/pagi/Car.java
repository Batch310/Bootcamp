package day9.pagi;


// extend => sub class(anak super class)
public class Car extends Vehicle {  

	String kemudi;
	
	public Car () {
	
	}
	
	public void bukaJendela() {
		
		System.out.println("Buka jendela");	
	}

	public Car(String nama, String kemudi) {
		super(nama);
		this.kemudi = kemudi;
	}
	
	
	
	
	
	
}
