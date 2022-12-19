package day2.latihan;

import java.util.Scanner;

public class Day2Latihan10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n = ");
		int n = input.nextInt();

		// n = 7
		// 3 9 27 XXX 243 729 2187
		// 0 1 2   3   4   5    6
		
		
		int awal = 3;
		for (int i = 0; i < n; i++) {

			if (i == n/2) {
				System.out.print("xxx ");
			} else {
				System.out.print(awal + " ");

			}
			awal *= 3;
		}

	}

}
