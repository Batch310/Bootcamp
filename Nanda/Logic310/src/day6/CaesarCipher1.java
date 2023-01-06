package day6;

import java.util.Iterator;
import java.util.Scanner;

public class CaesarCipher1 {
	public static void main(String[] args) {
		
		String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
		String higherAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan Kata: ");
		String kata = scanner.nextLine();
		
		System.out.println("Masukkan berapa kali gesernya: ");
		int geser = scanner.nextInt();
		
		//Split Alphabet
		String[] arrLowerAlphabet = lowerAlphabet.split("");
		String[] arrHigherAlphabet = higherAlphabet.split("");
		
		//Split Kata
		String[] arrKata = kata.split("");
		
		//Cek satu-satu sebelum digeser
		for (int i = 0; i < arrKata.length; i++) {
			if(lowerAlphabet.contains(arrKata[i])) {
				for (int j = 0; j < arrLowerAlphabet.length; j++) {
					if(arrLowerAlphabet[j].equals(arrKata[i])) {
						arrKata[i] = arrLowerAlphabet[(j + geser) % arrLowerAlphabet.length];
						break;
					}
				}
			} else if(higherAlphabet.contains(arrKata[i])) {
				for (int j = 0; j < arrHigherAlphabet.length; j++) {
					if(arrHigherAlphabet[j].equals(arrKata[i])) {
						arrKata[i] = arrHigherAlphabet[(j + geser) % arrHigherAlphabet.length];
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < arrKata.length; i++) {
			System.out.print(arrKata[i]);
		}
	}
}
