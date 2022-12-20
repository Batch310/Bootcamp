package day3.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		int[] arrA = new int[n];

		
		for(int i=0; i<n; i++) {
			arrA[i] = n;
			System.out.println(arrA[i]);
		}
	}

}
