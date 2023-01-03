package day5.latihan;

import java.util.Scanner;

public class Soal01_DeretGanjilGenap {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan n = ");
		int n = scanner.nextInt();

		if (n > 0) {

			for (int i = 1; i <= n; i++) {  //atau bisa i di += 2 aja
				if (i % 2 != 0) {
					System.out.print(i + " "); //bil ganjil
				}
			}

			System.out.println();

			for (int i = 1; i <= n; i++) {     //bil genap
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}

		} else {
			System.out.print("n harus bilangan positif!!!");
		}
		System.exit(0);

	}

}
