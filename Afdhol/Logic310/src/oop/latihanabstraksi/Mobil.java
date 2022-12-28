package oop.latihanabstraksi;

public class Mobil extends Kendaraan implements Navigasi {
	
	
	
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

	@Override
	public void maju() {
		System.out.println("maju menggunakan mobil");
		
	}

	@Override
	public void belokKiri() {
		System.out.println("belok kiri mengunakan mobil");		
	}

	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		System.out.println("belok kanan menggunakan mobil");
		
	}

	@Override
	public void gaspol() {
		// TODO Auto-generated method stub
		System.out.println("gaspol menggunakan mobil");
	}

}
