package oop.latihanabstraksi;

public class Mobil extends Kendaraan implements Navigasi {

	public void bukaPintu() {
		System.out.println("Pintu Terbuka BosQ");
	}

	public void isiBensin() {
		System.out.println("Isi bensin sebanyak-banyaknya ahh~");
	}

	public void isiBensin(int liter) {
		System.out.println("Isi bensin sebanyak " + liter + " Liter");
	}

	@Override
	public void maju() {
		System.out.println("Maju dengan menggunakan mobil");

	}

	@Override
	public void belokKiri() {
		System.out.println("Belok Kiri dengan menggunakan mobil");

	}

	@Override
	public void belokKanan() {
		System.out.println("Belok kanan dengan menggunakan mobil");

	}

	@Override
	void gasPol() {
		// TODO Auto-generated method stub

	}
}
