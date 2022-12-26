package day5.latihanFT;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input panjang deret: ");
		int n = input.nextInt();

		int[] prima = new int[n];
		int[] fibonacci = new int[n];
		int bilprima = 0;
		int current = 0; // menghitung banyak bilangan prima yang sudah ketemu

		for (int i = 1; current < n; i++) {
			bilprima = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					bilprima++;
				}
			}
			if (bilprima == 2) {
				prima[current] = i;
				current++;
			}
		}
		System.out.print("Bilangan Prima : ");
		for (int i = 0; i < prima.length; i++) {
			System.out.print(prima[i] + " ");
		}

		System.out.println();

		int fibo0 = 0;
		int fibo1 = 1;

		System.out.print("Bilangan Fibonacci : ");
		for (int i = 0; i < n; i++) {
			fibonacci[i] = fibo0 + fibo1;
			fibo0 = fibo1;
			fibo1 = fibonacci[i];
			System.out.print(fibonacci[i]+ " ");
		}
		
		System.out.println();
		
		System.out.print("Total : ");
		int[] total = new int [n];
		for (int i = 0; i < n; i++) {
			total[i] = prima[i] + fibonacci[i];
			System.out.print(total[i] + " ");
			
		}

	}

	// Program penjumlahan data index 1 dan data index 2
}
