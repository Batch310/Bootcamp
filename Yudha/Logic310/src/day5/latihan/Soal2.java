package day5.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Kalimat : ");
		String kalimat = input.nextLine().toLowerCase();
		String [] arrayKalimat = kalimat.split("");
		Arrays.sort(arrayKalimat);
		String vokal =  "aeiou";
		String konsonan = "bcdfghjklmnpqrstvwxyz";
		String vokalKalimat="",konsonanKalimat="";
		for (int i = 0; i < arrayKalimat.length; i++) {
			//System.out.println(kalimat.charAt(i));
			if(vokal.contains(arrayKalimat[i])) {
				vokalKalimat+=arrayKalimat[i];
			}
			if(konsonan.contains(arrayKalimat[i])) {
				konsonanKalimat+=arrayKalimat[i];
			}
			
		}
		System.out.println("Huruf Vokal : " + vokalKalimat);
		System.out.println("Huruf Konsonan : " + konsonanKalimat);
		}

}
