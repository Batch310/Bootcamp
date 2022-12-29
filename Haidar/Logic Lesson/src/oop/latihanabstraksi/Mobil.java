package oop.latihanabstraksi;

public class Mobil extends Kendaraan implements Navigasi {
	
	public void bukaPintu() {
		System.out.println("Pintu Terbuka buat BosQ");
	}
	
	public void isiBensin() {
		System.out.println("Isi Bensin sebanyak-banyaknya ahh~");
	}
	
	public void isiBensin(int liter) {
		System.out.println("Isi Bensin sebanyak " + liter + " Liter");
	}

	@Override
	public void maju() {
		System.out.println("Maju dengan menggunakan Mobil");
	}

	@Override
	public void belokKiri() {
		System.out.println("Belok kiri dengan menggunakan Mobil");		
	}

	@Override
	public void belokKanan() {
		System.out.println("Belok kanan dengan menggunakan Mobil");		
	}

	@Override
	void gasPol() {
		// TODO Auto-generated method stub
		
	}
}
