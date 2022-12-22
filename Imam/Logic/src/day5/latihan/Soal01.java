package day5.latihan;

import java.util.Scanner;

public class Soal01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan n = ");
		int n = scanner.nextInt();

		if (n > 0) {

			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}

			System.out.println();

			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}

		} else {
			System.out.print("n harus bilangan positif!!!");
		}
		System.exit(0);

	}

}
