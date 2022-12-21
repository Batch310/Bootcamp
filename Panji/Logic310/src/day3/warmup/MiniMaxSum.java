package day3.warmup;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int hasil1 = 0;
		System.out.print("n : ");
		int data = input.nextInt();

		int[] my_array = new int[data];

		for (int i = 0; i < my_array.length; i++) {
			System.out.print(" =");
			my_array[i] = input.nextInt();
			if (my_array[i] == 1) {
				hasil1 = my_array[1] + my_array[2] + my_array[3] + my_array[4];
			}
		}
			System.out.println(hasil1);
		
	}

}
