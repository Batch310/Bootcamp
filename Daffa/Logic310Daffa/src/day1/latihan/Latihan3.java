package day1.latihan;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan panjang : ");
		int panjang = input.nextInt();
		System.out.println("Masukkan lebar   : ");
		int lebar = input.nextInt();
		System.out.println("Masukkan tinggi  : ");
		int tinggi = input.nextInt();

		int volumeBalok = panjang * lebar * tinggi;

		System.out.println("Volume balok adalah " + volumeBalok);
	}

}
