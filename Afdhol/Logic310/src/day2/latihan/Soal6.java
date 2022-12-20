package day2.latihan;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("input: ");
		int angka = input.nextInt();

		int awal = 1;

		for (int i = 0; i < angka; i++) {

			if (awal % 3 == 0) {
				System.out.print("*" + " ");

			} else {
				System.out.print(awal + " ");
			}
			awal = awal + 4;

		}

	}

}
