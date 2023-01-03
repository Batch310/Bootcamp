package simulasi.ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// urutkan huruf /karakter dari gabungan bbrp kata sesuai abjad
		// batasan
		// -urut dan pisahkan huruf/karakter dengan tanda |
		// kelompokkan huruf sama
		// diproses sebagai huruf kecil
		// input : sample case
		// output aa|c|ee|l|m|p|ss

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Kalimat: ");
//		String input = scan.nextLine();

		String input = "sample case";

		String vokal = "aeiou";
		String konsonan = "bcdfghjklmnpqrstvwxyz"; 

		input = input.toLowerCase(); 

		String[] arrKalimat = input.split(""); 
		Arrays.sort(arrKalimat);  

		for (int i = 0; i < arrKalimat.length; i++) {
			if (vokal.contains(arrKalimat[i])) {
				System.out.print(arrKalimat[i]);
				if (vokal.contains(arrKalimat[i])) {
					System.out.print(" ");
					vokal = vokal+arrKalimat[i];
				}else if (vokal==vokal) {
					
				}
			}
		}

		for (int i = 0; i < arrKalimat.length; i++) {
			if (konsonan.contains(arrKalimat[i])) { 
				System.out.print(arrKalimat[i]);
				if (konsonan.contains(arrKalimat[i])) {
					System.out.print("|");
				}
			}

		}

	}
}
