package day2.latihan;

import java.util.Scanner;

public class latihan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulang = new Scanner(System.in);
		int angka = 1;
		int i = 0;
		System.out.println("Ulang berapa kali? ");
		int jawab = ulang.nextInt();

		while (i < jawab) {
			System.out.print(angka + " ");
			angka = angka + 4;
			i++;
		}
	}

}
