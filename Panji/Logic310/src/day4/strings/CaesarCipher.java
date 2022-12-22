package day4.strings;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Kata : ");
		String in_kata = input.nextLine();

		System.out.print("Rotasi Karakter : ");
		int rot_karakter = input.nextInt();

		StringBuilder a = new StringBuilder();

		for (int i = 0; i < in_kata.length(); i++) {
			char b = in_kata.charAt(i);
			if (b >= 'a' && b <= 'z') {
				b = (char) ('a' + (b - 'a' + rot_karakter) % 26);
			} else if (b >= 'A' && b <= 'Z') {
				b = (char) ('A' + (b - 'A' + rot_karakter) % 26);
			}
			a.append(b);
		}
		String text = a.toString();
		System.out.print(text);

	}

}
