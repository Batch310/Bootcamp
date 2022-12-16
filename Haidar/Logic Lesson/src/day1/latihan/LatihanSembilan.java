package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class LatihanSembilan {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in);
		Random angkaRandom = new Random();
		
		int angkaB = angkaRandom.nextInt(9);
		
		System.out.print("Tebakan Angka Anda: ");
		int angka = masukan.nextInt();
		
		if (angka == angkaB) {
			System.out.println("Angka dari bandar " + angkaB);
			System.out.println("Tebakan Anda benar bosku!");
		} else {
			System.out.println("Angka dari bandar " + angkaB);
			System.out.println("Tebakan Anda Salah bosku!");
		}

	}

}
//9m