package ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan kalimat : ");
		String kalimat = scanner.nextLine();

		String karakter = "abcdefghijklmnopqrstuvwxyz";

		String[] arrKalimat = kalimat.toLowerCase().split("");

		Arrays.sort(arrKalimat);

		String hasil = "";

		String hurufSebelumnya = "";

		for (int i = (arrKalimat.length - 1); i >= 0; i--) {
			String hurufSekarang = arrKalimat[i];
			if (karakter.contains(hurufSekarang)) {
				if ((hurufSekarang.equals(hurufSebelumnya))) {
					hasil = hasil + "";
				} else {
					if (!(hurufSebelumnya.equals(""))) {
						hasil = hasil + " - ";
					}
				}
				hasil = hasil + hurufSekarang;
				hurufSebelumnya = hurufSekarang;
			}
		}
		System.out.println(hasil);
		scanner.close();
	}

}
