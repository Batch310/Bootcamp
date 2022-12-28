package day9.pagi;

public class Car  extends Vehicle{

	String kemudi;
	
	public Car() { // membuat konstruktor kosong

	}
	
	//konstruktor custom
	public Car(String nama, String kemudi) {// menjadi parameter nama, kemudi setelah mengambil dari parent
		super(nama);//super untuk mengambil perilaku dari parent, mereferensikan bahwa dari parent
		this.kemudi = kemudi;
	}
	
	public void bukaJendela() {
		System.out.println("Buka jendela");
	}

	
	
}
