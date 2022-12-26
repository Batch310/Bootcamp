package day5.pagi;

import java.util.Scanner;

public class Soal1GanjilGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n : ");
		int n = input.nextInt();
		input.close();
		for (int i = 1; i <= n; i++) {
			// System.out.print(i);
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int j = 1; j <= n; j++) {
			if (j % 2 == 1) {
				System.out.print(j + " ");
			}
		}
	}
}