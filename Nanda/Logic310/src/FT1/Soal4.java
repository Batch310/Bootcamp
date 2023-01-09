package FT1;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("input n : ");
		int n = scanner.nextInt();

		int[] arrN = new int[n];
		int nilaiAwal = 3;
		arrN[0] = nilaiAwal;

		for (int i = 0; i < n; 	nilaiAwal += 3) {
			if (nilaiAwal % 2 == 0) {
				arrN[i] = nilaiAwal;
				i++;
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.print(arrN[i] + " ");
		}
	}
}