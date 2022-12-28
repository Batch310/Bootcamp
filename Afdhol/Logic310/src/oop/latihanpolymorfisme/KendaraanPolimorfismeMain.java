package oop.latihanpolymorfisme;

public class KendaraanPolimorfismeMain {

	public static void main(String[] args) {


		Motor motor = new Motor();
		Mobil mobil = new Mobil();
		
		mobil.isiBensin();
//		mobil.isiBensin(10);
		
		mobil.isiBensin(01);
		
		motor.gasPol();
		
		
		
	}

}
