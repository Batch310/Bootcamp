package day5.latihan;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		System.out.print("n = ");
//		int n = input.nextInt();

		System.out.print("n = ");
		int n = input.nextInt();

		int[] arrA = new int[n];
		int[] arrB = new int[n];
//		int[] tampung = new int[n];
		int[] jml = new int[n];

		int prima = 0;
		for (int i = 1; prima < n; i++) {

			int sum = 0;
			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
				if (i % j == 0) {
					sum++;
//					System.out.println(sum);
				}
			}
			if (sum == 2) {
				System.out.print(i + " ");
				arrA[prima] = i;
				prima++;

			}
//			System.out.println();
		}

//		System.out.println();
//		for(int i=0; i<arrA.length; i++) {
//			System.out.print(arrA[i]+" ");
//		}

		System.out.println();

		int fibo = 0;
		int fibo1 = 1;
		int fibo2 = 0;
		for (int i = 0; i < n; i++) {
			arrB[i] = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = arrB[i];
			System.out.print(arrB[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < jml.length; i++) {
			jml[i] = arrA[i] + arrB[i];
			System.out.print(jml[i]+" ");
		}
		
	}

}
