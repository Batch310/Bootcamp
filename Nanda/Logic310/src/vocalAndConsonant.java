package LatihanLagi;

import java.util.Iterator;
import java.util.Scanner;

public class vocalAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Kalimat : ");
		String kalimat = input.nextLine();
		
		String[] kata = kalimat.toLowerCase().split("");
		
		String vokal = "aiueo";
		String konsonan = "bcdfghjklmnpqrstvwxyz";
		
		String hasilVokal = "";
		String hasilKonsonan = "";
		
		for (int i = 0; i < kata.length; i++) {
			if(vokal.contains(kata[i])) {
				hasilVokal += kata[i];
			}
		}
		
		for (int i = 0; i < kata.length; i++) {
			if(konsonan.contains(kata[i])) {
				hasilKonsonan += kata[i];
			}
		}
		
		System.out.print("Vowel Carracters : ");
		System.out.println();
		System.out.print(hasilVokal);
		System.out.println();
		System.out.print("Consonant Caracters : ");
		System.out.println();
		System.out.print(hasilKonsonan);
	}

}
