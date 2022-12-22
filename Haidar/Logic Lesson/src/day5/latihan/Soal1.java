package day5.latihan;

import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan n:");
		int n = masukan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
//		for (int i = 0; i < 2; i++) {
//			for (int j = 1; j <= n; j++) {
//				if (i == 0) {
//					if (j%2 != 0) {
//						System.out.print(j + " ");
//					}
//				} else	if (i == 1) {
//					if (j%2 == 0) {
//						System.out.print(j + " ");
//					}
//				}
//			}
//			System.out.println();
//		}
	}
}
