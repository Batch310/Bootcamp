package day4.latihan.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

//		System.out.println("Kalimat: ");
//		String input = scan.nextLine();
//		
		String input = "simple case";

		String vokal = "aeiou";
		String konsonan = "bcdfghjklmnpqrstvwxyz";

		input = input.toLowerCase();

		String[] arrKalimat = input.split("");
		Arrays.sort(arrKalimat);

		for (int i = 0; i < arrKalimat.length; i++) {
			if (vokal.contains(arrKalimat[i])) {
				System.out.print(arrKalimat[i]);
			}
		}
		System.out.println();

		for (int i = 0; i < arrKalimat.length; i++) {
			if (konsonan.contains(arrKalimat[i])) {
				System.out.print(arrKalimat[i]);

			}
		}

	}

}
