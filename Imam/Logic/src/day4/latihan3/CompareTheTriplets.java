package day4.latihan3;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] arrA = new int[3];
		int[] arrB = new int[3];

		for (int i = 0; i < arrA.length; i++) {
			System.out.print("Nilai Alice = ");
			arrA[i] = scanner.nextInt();
		}

		System.out.println();

		for (int i = 0; i < arrB.length; i++) {
			System.out.print("Nilai Bobby = ");
			arrB[i] = scanner.nextInt();
		}

		System.out.println();

		int pointAlice = 0;
		int pointBob = 0;

		int[] arrP = new int[2];
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] > arrB[i]) {
				pointAlice++;
			} else if (arrB[i] > arrA[i]) {
				pointBob++;
			}
		}
		System.out.println();

		System.out.print(pointAlice + " ");
		System.out.print(pointBob + " ");

//		for (int i : arrA) {
//			System.out.print(i + " ");
//		}
//
//		System.out.println();
//
//		for (int i : arrB) {
//			System.out.print(i + " ");
//		}

	}

}
