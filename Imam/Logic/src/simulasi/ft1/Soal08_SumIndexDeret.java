package simulasi.ft1;

import java.util.Scanner;

public class Soal08_SumIndexDeret {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Panjang deret = ");
		int n = scanner.nextInt();

		// 2,5,8,11,14 kelipatan 3 -> (- 1)dikurang 1
		// 2,4,6,8,10 kelipatan 4 ->(/ 2) dibagi 2
		
		//deret 3 dikurang 1
		int found = 0;
		int x = 3;
		int[] arrX = new int[n];

		for (int i = 0; i < n; i++) {
			found = x - 1;
			arrX[i] = found;
			x += 3;
		}

		for (int i : arrX) {
			System.out.print(i + " ");
		}

		System.out.println();

		//deret 4 dibagi 2
		int found2 = 0;
		int y = 4;
		int[] arrY = new int[n];
		for (int i = 0; i < n; i++) {
			found2 = y / 2;
			arrY[i] = found2;
			y += 4;
		}
		for (int i : arrY) {
			System.out.print(i + " ");
		}

		System.out.println();

		int[] arrHasil = new int[n];
		for (int i = 0; i < arrHasil.length; i++) {
			arrHasil[i] = arrX[i] + arrY[i];
		}

		for (int i = 0; i < arrHasil.length; i++) {

			if (i == (n - 1)) {
				System.out.print(arrHasil[i]);
			} else {
				System.out.print(arrHasil[i] + ",");
			}

		}

	}

}
