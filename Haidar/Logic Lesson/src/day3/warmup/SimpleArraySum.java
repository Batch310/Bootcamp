package day3.warmup;

import java.util.Scanner;

public class SimpleArraySum {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("");
		int arrayLength = masukan.nextInt();
		
		int[] arraySum = new int[arrayLength];
		int sumOfArray = 0;
		
		for (int i = 0; i < arraySum.length; i++) {
			System.out.print("");
			arraySum[i] = masukan.nextInt();
			sumOfArray += arraySum[i];
		}
		System.out.println(sumOfArray);
	}
}
