package day5.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan kalimat: ");
		String kalimat = masukan.nextLine();
		
		String vokal = "aiueo";
		String konsonan = "bcdfghjklmnpqrstvwxyz";
		String hurufVokal = "";
		String hurufKonsonan = "";
		
		String[] arrKalimat = kalimat.toLowerCase().split("");
		
		Arrays.sort(arrKalimat);
		
		for (int i = 0; i < kalimat.length(); i++) {
			String[] arrVokal = vokal.split("");
			String[] arrKonsonan = konsonan.split("");
			
			for (int j = 0; j < arrVokal.length; j++) {
				if (arrKalimat[i].equals(arrVokal[j])) {
					hurufVokal += arrKalimat[i];
				} else if (arrKalimat[i].equals(" ")) {
					hurufVokal += "";
					hurufKonsonan += "";
				}
			}
			for (int k = 0; k < arrKonsonan.length; k++) {
				if (arrKalimat[i].equals(arrKonsonan[k])) {
					hurufKonsonan += arrKalimat[i];
				} else if (arrKalimat[i].equals(" ")) {
					hurufVokal += "";
					hurufKonsonan += "";
				}
			}
		}
		
		System.out.println("Huruf vokal : " + hurufVokal);
		System.out.println("Huruf konsonan : " + hurufKonsonan);
		
	}
}
