package day1.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		long PIN = 234567l;
		
		System.out.print("Masukkan PIN Anda : ");
		int angka = inputan.nextInt();
		
		if (angka==PIN) {
			System.out.print("Uang yang disetor : ");
			long setor = inputan.nextLong();
		} else {
			System.out.println("PIN Salah");
		}
	}

}
