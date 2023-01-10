package FT1AdhietyanPS;

import java.util.Scanner;

public class Soal06 {

	public static void main(String[] args) {

		// Contoh seperti berikut N N T N N N T T T T T N T T T N T N

		Scanner input = new Scanner(System.in);

		System.out.println("masukan perjalanan N atau T ");
		String jalur = input.nextLine();

		String[] arrJalur = jalur.split("");

		int awal = 0;
		int gunung = 0;
		int lembah = 0;
		int max = 0;
		int min = 0 ;
		for (int i = 0; i < arrJalur.length; i++) {
			if (arrJalur[i].equals("N")) {
				awal++;
				if (awal > max) {
					max = awal;
				}
			} else if (arrJalur[i].equals("T")) {
				awal--;
				if (awal < min) {
					min = awal;
				}
			}

			if (awal == 0 && arrJalur[i].equals("T")) {
				gunung++;
			} else if (awal == 0 && arrJalur[i].equals("N")) {
				lembah++;
			}
		}

		System.out.println();
		System.out.println("Gunung = " + gunung);
		System.out.println("Lembah = " + lembah);
		System.out.println("max = "+ max);
		System.out.println("min = "+ min);

	}

}
