package day2.latihan;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("n : ");
		n = input.nextInt();

		int a = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a = a + 2;
		}

	}

}
