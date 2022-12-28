package oop.latihanabstraksi;

public class Motor extends Kendaraan implements Navigasi{


	
	public void standarGanda() {
		System.out.println("Motor Sudah berstandar Ganda");
	}

	@Override
	public void maju() {
		// TODO Auto-generated method stub
		System.out.println("Maju dengan menggunakan Motor");
		
	}

	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		System.out.println("Belok kanan dengan menggunakan Motor");
		
	}

	@Override
	public void belokKiri() {
		// TODO Auto-generated method stub\
		System.out.println("Belok kiri dengan menggunakan Motor");
		
		
	}

	@Override
	void gasPol() {
		// TODO Auto-generated method stub
		
	}

}
