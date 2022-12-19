package day2.latihan;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();

		int a = 4;
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0) {
				System.out.print(" * ");
			} else {
				System.out.print(a + " ");
				a = a * 4;
			}
		}

	}

}
