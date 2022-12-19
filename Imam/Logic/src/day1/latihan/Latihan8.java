package day1.latihan;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("uang : ");
		int uang = inputan.nextInt();

		int jas = 750000;
		int celana = 250000;
		int kemeja = 100000;

		if (uang >= jas) {
			System.out.println("Beli Jas!");
		} else if (uang < jas && uang >= celana) {
			System.out.println("Beli Celana Panjang");
		} else if (uang < celana && uang >= kemeja) {
			System.out.println("Beli Kemeja!");
		} else {
			System.out.println("Tidak bisa beli apa-apa!");
		}

	}

}
