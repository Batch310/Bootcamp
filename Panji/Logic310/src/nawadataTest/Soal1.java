package nawadataTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukkan kalimat: ");
		String[] arrInput = masukan.nextLine().toLowerCase().split("");

		String vocal = "aeiou";
		String konsonan = "bcdfghjklmnpqrstvwxyz";

		List<String> vowels = new ArrayList<>();
		List<String> consonant = new ArrayList<>();

		String vocalChar = "";
		String konsonanChar = "";

		for (int i = 0; i < arrInput.length; i++) {
			if (vocal.contains(arrInput[i])) {
				vowels.add(arrInput[i]);
			} else if (konsonan.contains(arrInput[i])) {
				consonant.add(arrInput[i]);
			}
		}

		for (int i = 0; i < vowels.size(); i++) {
			for (int j = i + 1; j < vowels.size(); j++) {
				if (vowels.get(j).equals(vowels.get(i))) {
					vowels.set(i, vowels.get(i) + vowels.get(j));
					vowels.remove(j);
				}
			}
			vocalChar += vowels.get(i);
		}

		for (int i = 0; i < consonant.size(); i++) {
			for (int j = i + 1; j < consonant.size(); j++) {
				if (consonant.get(j).equals(consonant.get(i))) {
					consonant.set(i, consonant.get(i) + consonant.get(j));
					consonant.remove(j);
				}
			}
			konsonanChar += consonant.get(i);
		}

		System.out.println("Huruf Vocal : ");
		System.out.println(vocalChar);

		System.out.println("Huruf Konsonan : ");
		System.out.println(konsonanChar);

	}
}
