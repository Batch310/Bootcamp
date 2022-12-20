package day2.latihan2;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();


		int a = 1;
		int b = 1;
		int c = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					System.out.print(j + " ");
				} else if (i == 1) {
					System.out.print(a + " ");
					a = a * n;
				} else {
					System.out.print(c + " ");
					b = b * n;
					int hasilB = b + 1;
					c = hasilB + j;
				}

			}
			System.out.println();
		}
	}

}
