package day3.Warmupp;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {

		int n = 6;

		Scanner input = new Scanner(System.in);
		
		int jumlah=0;
		int a = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int array[] = {a}; 
			
			System.out.print(array[0]);
			a += 1;
			
//			for (int j : array) {
//				jumlah += j;
//				
//				System.out.println("jumlah: "+jumlah);
			}
		}

//		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int sum = 0;
//
//		for (int i : my_array)
//			sum += i;
//		System.out.println("The sum is " + sum);
	}

