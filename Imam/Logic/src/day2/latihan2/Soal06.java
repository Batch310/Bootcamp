package day2.latihan2;

import java.util.Scanner;

public class Soal06 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int x = 1;
		for (int i = 0; i < n; i++) {

			if (i < n) {
				System.out.print(x + " ");
			} else {
				System.out.println();
			}
			x *= n;
		}

		System.out.println();

		int y = 1;
		for (int i = 0; i < n; i++) {
			if (i < n) {
				int z = y + i;
				System.out.print(z + " ");
			} else {
				System.out.println();
			}
			y *= n;
		}
	}

}
