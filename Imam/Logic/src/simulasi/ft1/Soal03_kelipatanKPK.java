package simulasi.ft1;

import java.util.Scanner;

public class Soal03_kelipatanKPK {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int n = scanner.nextInt();

		int[] arrHasil = new int[n];

		int found = 0;
		int nilaiAwal = 5; // kelipatan terkecil

		while (found < n) {

			if (nilaiAwal % 5 == 0 && nilaiAwal % 8 == 0) {
				arrHasil[found] = nilaiAwal;
				found++;
			}
			nilaiAwal += 5;
		}

		for (int i : arrHasil) {
			System.out.print(i + " ");
		}

	}
}
