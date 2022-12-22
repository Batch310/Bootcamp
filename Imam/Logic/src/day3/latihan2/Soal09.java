package day3.latihan2;

import java.util.Scanner;

public class Soal09 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();
		System.out.print("n2 = ");
		int n2 = inputan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int x = 0;
		for (int i = 0; i < n; i++) {
			x = n2 * i;
			System.out.print(x + " ");

		}

		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(x + " ");
			x = x - n2;
		}

	}

}
