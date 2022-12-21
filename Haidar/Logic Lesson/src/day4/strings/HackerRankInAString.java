package day4.strings;

import java.util.Scanner;

public class HackerRankInAString {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah kata: ");
		int jumlah = masukan.nextInt();
		
		String[] input = new String[jumlah];
		
		String[] hackerRank = new String[] {"h", "a", "c", "k", "e", "r", "r", "a", "n", "k"}; 
		
		String[] hasil = new String[hackerRank.length];
		
		for (int i = 0; i < jumlah; i++) {
			System.out.print("Masukkan kata ke-" + i + ": ");
			String kata = masukan.nextLine();
		}
		
	}
}
