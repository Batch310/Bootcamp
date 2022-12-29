package oop.latihanpewarisan;

public class KendaraanPewarisanMain {
	public static void main(String[] args) {
		Mobil mobil = new Mobil(); //Inisiasi objek
		mobil.bukaPintu(); //objek.methodChild
		mobil.gasPol(); //objek.methodParent
		System.out.println();
		
		Motor motor = new Motor(); //Inisiasi objek
		motor.standarGanda(); //objek.methodChild
		motor.gasPol(); //objek.methodParent
	}
}
