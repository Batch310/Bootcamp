package day2.latihan;

import java.util.Scanner;

public class DummyTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("n :");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int a = 0; a <= i; a++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
