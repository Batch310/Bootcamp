package ujian.FT1;

import java.util.Scanner;

public class No_06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan simbol = ");
		String[] simbol = scanner.nextLine().split(" ");

		int batas = 0;
		int gunung = 0;
		int lembah = 0;

		for (int i = 0; i < simbol.length; i++) {

			if (simbol[i].equals("N")) {
				batas++;

			} else if (simbol[i].equals("T")) {
				batas--;

			}

			if (batas == 0) {
				if (simbol[i].equals("N")) {
					lembah++;

				} else if (simbol[i].equals("T")) {
					gunung++;

				}

			}

		}
		System.out.println("Gunung = " + gunung);
		System.out.println();
		System.out.println("Lembah = " + lembah);

	}

}
