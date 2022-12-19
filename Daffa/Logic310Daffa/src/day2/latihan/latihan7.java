package day2.latihan;

import java.util.Scanner;

public class latihan7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka = 2;
		int i = 0;

		Scanner ulang = new Scanner(System.in);
		System.out.println("Ulang berapa kali? ");
		int jawab = ulang.nextInt();
		while (i < jawab) {
			System.out.println(angka);
			angka = angka * 2;
			i++;
		}

	}

}
