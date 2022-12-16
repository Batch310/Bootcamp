package day1.latihan;

import java.util.Scanner;

public class Day1Latihan6 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Masukan Angka : ");
		int angka = inputan.nextInt();
		
		if (angka<=3) {
			System.out.println(angka + " adalah satuan");
		}else if(angka<=14) {
			System.out.println(angka + " adalah puluhan");
		}else {
			System.out.println(angka+ " bukan satuan atau puluhan");
		}
	}

}
