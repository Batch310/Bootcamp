package day4.latihan3;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan n = ");
		int n = scanner.nextInt();

		int[] arrN = new int[n];

		for (int i = 0; i < arrN.length; i++) {

			arrN[i] = scanner.nextInt();
		}

		int max = 0;
		int jumlahMax = 0;
		for (int i = 0; i < arrN.length; i++) {
			if (arrN[i] > max) {
				max = arrN[i];
				jumlahMax = 0;
			}
			if (arrN[i] == max) {

				jumlahMax++;
			}

		}

		System.out.print(" jumlah candle max = " + jumlahMax);
	}

}
