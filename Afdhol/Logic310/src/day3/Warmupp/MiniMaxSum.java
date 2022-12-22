package day3.Warmupp;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		Scanner scan = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {

			System.out.println("Masukkan angka: ");
			array[i] = scan.nextInt();

		}

		// Cara 1
		int temp = 0; // variabel pembantu
		int min = 0;
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			temp = 0; // untuk mereset
			for (int j = 0; j < array.length; j++) {
				if (i != j) {// nilai i dan j tidak boleh sama, jadi kondisi true apabila berbeda
					temp = temp + array[i];
				}

			}

			if (min == 0) {
				min = temp;
			}
			if (temp < min) {
				min = temp;
			}
			if (temp > max) {
				max = temp;
			}
		}
		
		System.out.println();
		System.out.println(min);
		System.out.println(max);

	}

}
