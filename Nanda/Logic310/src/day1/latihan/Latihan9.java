package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class Latihan9 {

	public static void main(String[] args) {
	
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Tebakan angka anda : ");
		int angka = inputan.nextInt();
		
Random randomGen = new Random();
		
		int a = randomGen.nextInt(2);
		System.out.println("Angka dari Bandar " +a );
		
		if (angka!=a) {
			System.out.println("Tebakan anda salah bosku!");
		} else {
			System.out.println("Tebakan anda benar bosku!");
		}
	}

}
