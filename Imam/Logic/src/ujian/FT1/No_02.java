package ujian.FT1;

import java.util.Arrays;
import java.util.Scanner;

public class No_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kalimat = ");
		String kalimat = scanner.nextLine().toLowerCase();

		// pengurutan
		String arrKalimat[] = kalimat.split("");
		Arrays.sort(arrKalimat);

		System.out.println();

		String abjad = "abcdefghijklmopqrstuvwxys";
		String hasil = "";
		String hurufSebelum = "";

		for (int i = 0; i < arrKalimat.length; i++) {
			String hurufSekarang = arrKalimat[i]; // a
			if (abjad.contains(hurufSekarang)) {
				if (hurufSebelum.contains(hurufSekarang)) {

				} else {
					if (!hurufSekarang.equals(hurufSebelum)) { // cek kondisi abjad double
						if (!hurufSebelum.equals("")) {
							hasil = hasil + " - ";
						}
					}
					hasil = hasil + hurufSekarang;
					hurufSebelum = hurufSekarang;

				}

			}

		}

		System.out.println(hasil);

	}

}
