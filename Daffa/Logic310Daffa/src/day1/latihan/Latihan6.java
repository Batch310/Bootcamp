package day1.latihan;

import java.util.Scanner;

public class Latihan6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan Angka : ");
		int angka = input.nextInt();

		if (angka < 10) {
			System.out.println(angka + " adalah satuan");
		} else if (angka > 9 && angka < 100) {
			System.out.println(angka + " adalah puluhan");
		} else if (angka > 99 && angka < 1000) {
			System.out.println(angka + " adalah ratusan");
		} else if (angka >= 1000)
			System.out.println("Angka terlalu besar");
		else
			System.out.println("Angka bukan satuan, puluhan, ratusan");
	}

}
