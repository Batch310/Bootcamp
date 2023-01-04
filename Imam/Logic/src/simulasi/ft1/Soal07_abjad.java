package simulasi.ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07_abjad {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kalimat = ");// Sample Case
		String kalimat = scanner.nextLine().toLowerCase(); // sample case

		String[] arrKalimat = kalimat.split("");
		Arrays.sort(arrKalimat);

		System.out.println();

		String abjad = "aiueoqwrtypsdfghjklzxcvbnm";
		String hasil = "";
		String hurufSebelumnya = "";

		for (int i = 0; i < arrKalimat.length; i++) {
			String hurufSekarang = arrKalimat[i];
			if (abjad.contains(hurufSekarang)) {
				if (!hurufSekarang.equals(hurufSebelumnya)) {
					if (!hurufSebelumnya.equals("")) {
						hasil = hasil + " | ";
					}
				}
				
				hasil=hasil+hurufSekarang;
				hurufSebelumnya=hurufSekarang;
			}

		}
		System.out.println(hasil);
	}

}
