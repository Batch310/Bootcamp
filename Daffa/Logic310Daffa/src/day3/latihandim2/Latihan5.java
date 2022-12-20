package day3.latihandim2;

import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n : ");
		int n = input.nextInt();
		int a, b;
		a = n;
		b = n * 2;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(b + " ");
			b++;
		}
	}
}
