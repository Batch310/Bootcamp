package day2.latihan;

import java.util.Scanner;

public class Day2Latihan6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		
		int awal = 1;

		for (int i = 0; i < n; i++) {

			if (i % 3 == 2) {
				System.out.print("* ");
			} else {
				System.out.print(awal + " ");

			}
			awal += 4;
		}

	}

}
