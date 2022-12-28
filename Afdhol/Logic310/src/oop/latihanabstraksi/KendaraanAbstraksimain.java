package oop.latihanabstraksi;

public class KendaraanAbstraksimain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor motor = new Motor();
		Mobil mobil = new Mobil();
		
		mobil.maju();
		mobil.belokKanan();
		mobil.belokKiri();
		
		motor.maju();
		motor.belokKanan();
		motor.belokKiri();
		
	}

}
