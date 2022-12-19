package day1.latihan;

import java.util.Scanner;

public class Latian6 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("Masukkan Angka : ");
		int nilai = inputan.nextInt();

		if (nilai >= 0 && nilai <= 9) {
			System.out.println(nilai + " adalah satuan");
		} else if (nilai <= 99) {
			System.out.println(nilai + " adalah puluhan");
		} else {
			System.out.println(nilai + " bukan satuan atau puluhan");

		}

	}

}
