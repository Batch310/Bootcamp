package day3.warmup;

import java.util.Scanner;

public class WarmUp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan babak : ");
		int n = input.nextInt();
		
		int[] poinAlice = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan poin Alice : ");
			poinAlice[i] = input.nextInt();
		}
		
		int[] poinBob = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan poin Bob : ");
			poinBob[i] = input.nextInt();
		}
		
		int totalAlice = 0;
		int totalBob = 0;
		
		for (int i = 0; i < n; i++) {
			if (poinAlice[i] > poinBob[i]) {
				totalAlice++;
			} else if ( poinAlice[i] < poinBob[i]) {
				totalBob++;
			}
		}
		System.out.println(totalAlice + " " + totalBob);
	}

}
