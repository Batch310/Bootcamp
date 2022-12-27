package day5.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Kalimat : ");
		String kalimat = input.nextLine().toLowerCase();// kalimat berupa input yang telah diubah huruf kecil
		String[] arrayKalimat = kalimat.split(""); // yykw => y,y,k,w
		Arrays.sort(arrayKalimat);// y, y, k, w => k, w, y, y
		String vokal = "aeiou";
		String konsonan = "bcdfghjklmnpqrstvwxyz";
		String vokalKalimat = "", konsonanKalimat = "";
		for (int i = 0; i < arrayKalimat.length; i++) {// perulangan untuk setiap
			// System.out.println(kalimat.charAt(i));
			if (vokal.contains(arrayKalimat[i])) {
				if (!(vokalKalimat.contains(arrayKalimat[i]))) {
					vokalKalimat += arrayKalimat[i];
				} 
			}
			if ((konsonan.contains(arrayKalimat[i]))) {
				if (!(konsonanKalimat.contains(arrayKalimat[i]))) {
					konsonanKalimat += arrayKalimat[i];
				}
			}

		}
		System.out.println("Huruf Vokal : " + vokalKalimat);
		System.out.println("Huruf Konsonan : " + konsonanKalimat);
	}// challege : cetak vokal dan konsonan unik

}
