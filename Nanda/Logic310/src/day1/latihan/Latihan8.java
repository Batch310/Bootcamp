package day1.latihan;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		//input
		System.out.print("Uang : ");
		int uang = inputan.nextInt();
		
		if (uang>=750000) {
			System.out.println("Beli Jas !");
		} else if (uang>=250000) {
			System.out.println("Beli Celana Panjang !");
		} else if (uang>=100000) {
			System.out.println("Beli Kemeja !");
		} else {
			System.out.println("Tidak bisa beli apa-apa !");
		}

	}

}
