package catatan.untuk.FT1;

import java.util.Random;
import java.util.Scanner;

public class ContohSoalRandomGen {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);

		System.out.print("Tebakan angka anda : ");
		int angka = inputan.nextInt();

		Random randomGen = new Random();

		int a = randomGen.nextInt(10);
		System.out.println("Angka dari Bandar " + a);

		if (angka != a) {
			System.out.println("Tebakan anda salah bosku!");
		} else {
			System.out.println("Tebakan anda benar bosku!");
		}
	}

}
