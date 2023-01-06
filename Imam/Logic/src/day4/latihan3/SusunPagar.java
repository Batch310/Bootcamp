package day4.latihan3;

import java.util.Scanner;

public class SusunPagar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan n = ");
		int n = scanner.nextInt();

//		int[][] array = new int[n][n];

		// input dengan for

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) { // tentukan diagonal(2 dimensi) enaknya digambar buku
					System.out.print("#"); // untuk ketehui koordinat buat nentuin rumus
				} else {
					System.out.print(" "); // biar rata kanan, karena di koding rata kiri terus
				}
			}
			System.out.println();
		}

		// input array

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				
//				array[i][j] = n;
//			}
//		}
//		// Cetak
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//			
//		}

	}

}
