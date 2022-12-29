package day9.pagi;

public class Vehicle {
	String nama;
	
	public Vehicle() {
	}

	public Vehicle(String nama) {
		this.nama = nama;
	}

	public void belokKiri() {
		System.out.println(nama + " belok kiri");
	}

	public void belokKanan() {
		System.out.println(nama + " belok kanan");
	}
}
