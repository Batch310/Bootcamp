package simulasi.ft1;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//diket tribonacci 0,0,1,1,2,4,7
		//input = 5 output sebanyak 2 bilangan ganjil
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("x : ");
//		int n = scan.nextInt();
		
		int n =5;
		
		int bilSebelum = 1;
		int fibSekarang = 0;
		int fibo = 1;
		int arrFib = 0;

		int[] arrayFibo = new int[n];

		for (int i = 0; i < arrayFibo.length; i++) {
			arrayFibo[arrFib] = fibSekarang;
			fibo = bilSebelum + fibSekarang;
			bilSebelum = fibo;
			fibSekarang = fibo;
			arrFib++;
		}

		for (int i : arrayFibo) {
			System.out.print(i + " ");
		}

		System.out.println();
		
		
	}

}
