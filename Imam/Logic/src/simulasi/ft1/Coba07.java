package simulasi.ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Coba07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Kalimat = ");
		String kalimat = scanner.nextLine().toLowerCase();

		String[] arrKalimat = kalimat.split("");
		Arrays.sort(arrKalimat);

		String abjad = "abcdefghijklmnopqrstuvwxyz";
		String hasil = "";
		String hurufSebelumnya="";
		for (int i = 0; i < arrKalimat.length; i++) {
			String hurufSekarang = arrKalimat[i];
			
			if (abjad.contains(hurufSekarang)) {
				if (!hurufSebelumnya.contains(hurufSekarang)) {
					if(!hurufSekarang.contains(hurufSebelumnya))
					hasil = hasil + " | ";
				}
				hasil = hasil + hurufSekarang;
				hurufSebelumnya = hurufSekarang;
			}
		}

		System.out.print(hasil);
	}

}
