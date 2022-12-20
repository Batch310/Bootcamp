package day3.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		int[] deretAngka = new int[5];
		int maxSum = 0;
		int minSum = 0;
		
		for (int i = 0; i < deretAngka.length; i++) {
			System.out.print("Masukkan angka: ");
			deretAngka[i] = masukan.nextInt();	
		}
		
		Arrays.sort(deretAngka);
		
		for (int i = 0; i < deretAngka.length; i++) {
			int sum = 0;
			for (int j = 0; j < deretAngka.length; j++) {
				if (j != i) {
					sum += deretAngka[j];
				} else {
					sum -= 0;
				}
			}
			
			if (sum >= maxSum) {
				maxSum = sum;
			}
			if (sum <= maxSum) {
				minSum = sum;
			}
		}
		System.out.print(minSum + " " + maxSum);
		
	}
}
