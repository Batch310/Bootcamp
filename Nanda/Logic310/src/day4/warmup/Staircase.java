package day4.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan n = ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j >= n-1) {
				System.out.print("#");
			} else {
				System.out.print(" ");
			}
		}
			System.out.println();
	}
	}
}
		
//		int[][] arrayA = new int [n][n];
//		
//		for (int i = 0; i < arrayA.length; i++) {
//			for (int j = 0; j < arrayA[i].length; j++) {
//				System.out.print(arrayA[i][j] + " ");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < arrayA.length; i++) {
//			for (int j = 0; j < arrayA[i].length; j++) {
//				if( arrayA[i][j] < (n-1) ) {
//					System.out.print(" ");
//				}
//				if ( arrayA[i][j] > n){
//					System.out.print("#");
//				}
//			}
//		}
//				
//			}
//		
//	}