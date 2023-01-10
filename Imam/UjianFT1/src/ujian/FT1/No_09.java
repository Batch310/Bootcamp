package ujian.FT1;

import java.util.Scanner;

public class No_09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nama Buah = ");

		String[] arrBuah = scanner.nextLine().toLowerCase().split("");
		String vocal = "aeiou";
		String cekVocal = "";
		int found = 0;

		for (int i = 0; i < arrBuah.length; i++) {
			if (vocal.contains(arrBuah[i])) {
				cekVocal = cekVocal + arrBuah[i];
				found++;
			}
		}

		int harga = found * 10;

		System.out.print("Harga buah per kg = " + harga);
	}

}
