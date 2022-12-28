package oop.latihanabstraksi;

public class Motor extends Kendaraan implements Navigasi{

	public void standarGanda() {
		System.out.println("Motor Sudah berstandar Ganda");
	}
	
	public void gasPol() {
		System.out.println("Gas Pol Pake Motor!!");
	}

	@Override
	public void maju() {
		System.out.println("Maju dengan menggunakan motor");
		
	}

	@Override
	public void belokKiri() {
		System.out.println("Belok Kiri dengan menggunakan motor");
		
	}

	@Override
	public void belokKanan() {
		System.out.println("Belok kanan dengan menggunakan motor");
		
	}
}
