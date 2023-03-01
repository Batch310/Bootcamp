import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VokalKonsonan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukkan kalimat: ");
		
		//input dimasukkan array kemudian split per karakter 
		String[] arrKata = masukan.nextLine().toLowerCase().split("");

		String vowels = "aeiou";
		String consonants = "bcdfghjklmnpqrstvwxyz";

		List<String> vowelChars = new ArrayList();//menampung huruf vokal
		List<String> consonantChars = new ArrayList<>(); //menmapung huruf konsonan

		String vowelCharacters = ""; 
		String consonantCharacters = ""; 

		//cek apakah inputan mengandung vokal atau konsonan 
		for (int i = 0; i < arrKata.length; i++) {
			if (vowels.contains(arrKata[i])) { //jika mengandung vokal maka menmabahkan ke tampungan huruf vokal
				vowelChars.add(arrKata[i]);
			} else if (consonants.contains(arrKata[i])) { //jika mengandung vokal maka menambahkan ke tampungan huruf konsonan
				consonantChars.add(arrKata[i]);
			}
		}

		for (int i = 0; i < vowelChars.size(); i++) {
			for (int j = i + 1; j < vowelChars.size(); j++) {
				if (vowelChars.get(j).equals(vowelChars.get(i))) {
					vowelChars.set(i, vowelChars.get(i) + vowelChars.get(j));
					vowelChars.remove(j);
				}
			}
			vowelCharacters += vowelChars.get(i);
		}

		for (int i = 0; i < consonantChars.size(); i++) {
			for (int j = i + 1; j < consonantChars.size(); j++) {
				if (consonantChars.get(j).equals(consonantChars.get(i))) {
					consonantChars.set(i, consonantChars.get(i) + consonantChars.get(j));
					consonantChars.remove(j);
				}
			}
			consonantCharacters += consonantChars.get(i);
		}

		System.out.println("Vowel Characters : ");
		System.out.println(vowelCharacters);

		System.out.println("Consonant Characters : ");
		System.out.println(consonantCharacters);

	}

}
