package simulasi.ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kalimat = ");// Sample Case
		String kalimat = scanner.nextLine().toLowerCase(); // sample case

		String[] arrKalimat = kalimat.split("");
	
		for (String string : arrKalimat) {
			System.out.print(string + " | ");
		}

		System.out.println();
		
		String abjad = "aiueoqwrtypsdfghjklzxcvbnm";
		String hurufKel = "";

		for (int i = 0; i < arrKalimat.length; i++) {
			if (abjad.contains(arrKalimat[i])) {
					hurufKel = hurufKel + arrKalimat[i];
			}
		}
		Arrays.sort(arrKalimat);
	}

}
