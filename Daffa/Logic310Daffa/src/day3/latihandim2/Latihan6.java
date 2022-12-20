package day3.latihandim2;

import java.util.Scanner;

public class Latihan6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n : ");
		int n = input.nextInt();

		int a, b, c;
		a = 1;
		b = 1;
		c = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a *= n;
		}
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.print(c + " ");
			b *= n;
			c = b + i;

		}

	}

}
