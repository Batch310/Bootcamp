package simulasiFT1;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Input data panjang array
		System.out.print("Input Panjang Array : ");
		int data = input.nextInt();

		int[] bil3 = new int[data];
		int[] bil4 = new int[data];

		int a = 0;
		int b = 0;

		for (int i = 1; i < data; i++) {
			a = (i * 4) - 1;
			bil3[i] = a;
			System.out.print(bil3[i] + " ");
		}
//		System.out.println();
//		for (int i = 1; i <= data; i++) {
//			bil4[i] = (i * 3) / 2;
//			System.out.print(bil4[i] + " ");
//		}

	}

}
