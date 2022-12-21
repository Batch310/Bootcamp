package day4.strings;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan rangkaian kata: ");
		String words = masukan.nextLine();
		
		String[] kata = words.split("(?=\\p{Upper})");

		System.out.println(kata.length);
		
	}
}
