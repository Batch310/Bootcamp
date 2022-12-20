package day3.latihandim2;

import java.util.Scanner;

public class Latihan4 {

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
		
		int a, b;
		a = 0;
		b = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				a++;
				System.out.print(a + " ");
			} else {
				b = a * n2;
				System.out.print(b + " ");
			}
		}
	}

}
