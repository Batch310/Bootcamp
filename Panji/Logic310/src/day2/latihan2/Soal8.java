package day2.latihan2;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		int a = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a = a + 2;
		}

		System.out.println();
		int b = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(b + " ");
			b = b + 3;
		}

	}

}
