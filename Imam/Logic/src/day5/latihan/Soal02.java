package day5.latihan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soal02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kalimat = ");
		String kalimat = scanner.nextLine().toLowerCase();

		String[] arrKalimat = kalimat.split("");
		Arrays.sort(arrKalimat);

		                                        // tipe double, menghapus duplicate data/mengembalikan nilai beda
		arrKalimat = Arrays.stream(arrKalimat).distinct().toArray(String[]::new);
		                                                  // convert array ori

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
//		
//		String[] newVoc = hurufVoc.split("");
	
//		
//		int found=0;
//		String[] NewVoc= new String[newVoc.length];
//		for (int j = 1; j < newVoc.length; j++) {
//			
//			if (newVoc[j].equals(newVoc[j-1])) {
//				NewVoc[found] = newVoc[j];
//				found++;
//			} else {
//				NewVoc[found] = newVoc[j];
//			}
//		}
		

		System.out.print("Huruf vocal = " + hurufVoc);
		System.out.println();
		System.out.print("Huruf konsonan = " + hurufKon);

	}

}
