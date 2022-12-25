package day5.latihan;

import java.util.Scanner;

public class exam9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Jalur Pelarian N dan T = ");
		String jalur = input.nextLine();
		
		// Meng split spasi
		String[] arrJalur = jalur.split(" ");
		
		int awal = 0;
		int gunung = 0;
		int lembah = 0;
		
		// Me looping panjang jalur
		for (int i = 0; i < arrJalur.length; i++) {
			// Jika menginputkan N maka +1
			if (arrJalur[i].equals("N")) {
				awal++;
				// Jika menginputkan T maka -1
			} else if (arrJalur[i].equals("T")) {
				awal--;
				// Jika yang diiputkan tidak sesuai maka inputan tidak valid
			} else {
				System.out.print("Inputan tidak Valid");
				System.exit(0);
			}
			
			// Jika awal = 0 maka akan +1 gunung
			if(awal == 0 && arrJalur[i].equals("T")) {
				gunung++;
				// jika awal = 0 maka +1 lembah
			}else if(awal==0 && arrJalur[i].equals("N")) {
				lembah++;
			}
		}

		System.out.print("Gunung = "+gunung);
		System.out.print(" Lembah = "+lembah);
	}

}
