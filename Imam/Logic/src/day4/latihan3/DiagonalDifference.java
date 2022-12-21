package day4.latihan3;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		int n = inputan.nextInt();

		int[][] matrix = new int[n][n];

		// input matrix
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				
				System.out.print("baris " + i + " kolom " + j);
				matrix[i][j] = inputan.nextInt();
			}
			System.out.println();
		}
		// Cetak array

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// cetak diagonal(hitung diagonal dan diagonal)
		int diagonal1 = 0;
		int diagonal2 = 0;

		// cari rumus dengan persamaan

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (i == j) {
					diagonal1 = diagonal2 + matrix[i][j];
				}
				if (i + j == n - 1) {
					diagonal2 = diagonal1 + matrix[i][j];

				}
			}
		}

		int hasil = Math.abs(diagonal2 - diagonal1);

		System.out.println();
		System.out.println("Hasilnya : " + hasil);

	}

}
