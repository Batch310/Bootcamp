package coba;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyak anak tangga: ");
		Integer n = masukan.nextInt();
		
		masukan.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= (n - 1)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
