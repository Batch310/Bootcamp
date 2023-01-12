package ujian.FT1;

import java.util.Scanner;

public class No_10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Panjang deret = ");
		int n = scanner.nextInt();

		// deret 3 dikurang 1
		int found = 0;
		int x = 3;
		int[] arrX = new int[n];

		for (int i = 0; i < arrX.length; i++) {
			found = x - 1;
			arrX[i] = found;
			x += 3;
		}

		for (int i : arrX) {
			System.out.print(i + " ");
		}

		System.out.println();

		// deret 4 dibagi 2
		int found2 = 0;
		int y = 4;
		int[] arrY = new int[n];

		for (int i = 0; i < arrY.length; i++) {
			found2 = y / 2;
			arrY[i] = found2;
			y += 4;
		}

		for (int i : arrY) {
			System.out.print(i + " ");
		}
		System.out.println();

		// penjumlahan index
		int[] arrHasil = new int[n];
		for (int i = 0; i < arrY.length; i++) {// index genap -, //ganjil tambah

			if (i % 2 == 0) {
				arrHasil[i] = arrX[i] - arrY[i];

			} else {
				arrHasil[i] = arrX[i] + arrY[i];
			}

		}

		// Cetak hasil penjumlahan
		for (int i = 0; i < arrY.length; i++) {

			if (i == (n - 1)) {
				System.out.print(arrHasil[i]);
			} else {
				System.out.print(arrHasil[i] + ",");
			}

		}

	}

}
