package oop.latihanpewarisan;

public class Mobil extends Kendaraan{

	public Mobil() {
		
	}
	public Mobil(String modelParam, int jumlahRodaParam, long hargaParam) {
		super(modelParam, jumlahRodaParam, hargaParam);
	}
	public void bukaPintu() {
		System.out.println("Pintu terbuka BosQ");
	}
	
}
