package day3.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" n = ");
		int n = input.nextInt();
	        long sum = 0;
	        
	        for(int i = 0; i < n; i++){
	            sum = sum + input.nextLong();
	        }
	        
	        System.out.print(sum);

	}

}
