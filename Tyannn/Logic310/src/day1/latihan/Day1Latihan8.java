package day1.latihan;

import java.util.Scanner;

public class Day1Latihan8 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		int jas = 750000;
		System.out.print("Harga Jas = " +jas);
		System.out.println();
		int celana = 250000;
		System.out.print(" Harga Celana = "+celana);
		System.out.println();
		int kemeja = 100000;
		System.out.print(" Harga Kemeja = "+kemeja);
		System.out.println();
		int kaos = 50000;
		System.out.print(" Harga Kaos = "+kaos);
		System.out.println();
		
		System.out.println();
		System.out.print("Uang :");
		int uang = inputan.nextInt();
		
		if (uang >= 750000) {
			System.out.println("Beli Jas!");
		}else if(uang >= 250000) {
			System.out.println("Beli Celana!");
		}else if(uang >= 100000) {
			System.out.println("Beli Kemeja!");
		}else if(uang >= 50000) {
			System.out.println("Beli Kaos!");
		}else if(uang >= 4000) {
			System.out.println("Tidak beli apa-apa!");
		}
	}

}
