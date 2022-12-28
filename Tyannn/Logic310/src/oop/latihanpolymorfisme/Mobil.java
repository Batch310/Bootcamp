package oop.latihanpolymorfisme;

public class Mobil extends Kendaraan{

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
}
