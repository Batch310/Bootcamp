package materiku.soal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soal02_VocKonsonan {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kalimat = ");// Sample Case
		String kalimat = scanner.nextLine().toLowerCase(); // sample case

		String[] arrKalimat = kalimat.split("");

		// tipe double, menghapus duplicate data/mengembalikan nilai beda
//		arrKalimat = Arrays.stream(arrKalimat).distinct().toArray(String[]::new);
		// convert array ori

		String voc = "aiueo";
		String kon = "qwrtypsdfghjklzxcvbnm";
		String hurufVoc = "ae";
		String hurufKon = "";

		for (int i = 0; i < arrKalimat.length; i++) { 
			if (voc.contains(arrKalimat[i])) {
				if (hurufVoc.contains(arrKalimat[i])) {
				} else {
					hurufVoc = hurufVoc + arrKalimat[i];
				}
			} else if (kon.contains(arrKalimat[i])) {
				if (hurufKon.contains(arrKalimat[i])) {
				} else {
					hurufKon = hurufKon + arrKalimat[i];
				}
			}
		}

		System.out.print("Huruf vocal = " + hurufVoc);
		System.out.println();
		System.out.print("Huruf konsonan = " + hurufKon);
	}

}
