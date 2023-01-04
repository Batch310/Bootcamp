package simulasi.ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kalimat = ");// Sample Case
		String kalimat = scanner.nextLine().toLowerCase(); // sample case

		String[] arrKalimat = kalimat.split("");
		Arrays.sort(arrKalimat);
		for (String string : arrKalimat) {
			System.out.print(string + " | ");
		}

		System.out.println();

		String abjad = "aiueoqwrtypsdfghjklzxcvbnm";
		String hurufKel = "";

		for (int i = 1; i < arrKalimat.length + 1; i++) {
			if (abjad.contains(arrKalimat[i])) {
				hurufKel = hurufKel + arrKalimat[i];
				if (hurufKel.contains(arrKalimat[i])) {
					hurufKel = hurufKel + arrKalimat[i];
				} else {
					hurufKel = hurufKel + " | ";
				}
			} 
		}

		System.out.println(hurufKel);

	}

}