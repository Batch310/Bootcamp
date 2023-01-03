package oop.latihanabstraksi;



//Sub Class kendaraan
public class Mobil extends Kendaraan implements Navigasi{

	public void bukaPintu() {
		System.out.println("Pintu terbuka buat BosQ");
	}
	
	public void isiBensin() {
		System.out.println("Isi bensin sebanyak-banyaknya ahh~");
	}
	
	public void isiBensin(int liter) {
		if (liter == 0) {
			System.out.println("Dorong motor");
		} else {
			System.out.println("Isi bensin sebanyak " + liter + " Liter");
		}
		
	}

	@Override
	void gasPol() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maju() {
		System.out.println("Maju mobil");
		
	}

	@Override
	public void belokKiri() {
		System.out.println("Kiri Mobil");
		
	}

	@Override
	public void belokKanan() {
		System.out.println("Kanan Mobil");
		
	}
	
	
}
