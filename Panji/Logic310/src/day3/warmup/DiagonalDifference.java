package day3.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int data, hasil_a = 0, hasil_b = 0, hasil = 0;
		System.out.print("Jumlah baris dan kolom : ");
		data = input.nextInt();

		int[][] my_array = new int[data][data];

		// Input data array
		for (int i = 0; i < data; i++) {
			for (int j = 0; j < data; j++) {
				System.out.print("= ");
				my_array[i][j] = input.nextInt();

			}
			System.out.println();

		}

		// Cetak data berdasarkan baris dan kolom
		for (int i = 0; i < my_array.length; i++) {
			for (int j = 0; j < my_array[i].length; j++) {
				System.out.print(my_array[i][j] + " ");
			}
			System.out.println();
		}

		int dig1 = 0, dig2 = 0;

		// Menghitung nilai matriks secara diagonal
		for (int i = 0; i < my_array.length; i++) {
			for (int j = 0; j < my_array[i].length; j++) {
				if (i == j) {
					dig1 += my_array[i][j];
				} else if (i + j == data - 1) {
					dig2 += my_array[i][j];
				}
			}

		}
		System.out.println("Output : ");

		hasil = dig2-dig1;
		System.out.println(Math.abs(hasil));
		
//		System.out.println();

	}
}