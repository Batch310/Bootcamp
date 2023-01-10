package FT1AdhietyanPS;

import java.util.Scanner;

public class Soal04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n = ");
		int n = input.nextInt();

		int[] arr = new int[n];

		int nilaiAwal = 3;
		for (int index = 0; index < arr.length; nilaiAwal += 3) {
			if (nilaiAwal % 2 == 0) {
				arr[index] = nilaiAwal;
				index++;
			}
			
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
