package day5.latihan;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		System.out.print("n = ");
//		int n = input.nextInt();

		int n = 5;

		int[] arrA = new int[n];
		int[] arrB = new int[n];
//		int[] tampung = new int[n];
		int[] jml = new int[n];

		
		int sum1 = 0;
		for (int i = 1; sum1 < n; i++) {
		
			int sum = 0;
			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
				if (i % j == 0) {
					sum++;
//					System.out.println(sum);
				}
			}
			if (sum == 2) {
				System.out.print(" "+ i + " ");
				sum1++;

			}
//			System.out.println();
		}


	}

}
