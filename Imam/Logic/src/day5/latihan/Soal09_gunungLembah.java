package day5.latihan;

import java.util.Scanner;

public class Soal09_gunungLembah {

	public static void main(String[] args) {

		//N N T N N N T T T T T N T T T N T N
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan simbol =");
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

			if (batas == 0) {  //cek batas setelah naik/turung = 1 gunung/lembah
				if (simbol[i].equals("N")) {
					lembah++;

				} else if (simbol[i].equals("T")) {
					gunung++;

				}

			}

		}

		System.out.print("Gunung = " + gunung);
		System.out.println();
		System.out.print("Lembah = " + lembah);

	}

}
