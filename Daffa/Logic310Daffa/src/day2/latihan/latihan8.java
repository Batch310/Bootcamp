package day2.latihan;

import java.util.Scanner;

public class latihan8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulang = new Scanner(System.in);
		System.out.println("Ulang berapa kali? ");
		int jawab = ulang.nextInt();
		
		int angka = 3;
		int i = 0;
		
		while (i < jawab) {
			System.out.print(angka + " ");
			angka = angka * 3;
			i++;
		}

	}

}