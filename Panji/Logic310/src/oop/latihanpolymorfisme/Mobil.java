package oop.latihanpolymorfisme;

public class Mobil extends Kendaraan {

	public void bukaPintu() {
		System.out.println("Pintu Terbuka BosQ");
	}

	public void isiBensin() {
		System.out.println("Isi bensin sebanyak-banyaknya ahh~");
	}

	public void isiBensin(int liter) {
		System.out.println("Isi bensin sebanyak " + liter + " Liter");
	}
}
