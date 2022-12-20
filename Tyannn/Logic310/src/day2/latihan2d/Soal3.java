package day2.latihan2d;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n= input.nextInt();
		
		System.out.print("n2= ");
		int n2= input.nextInt();

		int awal = 3;
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int j = 1; j <= n; j++) {

			if (j % 2 == 0) {
				System.out.print(awal + " ");
				awal *= 2;

			}

		}
		for (int k = 1; k <= n; k++) {
			if (k % 2 == 1) {
				System.out.print(awal + " ");
				awal /= 2;
			}
		}

	}

}
