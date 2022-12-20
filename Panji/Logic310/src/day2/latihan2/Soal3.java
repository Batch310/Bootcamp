package day2.latihan2;

import java.util.Scanner;

public class Soal3 {

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

		for (int i = 0; i < n; i++) {
			if (i < n / 2) {
				System.out.print(n2 + " ");
				n2 = n2 * 2;
			} else {
				System.out.print(n2 + " ");
				n2 = n2 / 2;
			}
		}
	}

}
