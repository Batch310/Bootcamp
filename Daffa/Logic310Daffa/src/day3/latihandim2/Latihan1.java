package day3.latihandim2;

import java.util.Scanner;

public class Latihan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n  : ");
		int n = input.nextInt();

		System.out.print("Masukkan n2 : ");
		int n2 = input.nextInt();
		
		// Cara pertama
//		System.out.print("i : ");
//		for (int i = 0; i < n; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.print("\n0 : ");
//		for (int o = 1; n > 0; n--) {
//			System.out.print(o + " ");
//			o = o * n2;
//		}

		// Cara kedua
		int b = 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0) {
					System.out.print(j + " ");
				} else {
					System.out.print(b + " ");
					b *= 3;
				}
			}
			System.out.println();
		}
	}

}
