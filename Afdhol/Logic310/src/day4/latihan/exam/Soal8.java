package day4.latihan.exam;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {

		// fibonaci 0, 1, 1, 2, 3, 5, 8, 13, 21
		// prima = habis dibagi bil sendiri dan dibagi 1

		// membuat bil prima
		int bilDitemukan = 0; // bilangan yg ditemukan
		int bilangan = 2;// angka dicek

		Scanner scan = new Scanner(System.in);
		System.out.println("deret: ");
		int n = scan.nextInt();

		int[] arrPrima = new int[n];

		while (bilDitemukan < n) {
			boolean prima = true;
			for (int i = 2; i <= bilangan / 2; i++) {
				if (bilangan % i == 0) { // jika bilangan habis dibagi
					prima = false;
					break;
				}
			}
			if (prima) {
				arrPrima[bilDitemukan] = bilangan;
				bilDitemukan++;
			}
			bilangan++;
		}
		for (int prima : arrPrima) { // foreach
			System.out.print(prima + " ");
		}

		System.out.println();

		// Bilangan fibonaci

		int bilSebelum = 1;
		int fibSekarang = 0;
		int fibo = 1;
		int arrFib = 0;

		int[] arrayFibo = new int[n];

		for (int i = 0; i < arrayFibo.length; i++) {
			arrayFibo[arrFib] = fibSekarang;
			fibo = bilSebelum + fibSekarang;
			bilSebelum = fibo;
			fibSekarang = fibo;
			arrFib++;
		}

		for (int i : arrayFibo) {
			System.out.print(i + " ");
		}

		System.out.println();
		// dijumlahkan
		int[] arrJumlah = new int[n];

		for (int i = 0; i < arrayFibo.length; i++) {

			arrJumlah[i] = arrPrima[i] + arrayFibo[i];

		}

		// tampilkan dengan foreach

		for (int i : arrJumlah) {
			System.out.print(i + " ");
		}
	}
}
