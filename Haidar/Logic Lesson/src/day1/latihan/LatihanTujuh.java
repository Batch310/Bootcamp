package day1.latihan;

import java.util.Scanner;

public class LatihanTujuh {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan Angka: ");
		int angka = masukan.nextInt();
		
		if (angka%2 == 0) {
			System.out.println("Bilangan Genap");
		} else {
			System.out.println("Bilangan Ganjil");
		}

	}

}
//5m