package day5.test;

import java.util.Iterator;
import java.util.Scanner;

public class Soal1GanjilGenap {

	public static void main(String[] args) {

		// Program bilangan ganjil genap,
		// baris atas ganjil
		// baris bawah ganjil
		Scanner input = new Scanner(System.in);

		int data;
		System.out.print("n : ");
		data = input.nextInt();

		for (int i = 1; i <= data; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int i = 1; i <= data; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
