package FT1AdhietyanPS;

import java.util.Scanner;

public class Soal05 {

	public static void main(String[] args) {
		// Ada berapa banyak bangun persegi dengan panjang sisi n cm yang dapat
		// digunakan untuk membuat sebuah kubus dengan panjang salah satu rusuknya m cm
		// ?

		Scanner input = new Scanner(System.in);

		System.out.print("m = ");
		int m = input.nextInt();

		System.out.print("n = ");
		int n = input.nextInt();

		double persegi = Math.pow(n, 2);
		double kubus = Math.pow(m, 2) * 6 ;

		double hitung = kubus / persegi;

		// Dibulatkan ke atas untuk melakukan penambalan, berdasarkan luasnya saja
		

		// Cetak Hasil

		System.out.println("banyak persegi = " + hitung);
	}

}
