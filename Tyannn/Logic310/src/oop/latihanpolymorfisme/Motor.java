package oop.latihanpolymorfisme;

public class Motor extends Kendaraan{

	public Motor() {
		
	}
	public Motor(String modelParam, int jumlahRodaParam, long hargaParam) {
		super (modelParam, jumlahRodaParam, hargaParam);
	}
	public void standarGanda() {
		System.out.println("Motor Sudah berstandar Ganda");
	}
	
	public void gasPol() {
		System.out.println(" Gas pol pakai Motor!!!");
	}
}
