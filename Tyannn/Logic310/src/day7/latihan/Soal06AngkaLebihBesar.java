package day7.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal06AngkaLebihBesar {

	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		Random acak = new Random();

		System.out.println("Input pilihan: 1. Player main dahulu    2. Computer main dahulu");
		int pilihan = masukan.nextInt();

		int angkaPlayer = 0;
		int angkaKomputer = 0;

		if (pilihan == 1) {
			System.out.print("Input angka player : ");
			angkaPlayer = masukan.nextInt();
			angkaKomputer = acak.nextInt(10);
			System.out.println("Angka komputer adalah : " + angkaKomputer);
		} else if (pilihan == 2) {
			angkaKomputer = acak.nextInt(10);
			System.out.println("Angka komputer adalah : *");
			System.out.print("Input angka player : ");
			angkaPlayer = masukan.nextInt();
			System.out.println("Angka komputer adalah : " + angkaKomputer);
		}

//		while ((pilihan == 1) && (angkaPlayer == angkaKomputer)) {
//				System.out.println("Angka Sama, masukkan ulang angka player");				
//				System.out.print("Input angka player : ");
//				angkaPlayer = masukan.nextInt();
//				angkaKomputer = acak.nextInt(10);
//				System.out.println("Angka komputer adalah : " + angkaKomputer);
//		}
//		
//		while ((pilihan == 2) && (angkaPlayer == angkaKomputer)) {
//			System.out.println("Angka Sama, masukkan ulang angka player");
//			angkaKomputer = acak.nextInt(10);
//			System.out.println("Angka komputer adalah : *" );				
//			System.out.print("Input angka player : ");
//			angkaPlayer = masukan.nextInt();
//			System.out.println("Angka komputer adalah : " + angkaKomputer);
//		}

		if (angkaPlayer > angkaKomputer) {
			System.out.println("You Win");
		} else if (angkaPlayer < angkaKomputer) {
			System.out.println("You Lose");
		} else {
			System.out.println("Neither You or Computer Win");
		}
		masukan.close();

	}

}
