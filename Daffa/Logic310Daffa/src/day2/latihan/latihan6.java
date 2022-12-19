package day2.latihan;

import java.util.Scanner;

public class latihan6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulang = new Scanner(System.in);
		int angka = 1;
		
		System.out.println("Ulang berapa kali? ");
		int jawab = ulang.nextInt();
		
		for (int i = 0; i < jawab; i++ ) {
			if (angka % 3 == 0) {
				System.out.println("*");
			} else {
				System.out.print(angka + " ");
			}
			angka = angka + 4;
		}

	}

}
