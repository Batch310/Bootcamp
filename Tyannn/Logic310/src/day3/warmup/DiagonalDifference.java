package day3.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = 3;

		int[][] angka = new int[n][n];

		int jumlah = 0;
		int jumlah1 = 0;
		int jumlah2 = 0;

		// Membuat dan menyimpan ke array
		for (int i = 0; i < angka.length; i++) {
			for (int j = 0; j < angka[i].length; j++) {
				System.out.print("" + i + j + " ");
				angka[i][j] = input.nextInt();
			}
			System.out.println();
		}
		// cek & Menampilkan array
		for (int i = 0; i < angka.length; i++) {
			for (int j = 0; j < angka.length; j++) {
				System.out.print(angka[i][j] + " ");
			}
			System.out.println();
		}
		

		int diagonal1 = 0;
		int diagonal2 = 0;
		//menghitung diagonal \ dan menghitung diagonal /
		for (int i = 0; i < angka.length; i++) {
			for (int j = 0; j < angka.length; j++) {
				if (i == j) {
					diagonal1 = diagonal1 + angka[i][j];
				}
				if (i + j == n - 1) {
					diagonal2 = diagonal2 + angka[i][j];
				}
			}
		}
		
		int hasil = Math.abs(diagonal2-diagonal2);
		System.out.println("Hasilnya = "+hasil);
//		System.out.println("Diagonal 1 = " + diagonal1);
//		System.out.println("Diagonal 2 = " + diagonal2);
//		
//		jumlah = angka[0][0] + angka[1][1] + angka[2][2];
//		
//		System.out.println();
//		System.out.println(jumlah);
//		
//		jumlah1 = angka[0][2] + angka[1][1] + angka[2][0];
//		System.out.println();
//		System.out.println(jumlah1);

	}

}
