package simulasi.ft1;

import java.util.Scanner;

public class Soal03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int n = scanner.nextInt();
		
		int[] arrHasil = new int[n];

		
		int[] arrB = new int[n];
		
		
		int found =0;
		
		while(found<n) {
			int[] arrA = new int[n];
			int x = 0;
			for (int i = 1; i <= arrA.length; i++) {
				arrA[x] = i * 5;
				x++;
			}
			
			
		}
		

		

//		for (int i : arrA) {
//			System.out.print(i + " ");
//		}

		System.out.println();

		int y = 0;
		for (int j = 1; y <= arrB.length; j++) {
			arrB[y] = j * 8;
			y++;
		}

//		for (int i : arrB) {
//			System.out.print(i + " ");
//		}

	}
}
