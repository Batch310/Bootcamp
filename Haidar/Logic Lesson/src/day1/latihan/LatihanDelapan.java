package day1.latihan;

import java.util.Scanner;

public class LatihanDelapan {

	public static void main(String[] args) {
		
		int hjas = 750000;
		int hcelang = 250000;
		int hkemeja = 100000;
		int hkaos = 50000;
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Uang: ");
		int uang = masukan.nextInt();
		
		if (uang >= 750000) {
			System.out.println("Beli Jas!");
		} else if (uang >= hcelang) {
			System.out.println("Beli Celana Panjang!");
		} else if (uang >= hkemeja) {
			System.out.println("Beli Kemeja!");
		} else if (uang >= hkaos) {
			System.out.println("Beli Kaos!");
		} else {
			System.out.println("Tidak bisa beli apa - apa!");
		}

	}

}

//6m30s