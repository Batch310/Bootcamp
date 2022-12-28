package oop.latihanpolymorfisme;

public class Mobil extends Kendaraan {
	
	
	
	public Mobil() {

	}
	
	public void bukapintu() {
		System.out.println("Pintu terbuka untuk bosQ");
	}
	
	public void isiBensin() {
		System.out.println("isi bensin sebanyak banyaknya ah--");
	}
	
	public void isiBensin(int liter) {
		System.out.println("Isi bensin sebanyak "+liter+ " Liter");
		
	}

}
