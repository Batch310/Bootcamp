package day5.latihan;

import java.util.Scanner;

public class Soal9 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan jalur pelarian Hattori: ");
		String input = masukan.nextLine();
		
		int gunung = 0;
		int lembah = 0;
		int jalur = 0;
		
		String[] arrInput = input.split(" ");
		for (int i = 0; i < arrInput.length; i++) {
			if (arrInput[i].equals("N")) {
				jalur++;
			} else if (arrInput[i].equals("T")) {
				jalur--;
			}
			if ((jalur == 0) && (arrInput[i].equals("T"))) {
				gunung++;
			} else if ((jalur == 0) && (arrInput[i].equals("N"))) {
				lembah++;
			}
//			System.out.print(jalur + " ");
		}
//		System.out.println();
		System.out.println("Gunung yang dilewati Hattori = " + gunung + " Gunung");
		System.out.println("Lembah yang dilewati Hattori = " + lembah + " Lembah");
	}
}
