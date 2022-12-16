package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class Latihan9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random randomGen = new Random();
		int random,angka;
		
		System.out.println("Masukkan Angka :");
		 angka = input.nextInt();
		 random = randomGen.nextInt(10);
		
		
		if (angka==random) {
			System.out.println("Nomor dari bandar : "+random);
			System.out.println("Tebakan Anda benar bosku!");
		}else {
			System.out.println("Tebakan anda salah bosku!");
			System.out.println("yg benar: "+random);
		}
		
	}

}
