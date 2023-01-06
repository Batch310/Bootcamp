package _KUMPULAN_MATERI;

import java.util.Scanner;

public class Soal1Array2D {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("n: ");
		int n = input.nextInt();

		System.out.println("n2: ");
		int n2 = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int nilaiAwal = 1;

		for (int i = 0; i < n; i++) {

			System.out.print(nilaiAwal + " ");
			nilaiAwal = nilaiAwal * n2;
		}

		// Cara 2: Perulangan bertingkat
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

		// Cara 3 : Array
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
