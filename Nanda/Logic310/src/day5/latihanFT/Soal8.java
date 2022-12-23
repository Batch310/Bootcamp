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
		int bilfibo = 0;
		int current = 0; // menghitung banyak bilangan prima yang sudah ketemu
		int current1 = 0;

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
			System.out.print(prima[i]+ " ");
		}
	}

//		System.out.println();
//		
//		for (int i = 1; i <= fibonacci.length; i++) {
//			System.out.print(i+ " ");
//			bilfibo = i + current ;
//			current1 = i;
//			current1 = bilfibo;
}
