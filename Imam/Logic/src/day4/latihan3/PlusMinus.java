package day4.latihan3;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Jumlah angka = ");
		int n = scanner.nextInt();

		System.out.print(" 6 ");

		int[] array = new int[n];

		// input(isi array)
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("------------------------");

		// Cetak
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		double positif = 0;
		double negatif = 0;
		double nol = 0;
		// Output
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				positif++;
			} else if (array[i] < 0) {
				negatif++;
			} else if (array[i] == 0) {
				nol++;
			}
		}
		System.out.println();

		System.out.println(positif / n);
		System.out.println(negatif / n);
		System.out.println(nol / n);

	}

}
