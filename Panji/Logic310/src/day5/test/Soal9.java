package day5.test;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		int N = 0, T = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan perjalanan Hatori: ");
		String journey = input.nextLine().toUpperCase();

		for (int i = 0; i < journey.length(); i++) {
			if (journey.charAt(i) == 'N') {
				N++;
			} else if (journey.charAt(i) == 'T') {
				T++;
			}
			
		}

		System.out.println("Hatori naik sebanyak " + N + " kali.");
		System.out.println("Hatori turun sebanyak " + T + " kali.");

	}

}
