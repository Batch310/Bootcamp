package day2.latihan2;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();
		System.out.print("n2 : ");
		int n2 = input.nextInt();

		int a = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					System.out.print(j + " ");
				} else if (i == 1) {
					System.out.print(a + " ");
					a = a + n2;
				} else {
					a = a - n2;
					System.out.print(a + " ");
				}

			}
			System.out.println();
		}

	}

}
