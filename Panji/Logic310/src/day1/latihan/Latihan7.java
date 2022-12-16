package day1.latihan;

import java.util.Scanner;

public class Latihan7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Angka : ");
		int angka = input.nextInt();

		if (angka % 2 == 0) {
			System.out.println("Bilangan Genap");
		} else if (angka % 2 != 0) {
			System.out.println("Bilangan Ganjil");
		}

	}

}
