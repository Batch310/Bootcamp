package oop.latihanabstraksi;

public class KendaraanAbstraksiMain {

	public static void main(String[] args) {
		Mobil mobil = new Mobil();
		Motor motor = new Motor();
		
		mobil.maju();
		mobil.belokKiri();
		mobil.belokKanan();
		
		motor.maju();
		motor.belokKiri();
		motor.belokKanan();

	}

}
