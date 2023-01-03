package simulasift1;

import java.util.Scanner;

public class soal9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan jalur N dan T = "); // N N T N N T T
		String jalur = input.nextLine();

		String[] arrJalur = jalur.split(" ");

		int awal = 0; // 
		int gunung = 0;
		int lembah = 0;

		for (int i = 0; i < arrJalur.length; i++) {

			if (arrJalur[i].equals("N")) {
				awal++;
			} else if (arrJalur[i].equals("T")) {
				awal--;
			}

			if (awal == 0 && arrJalur[i].equals("T")) {
				gunung++;

			} else if (awal == 0 && arrJalur[i].equals("N")) {
				lembah++;
			}
		}

		System.out.print("Gunung = " + gunung);
		System.out.print(" Lembah = " + lembah);

	}

}
