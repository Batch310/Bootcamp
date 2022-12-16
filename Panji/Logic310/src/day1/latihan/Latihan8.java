package day1.latihan;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Diketehaui atau keterangan harga
		System.out.println("Harga Jas Rp750000");
		System.out.println("Harga Celana Panjang Rp250000");
		System.out.println("Harga Kemeja Rp100000");
		System.out.println("Harga Kaos Rp50000");

		// Kode input uang yang dimiliki
		System.out.println();
		System.out.print("Uang : ");
		int uang = input.nextInt();

		if (uang >= 750000) {
			System.out.println("Beli Jas");
		} else if (uang >= 250000) {
			System.out.println("Beli Celana Panjang");
		} else if (uang >= 100000) {
			System.out.println("Beli Kemeja");
		} else if (uang >= 50000) {
			System.out.println("Beli Kaos");
		} else if (uang < 50000) {
			System.out.println("Tidak bisa beli apa-apa");
		}

	}

}
