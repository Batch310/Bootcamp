package oop.latihanpolymorfisme;

public class Mobil extends Kendaraan{

//	public Mobil(String model, int jumlahRoda, long harga) {
//		super(model, jumlahRoda, harga);
//		// TODO Auto-generated constructor stub
//	}
	public void bukaPintu() {
		System.out.println("Pintu Terbuka buat BosQ");
	}
	// Overloading
	public void isiBensin() {
		System.out.println("Isi bensin sebanyak-banyaknya ahh~");
	}
	public void isiBensin(int liter) {
		System.out.println("Isi bensin sebanyak " + liter + " Liter");
	}
	
}
