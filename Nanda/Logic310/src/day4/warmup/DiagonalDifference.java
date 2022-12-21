package day4.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		int[][] matriks = new int[n][n];
		
		for (int i = 0; i < matriks.length; i++) {
			for (int j = 0; j < matriks.length; j++) {
				System.out.print("baris " +i+ " kolom " +j+ ": ");
				matriks[i][j] = input.nextInt();
			}
			System.out.println();
			
			//Cek & Cetak apakah array sesuai
		for (int il = 0; il < matriks.length; il++) {
			for (int j = 0; j < matriks[il].length; j++) {
				System.out.print(matriks[il][j] + " ");
				}
				System.out.println();
			}
			//Menghitung jumlah diagonal
			int d1 = 0;
			int d2 = 0;
			
		for (int i1 = 0; i1 < matriks.length; i1++) {
			for (int j = 0; j < matriks.length; j++) {
				if( i1 == j) {
					d1 = d1 + matriks[i1][j];
					}
				if ( i1+j == n-1) {
					d2 = d2 + matriks[i1][j];
					}
				}
			}
			int hasil = Math.abs(d2-d1);
			System.out.println();
			System.out.print("Hasilnya : " + hasil);
		}
		}
	}

