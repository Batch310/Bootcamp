package day2.latihan;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();

		int a = 3;
		for (int i = 0; i < n; i++) {
			if (i == n / 2) {
				System.out.print("XXX ");
			} else {
				System.out.print(a + " ");
			}
			a = a * 3;
		}
	}
}
