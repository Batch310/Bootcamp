package day2.latihan2d;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		System.out.print("n2 = ");
		int n2 = input.nextInt();

		int awal = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int j = 1; j <= n; j++) {

			if (j % 3 == 0) {
				System.out.print(awal + " ");
				awal *= 5;
			}
		}

		awal = 2;
		for (int k = 1; k <= n; k++) {
			if (k % 3 == 0) {
				System.out.print(awal + " ");
				awal *= 5;
			}
		}
		awal = 3; // awal angka
		for (int l = 1; l <= n; l++) { // untuk perulangan sesuai n
			if (l % 3 == 0) { // untuk menentukan banyak angka
				System.out.print(awal + " "); // meng output hasil awal
				awal *= 5; // untuk menentukan kelipatan
			
			}
		}
		awal = 4;
		for (int m = 1; m <= n; m++) {
			if (m % 4 == 0) {
				System.out.print(awal + " ");
				awal -= awal;
			}
		}
	}

}
