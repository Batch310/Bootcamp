package day4.pagi;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("n : ");
		int n = scanner.nextInt();

		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Masukkan angka : ");
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

		int diagonal1 = 0;
		int diagonal2 = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					diagonal1 += matrix[i][j];
				}
				if (i + j == n - 1) {
					diagonal2 += matrix[i][j];
				}
			}
		}
		int hasil = Math.abs(diagonal2-diagonal1);
		System.out.println("diagonal1 = " + diagonal1);
		System.out.println("diagonal2 = " + diagonal2);
		System.out.println(hasil);
	}

}
