package oop.latihanabstraksi;

public class Motor extends Kendaraan implements Navigasi {

	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void standarGanda() {
		System.out.println("Motor sudah berstandar ganda");
	}

	@Override
	public void maju() {
		// TODO Auto-generated method stub
		System.out.println("Maju dengan menggunakan motor" );
	}

	@Override
	public void belokKiri() {
		// TODO Auto-generated method stub
		System.out.println("Belok kiri dengan menggunakan motor");
	}

	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		System.out.println("Belok kanan dengan menggunakan motor");
	}

	@Override
	void gasPol() {
		// TODO Auto-generated method stub
		
	}

}
