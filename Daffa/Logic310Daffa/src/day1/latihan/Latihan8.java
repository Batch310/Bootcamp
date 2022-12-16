package day1.latihan;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jas, celpan, kemeja, kaos;

		jas = 750000;
		celpan = 250000;
		kemeja = 100000;
		kaos = 50000;

		Scanner input = new Scanner(System.in);
		System.out.println("Uang : ");
		int uang = input.nextInt();

		if (uang >= jas) {
			System.out.println("Beli Jas!");
		} else if (uang < jas && uang >= celpan) {
			System.out.println("Beli Celana Panjang!");
		} else if (uang < celpan && uang >= kemeja) {
			System.out.println("Beli Kemeja!");
		} else if (uang < kemeja && uang >= kaos) {
			System.out.println("Beli Kaos!");
		} else
			System.out.println("Tidak bisa beli apa-apa!");

	}

}
