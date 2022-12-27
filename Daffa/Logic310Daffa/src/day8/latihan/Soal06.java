package day8.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random angkaRandom = new Random();

		int angkaKomp = 0;
		int angkaAnda = 0;

		System.out.println("Siapa yang bermain dahulu? " + "\n1. Player" + "\n2. Komputer\n");
		System.out.println("Masukkan pilihan : ");
		int pilihan = input.nextInt();

		if (pilihan == 1) {
//			System.out.println("Input angka anda : ");
			angkaAnda = angkaRandom.nextInt(10);
			angkaKomp = angkaRandom.nextInt(10);
			if (angkaAnda > angkaKomp) {
				System.out.println("Angka Anda : " + angkaAnda + "\nAngka Komputer : " + angkaKomp + "\nYou Win");
			} else if (angkaAnda < angkaKomp) {
				System.out.println("Angka Anda : " + angkaAnda + "\nAngka Komputer : " + angkaKomp + "\nYou Lose");
			} else {
				System.out.println("Draw");
			}
		} else if (pilihan == 2) {
			angkaKomp = angkaRandom.nextInt(10);
//			System.out.println("Input angka anda : ");
			angkaAnda = angkaRandom.nextInt(10);
			if (angkaAnda > angkaKomp) {
				System.out.println("Angka Anda : " + angkaAnda + "\nAngka Komputer : " + angkaKomp + "\nYou Win");
			} else if (angkaAnda < angkaKomp) {
				System.out.println("Angka Anda : " + angkaAnda + "\nAngka Komputer : " + angkaKomp + "\nYou Lose");
			} else {
				System.out.println("Draw");
			}
		} else {
			System.out.println("Pilihan tidak dikenal");
		}
		input.close();
	}

}
