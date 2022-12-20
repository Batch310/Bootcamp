package day2.latihan2d;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n = ");
		int n = input.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = i * n; j < (i + 1) * n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		System.out.print("n1 = ");
		int n1 = input.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = i * n1; j < (i + 1) * n1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}