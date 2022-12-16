package day1.latihan;

import java.util.Scanner;

public class Latihan6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan angka: ");
		int angka = input.nextInt();
		
		if (angka>=1&&angka<10) {
			System.out.println(angka+" adalah satuan");
		}else if (angka>=10 && angka<=99) {
			System.out.println(angka+" adalah puluhan");
		}else {
			System.out.println(angka+" bukan satuan atau puluhan");
		}
		
	}

}
