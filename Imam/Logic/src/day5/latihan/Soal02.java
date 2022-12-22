package day5.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kalimat = ");
		String kalimat = scanner.nextLine().toLowerCase();

		String[] arrKalimat = kalimat.split("");
		Arrays.sort(arrKalimat);

//		for (String string : arrKalimat) {
//		System.out.print(string);
//		}
//		
//		System.exit(0);

		String voc = "aiueo";
		String kon = "qwrtypsdfghjklzxcvbnm";
		String hurufVoc = "";
		String hurufKon = "";
		for (int i = 0; i < arrKalimat.length; i++) {
			if (voc.contains(arrKalimat[i])) {
				hurufVoc = hurufVoc + arrKalimat[i];
			} else if (kon.contains(arrKalimat[i])) {
				hurufKon = hurufKon + arrKalimat[i];
			}

		}

		System.out.print("Huruf vocal = " + hurufVoc);
		System.out.println();
		System.out.print("Huruf konsonan = " + hurufKon);

//		String[] arrVocal = new String[] { "a", "e", "i", "o", "u" };

//		String[] voc= new String[];
//		String[] kon=new String[];
//		for (int i = 0; i < arrVocal.length; i++) {
//		        if(n.contains(arrVocal[i])) {
//		        	voc=arrVocal[i];
//		        }else if(n.contains(arrVocal[1])){
//		        	
//		        }
//			

	}

}
