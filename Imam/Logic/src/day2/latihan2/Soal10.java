package day2.latihan2;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();
		System.out.print("n = ");
		int n2 = inputan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 0; i < n; i++) {
			int x = i * n2;
			System.out.print(x + " ");
		}

		System.out.println();

		for (int i = 0; i < n; i++) {
			int y = i * n2;
			System.out.print(y+i + " ");

		}
	}

}
