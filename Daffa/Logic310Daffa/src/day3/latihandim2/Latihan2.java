package day3.latihandim2;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n : ");
		int n = input.nextInt();

		System.out.print("Masukkan n2 : ");
		int n2 = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int o = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(o * -1 + " ");
			} else {
				System.out.print(o + " ");
			}
			o *= n2;
		}
	}

}
