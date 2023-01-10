package FT1AdhietyanPS;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Variable bantu karakter
		String abjad = "abcdefghijklmnopqrstuvwxyz";

		System.out.print("Input n : ");
		String kata = input.nextLine().toLowerCase();

		// split arrays
		String[] arrKata = kata.split("");

		String a = "";

		// variabel meyimpan huruf sebelumnya
		String hurufSebelumnya = "";

		for (int i = 0; i < arrKata.length; i++) {
			if (abjad.contains(arrKata[i])) {
				if (!arrKata[i].equals(hurufSebelumnya)) {
					if (!hurufSebelumnya.equals("")) {
						a = a + " - ";
					}
				}

				a = a + arrKata[i];
				hurufSebelumnya = arrKata[i];
			} 
			if(!abjad.contains(arrKata[i])) {
				
			}

		}

		System.out.println();
		System.out.print(a);

	}

}
