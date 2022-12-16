package day1.latihan;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner input = new Scanner(System.in);
		int jas = 750000, celana_panjang = 250000, kemeja = 100000, kaos = 50000;
		
		System.out.print("Uang : ");
		int uang = input.nextInt();
		
		System.out.println();
		
		if (uang >= 750000) {
			System.out.println("Beli Jas !");
		}
		else if (uang >= celana_panjang) {
			System.out.println("Beli Celana Panjang !");
		}
		else if (uang >= kemeja) {
			System.out.println("Beli Kemeja !");
		}
		else if (uang >= kaos) {
			System.out.println("Beli Kaos !");
		}
		else {
			System.out.println("Tidak bisa beli apa-apa");
		}
		
	}

}
