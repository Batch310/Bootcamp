package oop.latihanpewarisan;

public class KendaraanPewarisanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil toyota = new Mobil();
		Motor beat = new Motor();
		
		toyota.bukaPintu();
		toyota.gasPol();
		
		System.out.println();
		
		beat.standarGanda();
		beat.gasPol();
	}

}
