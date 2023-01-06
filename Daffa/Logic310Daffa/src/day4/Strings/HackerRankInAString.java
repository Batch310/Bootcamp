package day4.Strings;

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan jumlah kata : ");
		int jumlah = scanner.nextInt();

		String[] arrInput = new String[jumlah];

		for (int i = 0; i < arrInput.length; i++) {
			System.out.println("Masukkan kata ke-" + (i + 1));
			arrInput[i] = scanner.next();
		}
		for (int i = 0; i < arrInput.length; i++) {
			String key = "hackerrank";
			String[] arrKey = key.split("");
			int hurufSama = 0;

			String[] arrKata = arrInput[i].toLowerCase().split("");

			for (int j = 0; j < arrKata.length; j++) {
				if (arrKey[hurufSama].equals(arrKata[j])) {
					hurufSama++;
				}
			}
			if (hurufSama == arrKey.length) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
