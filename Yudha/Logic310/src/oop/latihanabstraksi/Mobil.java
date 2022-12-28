package oop.latihanabstraksi;

public class Mobil extends Kendaraan implements Navigasi {

	public void bukaPintu() {
		System.out.println("Pintu Terbuka buat BosQ");
	}

	@Override
	void gasPol() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void maju() {
		// TODO Auto-generated method stub
		System.out.println("Maju dengan menggunakan Mobil");

	}

	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		System.out.println("Belok kanan dengan menggunakan Mobil");

	}

	@Override
	public void belokKiri() {
		// TODO Auto-generated method stub
		System.out.println("Belok kiri dengan menggunakan Mobil");

	}

	

}
