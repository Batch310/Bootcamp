package day3.latihan;

import java.util.Iterator;

public class Latihan1 {
	public static void main(String[] args) {
		//n =7, n2 = 3
		//0 1 2 3 4 5 6
		//1 3 9 27 81 243 729
		
		int n = 7;
		int n2 = 3;
		
		//Cara 1: Tanpa Array, tanpa perulangan bertingkat
		int a = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.print(a+" ");
			a = a * n2;
		}
		
		//Cara 2: Perulangan bertingkat
//		int b = 1;
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < n; j++) {
//				if(i==0) {
//					System.out.print(j + " ");
//				} else {
//					System.out.print(b + " ");
//					b = b* n2;
//				}
//			}
//			System.out.println();
//		}
		
		//Cara 3 : Array
//		int[][] array2D = new int[2][n];
//		int c = 1;
//		for (int i = 0; i < array2D.length; i++) {
//			for (int j = 0; j < array2D[i].length; j++) {
//				if(i == 0) {
//					array2D[i][j] = j;
//					System.out.print(array2D[i][j]+" ");
//				} else {
//					array2D[i][j] = c;
//					System.out.print(array2D[i][j]+" ");
//					c = c * n2;
//				}
//				
//			}
//			System.out.println();
//		}
		
	}
}
