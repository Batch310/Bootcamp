package ft1;

import java.util.Scanner;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan jalur : ");
		String[] input = scanner.nextLine().split(" ");

		int gunung = 0;
		int lembah = 0;
		int jalur = 0;
		int max = 0;
		int min = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("N")) {
				jalur++;
				if (jalur>max) {
					max = jalur;
				}
			} else if (input[i].equals("T")) {
				jalur--;
				if (jalur<min) {
					min = jalur;
				}
			}
			if ((input[i].equals("T") && (jalur == 0))) {
				gunung++;
			} else if ((input[i].equals("N") && jalur == 0)) {
				lembah++;
			}
		}
		System.out.println("Gunung yang sudah dilewati = " + gunung);
		System.out.println("Lembah yang sudah dilewati = " + lembah);
		System.out.println("Titik tertinggi = " + max);
		System.out.println("Titik terendah = " + min);
		scanner.close();
	}

}
