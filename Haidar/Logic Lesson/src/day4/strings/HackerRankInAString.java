package day4.strings;

import java.util.Scanner;

public class HackerRankInAString {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah kata: ");
		int jumlah = masukan.nextInt();
		
		String[] arrInput = new String[jumlah];
		
		for (int i = 0; i < arrInput.length; i++) {
			System.out.print("Masukkan kata ke-" + (i+1) + ": ");
			arrInput[i] = masukan.next();
//			System.out.println(arrInput[i]);
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
//			System.out.println(arrKey.length);
//			System.out.println(hurufSama);
		}
		
		
	}
}
