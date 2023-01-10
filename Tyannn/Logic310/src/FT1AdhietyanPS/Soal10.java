package FT1AdhietyanPS;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n : ");
		int n = input.nextInt();

		int[] arr3 = new int[n];
		int[] arr4 = new int[n];
		int[] tampung = new int[n];

		int tampungA = 0;
		System.out.print("Kelipatan 3 :");
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 0) {
				arr3[i] = (tampungA += 3) - 1;
				System.out.print(arr3[i] + " ");
			}
		}

		System.out.println();
		int tampungB = 0;
		System.out.print("Kelipatan 4 :");
		for (int i = 0; i < arr4.length; i++) {
			if (arr4[i] == 0) {
				arr4[i] = (tampungB += 4) / 2;
				System.out.print(arr4[i] + " ");

			}
		}

		System.out.println();
		int tampungC = 0;
		System.out.print("Output = ");
		for (int i = 0; i < tampung.length; i++) {
			tampung[i] = arr4[i] + arr3[i];
			System.out.print(tampung[i]+" ");
		}
		
		System.out.println();
		for (int i = 0; i < tampung.length; i+=4) {
			tampung[i] = arr4[i] + arr3[i];
			if (tampung[i]%3 == 0) {
				System.out.print(tampung[i]+" ");
			}
		}

	}

}
