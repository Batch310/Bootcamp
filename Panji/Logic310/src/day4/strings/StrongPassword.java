package day4.strings;

import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Password : ");
		String password = input.nextLine();

		long[] num_arr = new long[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		char[] upper = new char[26];
		char[] lower = new char[26];
		char[] special = new char[] { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };

//		// Mengisis Data Karakter Upper
//		for (char a = 'A'; a < 'Z'; a++) {
//			upper[a - 'A'] = a;
//		}
//		for (int i = 1; i <= 26; i++) {
//			System.out.print(upper[i]);
//		}
		
		
		if (password.length() >= 6) {
			System.out.print(password.length());
		} else {
			System.out.print(password.length());
			System.out.print("Sandi kurang kuat");
		}

	}

}
