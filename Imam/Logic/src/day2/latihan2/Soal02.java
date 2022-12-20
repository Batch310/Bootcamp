package day2.latihan2;

import java.util.Scanner;

public class Soal02 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();
		System.out.print("n2 = ");
		int n2 = inputan.nextInt();

		int nilaiAwal = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int i = 0; i <= n; i++) {

			if (i % 3 == 2) {
				int b = nilaiAwal * -1;
				System.out.print(b + " ");
			} else {
				System.out.print(nilaiAwal + " ");
			}
			nilaiAwal = nilaiAwal * n2;
		}

	}

}
