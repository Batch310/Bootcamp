package day3.warmup;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n : ");
		int data = input.nextInt();

		int[] my_array = new int[data];

		for (int arr = 0; arr < data; arr++) {
			System.out.print(" =");
			my_array[arr] = input.nextInt();
		}


		int max = 0, min = 0;
		int[] hasil1 = new int[data];
		for (int i = 0; i < data; i++) {
			for (int j = 0; j < data; j++) {
				if (j != i) {
					max += my_array[j];
				}
			}
			hasil1[i] = max;
			max = 0;
		}
		max = hasil1[0];
		for (int i = 1; i < hasil1.length; i++) {
			if (hasil1[i] > max) {
				max = hasil1[i];
			}

		}
		min = hasil1[0];
		for (int i = 1; i < hasil1.length; i++) {
			if (hasil1[i] < min) {
				min = hasil1[i];
			}

		}
		System.out.println(max + " " + min);
	}
}
