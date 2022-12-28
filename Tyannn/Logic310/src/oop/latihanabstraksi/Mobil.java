package oop.latihanabstraksi;

public class Mobil extends Kendaraan implements Navigasi{

	public Mobil() {
		
	}
	public Mobil(String modelParam, int jumlahRodaParam, long hargaParam) {
		super(modelParam, jumlahRodaParam, hargaParam);
	}
	public void bukaPintu() {
		System.out.println("Pintu terbuka BosQ");
	}
	public void isiBensin() {
		System.out.println(" Isi Bensin Sebanyak-banyaknya ahh~");
	}
	public void isiBensin(int liter) {
		System.out.println(" Isi Bensin sebanyak "+liter+" liter");
	}
	@Override
	public void maju() {
		// TODO Auto-generated method stub
		System.out.println("Maju dengan menggunakan Mobil/Motor");
		
	}
	@Override
	public void belokKiri() {
		// TODO Auto-generated method stub
		System.out.println("Belok Kiri dengan menggunakan Mobil/Motor");
		
	}
	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		System.out.println("Belok Kanan dengan menggunakan Mobil/Motor");
		
	}
}
