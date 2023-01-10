package filteringtest1;

import java.util.Scanner;

public class Soal10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input panjang deret : ");
		int panjangDeret = input.nextInt();

		int[] deret3 = new int[panjangDeret];
		int[] deret4 = new int[panjangDeret];

		int[] deretHasil = new int[panjangDeret];

		// Menetukan deret kelipatan 3 dikurangi 1
		int nilaiAwal = 3;
		for (int i = 0; i < deret3.length; i++) {
			deret3[i] = nilaiAwal - 1;
			nilaiAwal = nilaiAwal + 3;
			if (i == panjangDeret - 1) {
				System.out.print(deret3[i]);
			} else {
				System.out.print(deret3[i] + ", ");
			}
		}
		System.out.println();
		// Menentukan deret kelipatan 4 dibagi 2
		int nilaiAwal2 = 4;
		for (int i = 0; i < deret4.length; i++) {
			deret4[i] = nilaiAwal2 / 2;
			nilaiAwal2 = nilaiAwal2 + 4;
			if (i == panjangDeret - 1) {
				System.out.print(deret4[i]);
			} else {
				System.out.print(deret4[i] + ", ");
			}
		}
		System.out.println();

		// Menjumlahkan nilai genap dan ganjil antar deret
		for (int i = 0; i < deretHasil.length; i++) {
			deretHasil[i] = deret3[i] + deret4[i];
			if (i == panjangDeret - 1) {
				System.out.print(deretHasil[i]);
			} else {
				System.out.print(deretHasil[i] + ", ");
			}
		}
	}

}
