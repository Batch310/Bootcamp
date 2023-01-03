package SimulasiFT1;

import java.util.Scanner;

public class Soal09GunungLembah {
	public static void main(String[] args) {
		//Gunung = Naik dan Turun dari 0 ke 0
		//Lembah = Turun ke Naik dari 0 ke 0
		//N N T N N N T T T T T N T T T N T N
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan jalur ekspedisi : ");
		String[] jalur = masukan.nextLine().toLowerCase().split(" ");
		
		int tinggi = 0;
		int gunung = 0;
		int lembah = 0;
		
		for (int i = 0; i < jalur.length; i++) {
			if (jalur[i].equals("n")) {
				tinggi++;
			} else if (jalur[i].equals("t")) {
				tinggi--;
			}
			if ((jalur[i].equals("t")) && (tinggi == 0)) {
				gunung++;
			} else if ((jalur[i].equals("n")) && (tinggi == 0)) {
				lembah++;
			}
		}
		System.out.println("Gunung yang sudah dilewati Tian = " + gunung);
		System.out.println("Lembah yang sudah dilewati Tian = " + lembah);
		masukan.close();
	}
}
