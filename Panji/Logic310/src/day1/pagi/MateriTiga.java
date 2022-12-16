package day1.pagi;

import java.util.Scanner;

public class MateriTiga {

	public static void main(String[] args) {

		// Membuat object
		Scanner inputan = new Scanner(System.in);

		System.out.print("Masukkan Nama : ");
		String nama = inputan.nextLine(); // Input string nama

		System.out.print("Masukkan Umur : ");
		int umur = inputan.nextInt();

		System.out.print("Masukkan Asal : ");
		String asal = inputan.next();

		System.out.println();
		System.out.println("Nama Saya " + nama);
		System.out.println("Umur saya " + umur);
		System.out.println("Asal saya " + asal);
	}

}
