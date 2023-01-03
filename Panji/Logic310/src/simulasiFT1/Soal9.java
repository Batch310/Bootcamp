package simulasiFT1;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan perjalanan Tian: ");
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

		System.out.println("Tian naik gunung sebanyak " + gunung + " kali.");
		System.out.println("Tian turun lembah sebanyak " + lembah + " kali.");

	}

}
