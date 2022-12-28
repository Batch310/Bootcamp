package oop.latihanabstraksi;

public class KendaraanAbstraksiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil iniMobil = new Mobil();
		Motor iniMotor = new Motor();

		iniMotor.maju();
		iniMotor.belokKanan();
		iniMotor.belokKiri();

		System.out.println();

		iniMobil.maju();
		iniMobil.belokKanan();
		iniMobil.belokKiri();
	}

}
