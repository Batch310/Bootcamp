package day3.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan ordo: ");
		int ordo = masukan.nextInt(); 
		
		int[][] matriks = new int[ordo][ordo];
		
		int leftToRight = 0;
		int rightToLeft = 0;
		
		for (int i = 0; i < matriks.length; i++) {
			for (int j = 0; j < matriks[i].length; j++) {
				System.out.print("Masukkan angka: ");
				matriks[i][j] = masukan.nextInt();
				if (j == i) {
					leftToRight += matriks[i][j];
				} 
				if (j + i == (ordo-1)) {
					rightToLeft += matriks[i][j];
				}
			}
		}
		
		for (int i = 0; i < matriks.length; i++) {
			for (int j = 0; j < matriks[i].length; j++) {
				System.out.print(matriks[i][j] + " ");
			}
			System.out.println();
			
		}
		
		int diff = (leftToRight-rightToLeft);
		if (diff >= 0) {
			System.out.println("Selisih: " + diff);
		} else {
			diff *= -1;
			System.out.println("Selisih: " + diff);
		}
		
	}
}