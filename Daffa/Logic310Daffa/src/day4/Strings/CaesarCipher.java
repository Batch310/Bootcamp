package day4.Strings;

import java.util.Iterator;
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan kata : ");
		String kata = input.nextLine();

		System.out.print("Masukkan banyak geser : ");
		int geser = input.nextInt();

		String kecil = "abcdefghijklmnopqrstuvwxyz";
		String besar = kecil.toUpperCase();

		String[] arrKecil = kecil.split("");
		String[] arrBesar = besar.split("");
		String[] arrKata = kata.split("");

		for (int i = 0; i < arrKata.length; i++) {
			if (kecil.contains(arrKata[i])) {
				for (int j = 0; j < arrKecil.length; j++) {
					if (arrKecil[j].equals(arrKata[i])) {
						arrKata[i] = arrKecil[(j + geser) % arrKecil.length];
						break;
					}
				}
			} else if (besar.contains(arrKata[i])) {
				for (int j = 0; j < arrBesar.length; j++) {
					if (arrBesar[j].equals(arrKata[i])) {
						arrKata[i] = arrBesar[(j + geser) % arrBesar.length];
						break;
					}
				}
			}
		}
		for (int i = 0; i < arrKata.length; i++) {
			System.out.print(arrKata[i]);
		}

	}
}
