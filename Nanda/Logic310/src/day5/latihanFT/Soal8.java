package day5.latihanFT;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input panjang deret: ");
		int n = input.nextInt();
		
		int[] prima = new int[n];
		int[] fibonacci = new int[n];
		int bilprima;
		
		for (int i = 1; i <= prima.length; i++) {
			bilprima = 0;
			for (int j = 1; j <= prima.length; j++) {
				if ( i%j == 0) {
					bilprima = bilprima + 1;
				}
		}if (bilprima == 2) {
			System.out.print(i+ " ");
		}
	}
		for (int i = 1; i < fibonacci.length; i++) {
			
			
		}
	}
}
