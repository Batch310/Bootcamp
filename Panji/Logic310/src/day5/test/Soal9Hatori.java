package day5.test;

import java.util.Scanner;

public class Soal9Hatori {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan perjalanan Hatori: ");
		String perjalanan = input.nextLine().toUpperCase();

		int mdpl = 0;
		int gunung = 0;
		int lembah = 0;

		for (int i = 0; i < perjalanan.length(); i++) {
			if (perjalanan.charAt(i) == 'N') {
				mdpl += 1;
				if (mdpl == 0) {
					lembah++;
				}

			} else if (perjalanan.charAt(i) == 'T') {
				mdpl -= 1;
				if (mdpl == 0) {
					gunung++;
				}
			}

		}

		System.out.println("Hatori naik gunung sebanyak " + gunung + " kali.");
		System.out.println("Hatori turun lembah sebanyak " + lembah + " kali.");

	}

}
