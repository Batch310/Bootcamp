package day8.present;

import java.util.Scanner;

public class Soal9Tyan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Jalur Pelarian N dan T = ");
		String jalur = input.nextLine();

		// Meng split spasi
		String[] arrJalur = jalur.split(" "); // N T T T N

		int awal = 0; // -1
		int gunung = 0; // 0
		int lembah = 0; // 0
		int min = 0; // -2
		int max = 0; // 1

		// Me looping panjang jalur
		for (int i = 0; i < arrJalur.length; i++) { // i = 5; 5<5; arrJalur.length = 5;
			// Jika menginputkan N maka +1
			if (arrJalur[i].equals("N")) { // arrJalur[4] = N 
				awal++;
				if(awal>max) {
					max = awal;
				}
				// Jika menginputkan T maka -1
			} else if (arrJalur[i].equals("T")) { // 
				awal--;
				if(awal<min) {
					min=awal;
				}
				// Jika yang diiputkan tidak sesuai maka inputan tidak valid
			} else {
				System.out.print("Inputan tidak Valid");
				System.exit(0);
			}

//			if()
				
			// Jika awal = 0 maka akan +1 gunung
			if (awal == 0 && arrJalur[i].equals("T")) {
				gunung++;
				// jika awal = 0 maka +1 lembah
			} else if (awal == 0 && arrJalur[i].equals("N")) {
				lembah++;
			}
			
		}

		System.out.print("Gunung = " + gunung);
		System.out.print(" Lembah = " + lembah);
		System.out.println();
		System.out.print("Max tempuh hatori = "+max);
		System.out.print(" Min tempuh hatori = "+min);

	}

}
