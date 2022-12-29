package oop.latihanpolymorfisme;

import oop.latihanpolymorfisme.Kendaraan;

//Sub Class kendaraan
public class Mobil extends Kendaraan{

	public void bukaPintu() {
		System.out.println("Pintu terbuka buat BosQ");
	}
	
	
	//Overloading (nama fungsi sama, parameter beda)
	public void isiBensin() {
	System.out.println("Isi Bensin sebanyak-banyaknya ahh..");
	}
	
	public void isiBensin(int liter) {
	System.out.println("Isi bensin sebanyak "+liter+" Liter");
	}
	
	
}
