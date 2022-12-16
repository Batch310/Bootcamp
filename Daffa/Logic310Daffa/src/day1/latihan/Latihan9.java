package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class Latihan9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int angkaRandom = (int) (Math.random() * 9); 

		Random randomGen = new Random();
		Scanner input = new Scanner(System.in);
		int angkaRandom = randomGen.nextInt(10);
		System.out.println("Tebakan Angka Anda : ");
		int tebak = input.nextInt();

//		if (tebak == angkaRandom) {
//			System.out.println("Angka dari bandar " + angkaRandom + "\nTebakan anda benar bosku!");
//		} else if (tebak != angkaRandom)
//			System.out.println("Angka dari bandar " + angkaRandom + "\nTebakan anda salah bosku!");
//		}
		
		if (tebak == angkaRandom) {
			System.out.println("Angka dari bandar " + angkaRandom + "\nTebakan anda benar bosku!");
		} else if (tebak != angkaRandom)
			System.out.println("Angka dari bandar " + angkaRandom + "\nTebakan anda salah bosku!");
		}
	}
