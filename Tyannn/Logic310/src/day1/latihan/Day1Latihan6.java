package day1.latihan;

import java.util.Scanner;

public class Day1Latihan6 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Masukan Angka : ");
		int angka = inputan.nextInt();
		
		if (angka<=99 && angka>=10) {
			System.out.println(angka + " adalah puluhan");
		}else if(angka<=9 && angka>=0) {
			System.out.println(angka + " adalah Satuan");
		}else{
			System.out.println(angka+ " bukan satuan atau puluhan");
		}
	}

}
