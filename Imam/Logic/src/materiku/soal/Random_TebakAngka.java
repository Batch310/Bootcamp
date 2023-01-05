package materiku.soal;

import java.util.Random;
import java.util.Scanner;

public class Random_TebakAngka {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("Tebakan Angka Anda :");
		int tebakan = inputan.nextInt();

		System.out.println("");

		Random randomGen = new Random();
		int a = randomGen.nextInt(10); //10 => 0-9
		System.out.println("Angka dari bandar " + a);

		if (tebakan == a) {
			System.out.println("Tebakan anda benar bosku!");
		} else {
			System.out.println("Tebakan anda salah bosku!");
		}

	}

}
