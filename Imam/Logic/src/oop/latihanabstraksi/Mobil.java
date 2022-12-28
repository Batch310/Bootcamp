package oop.latihanabstraksi;



//Sub Class kendaraan
public class Mobil extends Kendaraan implements Navigasi{

	public void bukaPintu() {
		System.out.println("Pintu terbuka buat BosQ");
	}

	@Override
	public void maju() {
		System.out.println("Maju mobil");
		
	}

	@Override
	public void beloKiri() {
	System.out.println("Belok kiri");
		
	}

	@Override
	public void belokKanan() {
		System.out.println("Blok kanan");
		
	}

	@Override
	void gasPoll() {
		// TODO Auto-generated method stub
		
	}
	
	
}
