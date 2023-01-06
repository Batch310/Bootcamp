package day4.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan kalimat : ");
		String kalimat = scanner.nextLine();

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
