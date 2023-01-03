package day1.latihan;

import java.util.Scanner;

public class GanjilGenap {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("Masukkan Angka :");
		int angka = inputan.nextInt();

		if (angka % 2 == 0) {
			System.out.println("");
			System.out.println("Bilangan Genap");
		} else {
			System.out.println("");
			System.out.println("Bilangan Ganjil");
		}

	}

}
