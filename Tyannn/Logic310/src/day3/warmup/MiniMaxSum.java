package day3.warmup;

import java.util.Iterator;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = 5;

		int sum = 0;
		int[] arrA = new int[n];

		for (int i = 0; i < n; i++) {
			arrA[i] = input.nextInt();
			
		}			
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.print(arrA[i]+" ");
		}
		
		int min = 0;
		int max = 0;
		int temp = 0;
		
		for (int i = 0; i < arrA.length; i++) {
			temp=0;
			for (int j = 0; j < arrA.length; j++) {
				if (i!=j) {
					temp = temp + arrA[j];
				} 
			}
			if (min == 0) {
				min = temp;
			}
			if(temp < min) {
				min = temp;
			}
			if(temp>max) {
				max=temp;
			}
		}

		System.out.println();
		System.out.println("min = "+ min);
		System.out.println("max = "+ max);

	}

}
