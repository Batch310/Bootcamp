package ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan nama buah : ");
		String namaBuah = scanner.nextLine();
		namaBuah = namaBuah.toLowerCase();
		String[] arrBuah = namaBuah.split("");
		scanner.close();
		String vokal = "aeiou";

		Arrays.sort(arrBuah);

		int found = 0;
		int harga = 0;
		for (int i = 0; i < arrBuah.length; i++) {
			if (vokal.contains(arrBuah[i])) {
				if (namaBuah.contains("i") || namaBuah.contains("u")) {
					found++;
					harga = found * 10000;
				} else if (namaBuah.contains("a") && namaBuah.contains("e")) {
					found++;
					harga = (found * 10000) - 10000;
				} else if (namaBuah.contains("a")) {
					found++;
					harga = (found * 10000) / found;
				}
			}
		}
		System.out.println(harga);
	}
}
//pisang, anggur, jeruk -> tidak
//semangka 30000 -> 20000
//nanas 20000 -> 10000
//banana 30000 -> 10000
//pepaya 30000 -> 20000