package day2.latihan2;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();
		System.out.print("n2 : ");
		int n2 = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int a = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(n2 + " ");
				n2 = n2 + 5;
			} else {
				System.out.print(a + " ");
				a = a + 1;
			}
		}
	}
}
