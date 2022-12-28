package oop.latihanpolymorfisme;

public class Mobil extends Kendaraan {

	public Mobil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void bukaPintu() {
		System.out.println("Pintu terbuka BosQ");
	}

	public void isiBensin() {
		System.out.println("Isi bensin sebanyak-banyaknya ahhh");
	}

	public void isiBensin(int liter) {
		System.out.println("Isi bensin sebanyak " + liter + " liter");
	}

}
