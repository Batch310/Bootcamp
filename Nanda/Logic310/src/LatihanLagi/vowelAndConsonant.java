package LatihanLagi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan kalimat: ");
		String[] kata = input.nextLine().toLowerCase().split("");

		String vowels = "aiueo";
		String consonants = "bcdfghjklmnpqrstvwxyz";

		List<String> vowelChar = new ArrayList<>();
		List<String> consonantChar = new ArrayList<>();

		String vowelCharacters = "";
		String consonantCharacters = "";

		for (int i = 0; i < kata.length; i++) {
			if (vowels.contains(kata[i])) {
				vowelChar.add(kata[i]);
			} else if (consonants.contains(kata[i])) {
				consonantChar.add(kata[i]);
			}
		}

		for (int i = 0; i < vowelChar.size(); i++) {
			for (int j = i + 1; j < vowelChar.size(); j++) {
				if (vowelChar.get(j).equals(vowelChar.get(i))) {
					vowelChar.set(i, vowelChar.get(i) + vowelChar.get(j));
					vowelChar.remove(j);
				}
			}
			vowelCharacters += vowelChar.get(i);
		}

		for (int i = 0; i < consonantChar.size(); i++) {
			for (int j = i + 1; j < consonantChar.size(); j++) {
				if (consonantChar.get(j).equals(consonantChar.get(i))) {
					consonantChar.set(i, consonantChar.get(i) + consonantChar.get(j));
					consonantChar.remove(j);
				}
			}
			consonantCharacters += consonantChar.get(i);
		}

		System.out.println("Vowel Characters : ");
		System.out.println(vowelCharacters);

		System.out.println("Consonant Characters : ");
		System.out.println(consonantCharacters);

	}

}
