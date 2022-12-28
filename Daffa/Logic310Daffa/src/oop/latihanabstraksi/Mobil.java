package oop.latihanabstraksi;

public class Mobil extends Kendaraan implements Navigasi {

	public Mobil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void bukaPintu() {
		System.out.println("Pintu terbuka BosQ");
	}

	@Override
	void gasPol() {
		// TODO Auto-generated method stub

	}

	@Override
	public void maju() {
		// TODO Auto-generated method stub
		System.out.println("Maju dengan menggunakan mobil");
	}

	@Override
	public void belokKiri() {
		// TODO Auto-generated method stub
		System.out.println("Belok kiri dengan menggunakan mobil");
	}

	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		System.out.println("Belok kanan dengan menggunakan mobil");
	}

}
