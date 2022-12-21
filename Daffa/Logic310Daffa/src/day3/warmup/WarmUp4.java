package day3.warmup;

import java.util.Scanner;

public class WarmUp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan ordo : ");
		int ord = input.nextInt();

		int[][] matriqz = new int[ord][ord];

		int dia1, dia2, diadiff;

		dia1 = 0;
		dia2 = 0;

		for (int i = 0; i < matriqz.length; i++) {
			for (int j = 0; j < matriqz.length; j++) {
				System.out.print("Masukkan angka : ");
				matriqz[i][j] = input.nextInt();
				if (i == j) {
					dia1 += matriqz[i][j];
				}
				if (i == ord - j - 1) {
					dia2 += matriqz[i][j];
				}
			}
		}
		diadiff = dia1 - dia2;
		if (diadiff >= 0) {
			System.out.println("Hasilnya adalah " + diadiff);
		} else {
			diadiff *= -1;
			System.out.println("Hasilnya adalah " + diadiff);
		}
	}

}     
