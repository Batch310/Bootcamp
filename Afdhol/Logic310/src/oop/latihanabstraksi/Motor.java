package oop.latihanabstraksi;

public class Motor extends Kendaraan implements Navigasi {// untuk menerapkan abstract ditambah menggunakan 'implements'
														   // klik add unimplemented method untuk otomatis mengisi agar tidak error

	public Motor() {
		// TODO Auto-generated constructor stub
	}
	
	public void standarGanda() {
		System.out.println("Motor sudah standar ganda");
	}
	
	public void gasPol() {
	//	super.gaspol();//apabila ingin memanggil gaspol() dari kelas parent
		System.out.println("Gas Pol pake motor!!!"); 
	}

	@Override
	public void maju() {
		// TODO Auto-generated method stub
		System.out.println("maju menggunakan motor");
	}

	@Override
	public void belokKiri() {
		// TODO Auto-generated method stub
		System.out.println("belok kiri menggunakan motor");
	}

	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		System.out.println("belok kanan menggunakan motor");
	}

	@Override
	public void gaspol() {
		// TODO Auto-generated method stub
		System.out.println("gaspol");
	}
}
