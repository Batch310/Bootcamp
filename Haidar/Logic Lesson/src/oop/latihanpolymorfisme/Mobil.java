package oop.latihanpolymorfisme;

public class Mobil extends Kendaraan {
	
	public void bukaPintu() {
		System.out.println("Pintu Terbuka buat BosQ");
	}
	
	public void isiBensin() {
		System.out.println("Isi Bensin sebanyak-banyaknya ahh~");
	}
	
	public void isiBensin(int liter) {
		System.out.println("Isi Bensin sebanyak " + liter + " Liter");
	}
}
