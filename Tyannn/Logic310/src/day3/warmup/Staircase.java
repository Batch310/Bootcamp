package day3.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N : ");
		int n = input.nextInt();

		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				if(i+j>=n-1) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
			
		}
	}

}
