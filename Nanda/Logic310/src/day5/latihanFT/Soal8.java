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
				System.out.print(i + " ");
				current++;
			}
		}
		System.out.println();
		System.out.print("Bilangan Prima : ");
		for (int i = 0; i < prima.length; i++) {
			System.out.print(prima[i] + " ");
		}

		System.out.println();

		int fibo0 = 0;
		int fibo1 = 1;
		int currentfibo = 0;
		int bilfibo = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print(fibo0+ " ");
			bilfibo = fibo0 + fibo1;
			fibo0 = fibo1;
			fibo1 = bilfibo;
		}
		for (int i = 1; currentfibo < n; i++) {
			fibonacci[bilfibo] = fibo0;
			System.out.println(fibonacci[fibo0]+ " ");
			currentfibo++;
		}

		System.out.println();
	}

	// Program penjumlahan data index 1 dan data index 2
}
