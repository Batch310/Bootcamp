package simulasi;

import java.util.Scanner;

public class DeretAngka {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input n : ");
		int n = scanner.nextInt();

		int[] deret3 = new int[n];
		int[] deret4 = new int[n];
		int[] deretHasil = new int[n];

		//Deret 3 dikurang 1
		int nAwal = 3;
		for (int i = 0; i < deret3.length; i++) {
			deret3[i] = nAwal - 1;
			nAwal = nAwal + 3;
			if (i == n - 1) {
				System.out.print(deret3[i]);
			} else {
				System.out.print(deret3[i] + ", ");
			}
		}

		System.out.println();

		//Deret 4 dibagi 2
		int nAwal2 = 4;
		for (int i = 0; i < deret4.length; i++) {
			deret4[i] = nAwal2 / 2;
			nAwal2 = nAwal2 + 4;
			if (i == n - 1) {
				System.out.print(deret4[i]);
			} else {
				System.out.print(deret4[i] + ", ");
			}
		}

		System.out.println();

		//Deret Hasil Penjumlahan
		for (int i = 0; i < deretHasil.length; i++) {
			deretHasil[i] = deret3[i] + deret4[i];
			if (i == n - 1) {
				System.out.print(deretHasil[i]);
			} else {
				System.out.print(deretHasil[i] + ", ");
			}

		}
	}
}
