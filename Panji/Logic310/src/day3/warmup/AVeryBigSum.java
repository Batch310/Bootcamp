package day3.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		long data, total = 0;

		System.out.print("n : ");
		data = input.nextLong();
		long[] my_arr = new long[(int)data];

		for (int i = 0; i < data; i++) {
			System.out.print("= ");
			my_arr[i] = input.nextInt();
			total = total + my_arr[i];
		}
		System.out.print(total);
	}

}
