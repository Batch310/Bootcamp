package day3.latihan2;

import java.util.Scanner;

public class Soal07_urutAngkaPindahBaris {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print(i + " ");
		}

		System.out.println();

		int x = n;
		for (int i = 0; i < n; i++) {
			System.out.print(x + " ");
			x++;
		}

		System.out.println();
		int y = n * 2;
		for (int i = 0; i < n; i++) {
			System.out.print(y + " ");
			y++;
		}

	}

}
