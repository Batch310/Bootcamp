package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class Latihan9 {

	public static void main(String[] args) {

		Random randomGen = new Random();
		int a = randomGen.nextInt(10);

		Scanner input = new Scanner(System.in);

		System.out.print("Tebakan angka anda : ");
		int angka = input.nextInt();

		if (angka == a) {
			System.out.println("Angka dari bandar " + a);
			System.out.println("Tebakan anda benar bosku!");
		} else if (angka != a) {
			System.out.println("angka dari bandar " + a);
			System.out.println("Tebakan anda salah bosku!");
		}

	}

}
