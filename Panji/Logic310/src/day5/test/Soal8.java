package day5.test;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Input data panjang array
		System.out.print("Input Panjang Array : ");
		int data = input.nextInt();

		int[] bilPri = new int[data];
		int[] bilFibo = new int[data];
		int[] result = new int[data];
		bilFibo[0] = 0; // array 1
		bilFibo[1] = 1; // array 2

		// Program cek apakah data berupa bilangan prima dan menyimpannya
		int found = 0;
		int bilPrima = 2;
		while (found < data) {
			boolean prima = true;
			for (int i = 2; i <= bilPrima / 2; i++) {
				if (bilPrima % i == 0) {
					prima = false;
					break;
				}
			}
			if (prima) {
				bilPri[found] = bilPrima;
				found++;
			}
			bilPrima++;
		}
		System.out.print("Bil Prima 	: ");
		for (int i = 0; i < bilPri.length; i++) {
			System.out.print(bilPri[i] + " ");
		}

		// Program cek data berupa bilangan fobonacci dan menyimpannya
		for (int i = 2; i < data; i++) {
			bilFibo[i] = bilFibo[i - 1] + bilFibo[i - 2];
		}

		System.out.println();
		System.out.print("Bil Fibo 	: ");
		for (int i = 0; i < bilFibo.length; i++) {
			System.out.print(bilFibo[i] + " ");
		}

		// Program penjumlahan data index 1 dan data index 2
		System.out.println();
		System.out.print("Hasil 		: ");
		for (int i = 0; i < result.length; i++) {
			result[i] = bilPri[i] + bilFibo[i];
			System.out.print(result[i] + " ");
		}

	}
}
