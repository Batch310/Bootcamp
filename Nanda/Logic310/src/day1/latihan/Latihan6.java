package day1.latihan;

import java.util.Scanner;

public class Latihan6 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		//input
		System.out.print("Masukkan Angka : ");
		int angka = inputan.nextInt();
		
		//output
		if (angka<10) {
			System.out.println(angka+ " adalah satuan" );
		} else if (angka<100) {
			System.out.println(angka+ " adalah puluhan");
		} else {
			System.out.println(angka+ " adalah bukan satuan atau puluhan");
		}

	}

}
