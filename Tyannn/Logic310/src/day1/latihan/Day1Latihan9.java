package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class Day1Latihan9 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		Random randomGen = new Random();
		
		System.out.print("Tebakan Angka Anda : ");
		int angka = inputan.nextInt();
		
		int a= randomGen.nextInt(10); // Generete 0-9
				
		if (angka == a ) {
			System.out.println("Angka dari bandar "+a);
			System.out.println("Tebakan Anda benar bosku!");
		}else if (angka!=a) {
			System.out.println("Angka dari bandar "+a);
			System.out.println("Tebakan Anda salah bosku!");
			
		}
	}

}
