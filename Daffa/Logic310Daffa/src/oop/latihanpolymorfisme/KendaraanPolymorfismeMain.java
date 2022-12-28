package oop.latihanpolymorfisme;

public class KendaraanPolymorfismeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil mobil = new Mobil();
		Motor motor = new Motor();
		
		mobil.isiBensin();
		mobil.isiBensin(900);
		System.out.println();
		
		motor.gasPol();
	}

}
