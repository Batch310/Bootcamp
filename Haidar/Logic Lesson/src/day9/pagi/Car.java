package day9.pagi;

public class Car extends Vehicle {
	String kemudi;
	
	public Car() { //Perlu jika ingin membuat konstruktor kustom.
	} //Karena kalau tidak ditulis, maka konstruktor default akan ke replace
	// Dan class Child akan error
	
	public Car(String nama, String kemudi) { //Konstruktor Kustom
		super(nama); //Perlu karena Car merupakan Child atau SubClass, yang mempunyai SuperClass dan ingin menampilkan atribut dari class Child dan atribut dari class Parent
		this.kemudi = kemudi;
	}

	public void bukaJendela() {
		System.out.println("Buka Jendela");
	}
}
