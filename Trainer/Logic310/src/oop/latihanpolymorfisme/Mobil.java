package oop.latihanpolymorfisme;

public class Mobil extends Kendaraan {

	public void bukaPintu() {
		System.out.println("Pintu terbuka buat BosQ");
	}
	
	public void isiBensin() {
		System.out.println("Isi bensin sebanyak-banyaknya ahh~");
	}
	
	public void isiBensin(int liter) {
		if (liter == 0) {
			System.out.println("Dorong motor");
		} else {
			System.out.println("Isi bensin sebanyak " + liter + " Liter");
		}
		
	}
}
