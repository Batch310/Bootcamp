package day5.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Soal2VocalKonsonan {

	public static void main(String[] args) {

		//Pengelompokan huruf vocal dan konsonan
		Scanner input = new Scanner(System.in);

		System.out.print("input n : ");
		String n = input.nextLine().toLowerCase();

		String vocal = "aiueo";
		//String konsonan = "bcdfghjklmnpqrstvwxyz";

		
		// Split Program
		//String[] arr_n = n.split("");
		char[] arr = n.toCharArray();

		List<Character> vowels = new ArrayList<>();
		List<Character> consonants = new ArrayList<>();

		// Sort Program
		//Arrays.sort(arr_n);


//		String a = "";
//		String b = "";

		// Cek Huruf Vokal
//		for (int i = 0; i < arr_n.length; i++) {
//			if (vocal.contains(arr_n[i])) {
//				a = a + arr_n[i];
//			} else if (konsonan.contains(arr_n[i])) {
//				b += arr_n[i];
//			}
//
//		}
		for (char a : arr) {
			if(vocal.indexOf(a) != -1) {
				vowels.add(a);
			} else if (Character.isLetter(a)){
				consonants.add(a);
			}
		}
		Collections.sort(vowels);
		Collections.sort(consonants);
		//consonants.sort(Comparator.reverseOrder());

		
		// Menampilkan Huruf Vocal dan Konsonan

		System.out.println("Huruf Vocal : ");
		for(char a : vowels) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("Huruf Konsonan : ");
		for(char a : consonants) {
			System.out.print(a + " ");
		}
		
	}

}
