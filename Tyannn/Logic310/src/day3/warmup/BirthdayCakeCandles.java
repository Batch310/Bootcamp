package day3.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 4;
		
		int[] cakes = new int[n];
		
		int max = 0;
		int hitung = 0;
		for(int i=0; i<cakes.length;i++) {
			cakes[i] = input.nextInt();
			if(cakes[i]>max) {
				max=cakes[i];
				hitung=0;
			}
			if(cakes[i]==max) {
				hitung++;
			}
		}

		System.out.println();
		System.out.println(hitung);
		
	}

}
