package oop.latihanpewarisan;

public class KendaraanPewarisanMain {
	public static void main(String[] args) {
		
		Mobil mobil = new Mobil();
		Motor motor = new Motor();
		
		mobil.bukaPintu();
		mobil.gasPol();
		
		motor.standarGanda();
		motor.gasPol();
		
	}
}
