package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class Latihan9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGen = new Random();
		Scanner input = new Scanner(System.in);
		System.out.print("Tebakan Anda : ");
		int tebak = input.nextInt();
		int bandar = randomGen.nextInt(10);
		System.out.println("\nAngka dari bandar : " + bandar);
		if (tebak == bandar) {
			System.out.println("Tebakan Anda benar bosku !");
		}
		else {
			System.out.println("Tebakan Anda salah bosku !");
		}
		
	}

}
