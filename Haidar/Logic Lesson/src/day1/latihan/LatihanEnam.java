package day1.latihan;

import java.util.Scanner;

public class LatihanEnam {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan Angka: ");
		int angka = masukan.nextInt();
		
		if (angka > -10 && angka < 10) {
			System.out.println(angka + " adalah satuan");
		} else if (angka > -100 && angka < 100) {
			System.out.println(angka + " adalah puluhan");
		} else {
			System.out.println(angka + " bukan satuan atau puluhan");
		}

	}

}
//5m