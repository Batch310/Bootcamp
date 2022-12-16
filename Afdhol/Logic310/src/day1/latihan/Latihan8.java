package day1.latihan;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan uang anda: ");
		int uang = input.nextInt();
		
		if (uang>=750000) {
			System.out.println("Beli Jas!");
		}else if (uang>=250000 && uang<750000) {
			System.out.println("Beli Celana Panjang!");
		}else if (uang>=100000 && uang<250000) {
			System.out.println("Beli Kemeja!");
		}else if (uang>=50000 && uang<100.000) {
			System.out.println("beli kaos !");
		}else if(uang<50000) {
			System.out.println("tidak bisa beli apa-apa");
		}else {
			System.out.println("Beli Kaos");
		}
		
	}

}
