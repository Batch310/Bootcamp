package day4.latihan3;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan n = ");
		int n = scanner.nextInt();

		long[] arrN = new long[n];

		for (int i = 0; i < arrN.length; i++) {
			arrN[i] = scanner.nextLong();
		}

		long jumlah = 0;
		for (int i = 0; i < arrN.length; i++) {
			jumlah = jumlah + arrN[i];
		}

		System.out.print("Jumlahnyanya = " + jumlah);

	}

}
