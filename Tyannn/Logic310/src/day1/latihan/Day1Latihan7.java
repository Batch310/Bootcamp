package day1.latihan;

import java.util.Scanner;

public class Day1Latihan7 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Masukan Angka : ");
		int angka = inputan.nextInt();
		
		if(angka%2 >0 ) {
			System.out.println("Bilangan Ganjil");
		}else {
			System.out.println("Bilangan Genap");
		}
//		
	}

}
