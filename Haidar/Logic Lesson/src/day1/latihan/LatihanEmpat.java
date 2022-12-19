package day1.latihan;

import java.util.Scanner;

public class LatihanEmpat {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); //Inisiasi tipe data Scanner variabel masukan sebagai input dari console
		
		System.out.print("Harga Beli: ");
		double beli = masukan.nextDouble(); //Input Harga Beli
		
		System.out.print("Harga Jual: ");
		double jual = masukan.nextDouble(); //Input Harga Jual
		
		double preuntung = (jual-beli)/beli*100; //Rumus Presentase Keuntungan
		
		System.out.println("Keuntungan Pedagang adalah " + preuntung + " persen");
		
	}

}
//5m