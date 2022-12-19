package day2.latihan;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();

		int a = 1;
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0) {
				System.out.print(" * ");
			} else {
				System.out.print(a + " ");
				a = a + 4;
		}
		}

	}

}
