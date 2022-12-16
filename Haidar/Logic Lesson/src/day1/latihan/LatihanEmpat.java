package day1.latihan;

import java.util.Scanner;

public class LatihanEmpat {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Harga Beli: ");
		double beli = masukan.nextDouble();
		
		System.out.print("Harga Jual: ");
		double jual = masukan.nextDouble();
		
		double preuntung = (jual-beli)/beli*100;
		
		System.out.println("Keuntungan Pedagang adalah " + preuntung + " persen");
		
	}

}
//5m