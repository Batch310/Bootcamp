package day3.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		System.out.println();
		System.out.println("n = "+n);
		System.out.println();
		
		int[] angka = new int[n];
		int jumlah1 = 0;
		
		

		for (int i = 0; i < angka.length; i++) {
			System.out.print("angka ke "+i+" = ");
			angka[i] = input.nextInt();
			jumlah1 = jumlah1 + angka[i];
			
		}
		
		
		System.out.println("Jumlah = " + jumlah1);
		
		

	}

}
