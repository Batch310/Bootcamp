package day3.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n :");
		int n = input.nextInt();

		int[] my_array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print(" = ");
			my_array[i] = input.nextInt();
		}
		System.out.println();
		
//		if(my_array[i] == 0) {
//			
//		}
	}

}
