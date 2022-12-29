package oop.latihanabstraksi;

public class Motor extends Kendaraan implements Navigasi {
	
	public void standarGanda() {
		System.out.println("Motor Sudah berstandar Ganda");
	}
	
	public void gasPol() {
//		super.gasPol();
		System.out.println("Gas Pol Pake Motor!!!");
	}

	@Override
	public void maju() {
		System.out.println("Maju dengan menggunakan Motor");		
	}

	@Override
	public void belokKiri() {
		System.out.println("Belok kiri dengan menggunakan Motor");		
	}

	@Override
	public void belokKanan() {
		System.out.println("Belok kanan dengan menggunakan Motor");		
	}
}
