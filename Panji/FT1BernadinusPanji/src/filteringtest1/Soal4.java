package filteringtest1;

import java.util.Scanner;

public class Soal4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input n :");
		int n = input.nextInt();

		int[] arr = new int[n];
		// int index = 0; // variabl index awal untuk array

		int nilaiAwal = 3;

//		while (index < n) {
//			if (nilaiAwal % 2 == 0) {
//				arr[index] = nilaiAwal;
//				index++;
//			}
//			nilaiAwal += 3;
//		}
//		
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}

		for (int index = 0; index < n; index++) {
			if (nilaiAwal % 2 == 0) {
				arr[index] = nilaiAwal;
			}
			nilaiAwal += 3;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
