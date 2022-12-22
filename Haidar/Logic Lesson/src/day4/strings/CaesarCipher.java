package day4.strings;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan panjang kata: ");
		int nkata = masukan.nextInt();
		
		System.out.print("Masukkan kata: ");
		String kata = masukan.next();
		
		System.out.print("Masukkan banyaknya rotasi alfabet: ");
		int rotasi = masukan.nextInt();
		
//		String lowCase = "abcdefghijklmnopqrstuvwxyz";
//		String upCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
//		String[] lowerCase = new String[lowCase.length()];
//		String[] upperCase = new String[upCase.length()];
		
//		String[] huruf = kata.split("");
//		String[] hasil = new String[huruf.length];
		
		char[] hasil = new char[kata.length()];
		
		for (int i = 0; i < kata.length(); i++) {
			char huruf = kata.charAt(i);
			if ((huruf > 96 && huruf < 123)) {
				huruf += rotasi;
				if (huruf >= 123) {
					huruf = (char) (huruf - 26);
				}
			}
			if ((huruf > 64 && huruf < 91)) {
				huruf += rotasi;
				if (huruf >= 91) {
					huruf = (char) (huruf - 26);
				}
			}
			hasil[i] = huruf;
			System.out.print(hasil[i]);
		}
		
//		for (int i = 0; i < huruf.length; i++) {
//			for (int j = 0; j < lowerCase.length; j++) {
//				if (huruf[i] == lowerCase[j]) {
//					huruf[i] 
//				}
//			}
//		}
		
		
	}
}
