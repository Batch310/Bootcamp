package simulasift1;

import java.util.Arrays;
import java.util.Scanner;

public class soal7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// variable bantu kumpulan karakter
		String abjad = "abcdefghijklmnopqrstuvwxyz";

		System.out.print("input n : ");
		String kata = input.nextLine().toLowerCase();

		// split Array
		String[] arrKata = kata.split("");

		// Sorting Array
		Arrays.sort(arrKata);

		// variable bantu hasil
		String a = "";

		// variable baru, menyimpan huruf sebelumnya
		String hurufSebelumnya = "";

		for (int i = 0; i < arrKata.length; i++) {

			// contains = mengandung
			if (abjad.contains(arrKata[i])) {
				if (!arrKata[i].equals(hurufSebelumnya)) {
					if (!hurufSebelumnya.equals("")) {
						a = a + " | ";
					}
				}
				a = a + arrKata[i];
				hurufSebelumnya = arrKata[i];
			}

		}
		System.out.println();
		System.out.print(a);

	}

}
