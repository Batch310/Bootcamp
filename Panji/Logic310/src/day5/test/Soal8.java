package day5.test;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Panjang Array : ");
		int data = input.nextInt();

		int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		int[] fibonacciNumbers = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		int[] result = new int[data];
		
		
		for (int i = 0; i < result.length; i++) {
			result[i] = primeNumbers[i] + fibonacciNumbers[i];
			System.out.print(result[i]+", ");
		}

	}

}
