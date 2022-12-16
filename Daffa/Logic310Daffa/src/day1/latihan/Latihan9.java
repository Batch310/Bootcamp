package day1.latihan;

import java.util.Scanner;

public class Latihan9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int angkaRandom = (int)(Math.random()*9);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tebakan Angka Anda : ");
		int tebak = input.nextInt();
		
		if (tebak == angkaRandom) {
			System.out.println("Angka dari bandar " + angkaRandom);
			System.out.println("Tebakan anda benar bosku!");
		} else
			System.out.println("Angka dari bandar " + angkaRandom);
			System.out.println("Tebakan anda salah bosku!");

	}

}
