package day4.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan kalimat: ");
		String kalimat = masukan.nextLine();
		
		String abjad = "abcdefghijklmnopqrstuvwxyz";
		
		String[] arrHuruf = kalimat.toLowerCase().split("");
		String[] arrAbjad = abjad.split("");
		int tampung = 0;
		
		Arrays.sort(arrHuruf);
		
		if (kalimat.length() < 26) {
			System.out.println("not pangram");
		} else {
			for (int i = 0; i < arrHuruf.length; i++) {
				if (arrAbjad[tampung].equals(arrHuruf[i])) {
					tampung++;
				}
			}		

			if (tampung == 26) {
				System.out.println("pangram");
			} else {
				System.out.println("not pangram");
			}
		}
		
	}
}