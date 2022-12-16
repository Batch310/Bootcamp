package day1.latihan;

import java.util.Scanner;

public class Latihan6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan Angka : ");
		int angka = input.nextInt();

		if (angka >=0 && angka < 10) {
			System.out.println(angka + " adalah satuan");
		} else if (angka > 9 && angka < 100) {
			System.out.println(angka + " adalah puluhan");
		} else {
			System.out.println("Angka bukan satuan, puluhan");
		}
	}

}
