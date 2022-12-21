package day3.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int data;
		System.out.print("n : ");
		data = input.nextInt();

		int[] arr = new int[data];

		for (int i = 0; i < data; i++) {
			System.out.print("= ");
			arr[i] = input.nextInt();
		}

		int max = arr[0];
		int hitung = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				hitung = 1;
			}else if(arr[i] == max) {
				hitung++;
			}
		}
		System.out.println(hitung);
	}

}
