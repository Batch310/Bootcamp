package day3.latihandim2;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n  : ");
		int n = input.nextInt();
		int a, b;
		a = 0;
		b = 0;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a += 2;
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(b + " ");
			b += 3;
		}
	}

}
