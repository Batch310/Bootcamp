package day3.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int data, hasil_a = 0, hasil_b = 0 , hasil=0;
		System.out.print("Jumlah baris dan kolom : ");
		data = input.nextInt();

		int[][] my_array = new int[data][data];

		for (int i = 0; i < data; i++) {
			for (int j = 0; j < data; j++) {

				System.out.print(" = ");
				my_array[i][j] = input.nextInt();

			}
			System.out.println();

		}

		System.out.println("Output : ");

		hasil_a = my_array[0][0] + my_array[1][1] + my_array[2][2];
		hasil_b = my_array[0][2] + my_array[1][1] + my_array[2][0];
		hasil = hasil_a-hasil_b;
		
		System.out.println(Math.abs(hasil));
		
		System.out.println();

	}
}