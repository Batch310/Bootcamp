package day2.latihan2d;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.print("n2 = ");
		int n2 = input.nextInt();

		int awal = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int j = 0; j < n; j++) {

			System.out.print(awal + " ");
			awal *= n2;
			if(j%n2 == 1 ) {
				System.out.print("-");
			}

		}

	}

}
