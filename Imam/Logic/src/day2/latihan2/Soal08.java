package day2.latihan2;

import java.util.Scanner;

public class Soal08 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int i = 0; i < n; i++) {
			int x = i * 2;
			System.out.print(x + " ");
		}

		System.out.println();
		for (int i = 0; i < n; i++) {
			int y = i * 3;
			System.out.print(y + " ");
		}
	}

}
