package day1.latihan;

import java.util.Scanner;

public class Latihan7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Angka : ");
		int angka = input.nextInt();
		
		if (angka % 2 == 0) {
			System.out.println("\nBilangan Genap");			
		}
		else {
			System.out.println("\nBilangan Ganjil");
		}

	}

}
