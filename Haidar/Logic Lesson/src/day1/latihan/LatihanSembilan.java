package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class LatihanSembilan {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in);
		Random angkaRandom = new Random();
		
		int angkaB = angkaRandom.nextInt(10);
		
		System.out.print("Tebakan Angka Anda: ");
		int angka = masukan.nextInt();
		
		if (angka < 0 || angka > 9) {
			System.out.println("Angka tidak valid, masukkan angka antara 0 - 9");
		} else if (angka == angkaB) {
			System.out.println("Angka dari bandar " + angkaB);
			System.out.println("Tebakan Anda benar bosku!");
		} else {
			System.out.println("Angka dari bandar " + angkaB);
			System.out.println("Tebakan Anda Salah bosku!");
		}

	}

}
//9m