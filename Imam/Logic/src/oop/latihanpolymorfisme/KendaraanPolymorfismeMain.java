package oop.latihanpolymorfisme;

public class KendaraanPolymorfismeMain {
	
	
	public static void main(String[] args) {
		
		Mobil mobil = new Mobil();
		Motor motor = new Motor();
		
		mobil.isiBensin();
		mobil.isiBensin(20);
		motor.gasPoll();
		
		
		
		
	}
	

}