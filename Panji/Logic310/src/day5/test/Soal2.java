package day5.test;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("input n : ");
		String n = input.nextLine().toLowerCase();

		String vocal = "aiueo";
		String konsonan = "bcdfghjklmnpqrstvwxyz";

		
		// Split Program
		String[] arr_n = n.split("");


		// Sort Program
		Arrays.sort(arr_n);


		String a = "";
		String b = "";

		// Cek Huruf Vokal
		for (int i = 0; i < arr_n.length; i++) {
			if (vocal.contains(arr_n[i])) {
				a = a + arr_n[i];
			} else if (konsonan.contains(arr_n[i])) {
				b += arr_n[i];
			}

		}

		// Menampilkan Huruf Vocal dan Konsonan
		System.out.print("Huruf Vokal : " + a);
		System.out.println();
		System.out.print("Huruf Konsonan : " + b);
	}

}
