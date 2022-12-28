package oop.latihanpolymorfisme;

public class KendaraanPolymorfismeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil toyota = new Mobil();
		Motor beat = new Motor();
		
		//overloading
		toyota.isiBensin();;
		toyota.isiBensin(5);;
		
		System.out.println();
		
		beat.gasPol();
	}

}
