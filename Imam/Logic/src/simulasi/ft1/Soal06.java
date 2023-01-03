package simulasi.ft1;

import java.util.Scanner;

public class Soal06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan x = ");
		int t = scanner.nextInt();

		// Bilangan Tribonacci
		int[] arrT = new int[t];

		int bilSebelum = 1;
		int cur = 0;
		int tribo = 1;
		int arrTribo = 0;

		for (int i = 0; i < arrT.length; i++) {

			arrT[arrTribo] = cur;
			tribo = bilSebelum + cur;
			bilSebelum = cur;
			cur = tribo;
			arrTribo++;
		}

		int found = 0;
		for (int i = 0; i < arrT.length; i++) {

			if (i % 2 != 0) {
				found++;
			}
		}

		System.out.println("Sebanyak " + found + " bilangan ganjil");

	}

}
