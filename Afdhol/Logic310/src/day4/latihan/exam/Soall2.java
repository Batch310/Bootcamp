package day4.latihan.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Soall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Kalimat: ");
		String input = scan.nextLine();
		
//		String input = "simple case";

		String vokal = "aeiou"; //filter huruf vokal
		String konsonan = "bcdfghjklmnpqrstvwxyz"; //filter huruf konsonan

		input = input.toLowerCase(); //buat menjadi lowercase

		String[] arrKalimat = input.split(""); //pisahkan setiap huruf
		Arrays.sort(arrKalimat); //sorting 

		for (int i = 0; i < arrKalimat.length; i++) {
			if (vokal.contains(arrKalimat[i])) { //jika mengandung huruf vokal
				System.out.print(arrKalimat[i]);
			}
		}
		System.out.println();

		for (int i = 0; i < arrKalimat.length; i++) {
			if (konsonan.contains(arrKalimat[i])) { //jika mengandung huruf vokal konsonan
				System.out.print(arrKalimat[i]);

			}
		}

	}

}
