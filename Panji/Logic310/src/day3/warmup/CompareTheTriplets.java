package day3.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Data : ");
		int data = input.nextInt();

		int[] arr1 = new int[data];
		int[] arr2 = new int[data];
		int hasil1 = 0, hasil2 = 0;

		for (int i = 0; i < data; i++) {
			System.out.print("= ");
			arr1[i] = input.nextInt();
		}

		System.out.println();
		for (int i = 0; i < data; i++) {
			System.out.print("= ");
			arr2[i] = input.nextInt();
		}

		for (int i = 0; i < data; i++) {
			if (arr1[i] > arr2[i]) {
				hasil1++;
			} else if (arr1[i] < arr2[i]) {
				hasil2++;
			}
		}

		System.out.print(hasil1 + " " + hasil2);
	}

}
