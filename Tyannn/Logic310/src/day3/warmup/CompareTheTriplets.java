package day3.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 3;

		int[] alice = new int[n];
		int[] bob = new int[n];
		
		int alice1 = 0;
		int bob1 = 0;

		for (int i = 0; i < n; i++) {
			alice[i] = input.nextInt();
			
		}

		for(int i=0; i<n; i++) {
			bob[i] = input.nextInt();
		}
		
		for (int i = 0; i < bob.length; i++) {
			if(alice[i]>bob[i]) {
				alice1++;
			}else if(alice[i]<bob[i]) {
				bob1++;
			}	
		}

		System.out.println(alice1+" "+bob1);
		
	}

}
