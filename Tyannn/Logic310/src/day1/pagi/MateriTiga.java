package day1.pagi;

import java.util.Scanner;

public class MateriTiga {

	public static void main(String[] args) {

		// Membuat Object / Instansiasi Object
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Masukan Nama : ");
		String nama = inputan.next(); // Input String Nama
		System.out.print("Masukan umur : ");
		int umur = inputan.nextInt(); // Input Integer Umur
		System.out.print("Masukan Asal : ");
		String asal = inputan.next(); // Input String Asal
		
		System.out.println();
		System.out.println("Nama saya....."+ nama);
		System.out.println("Umur saya....."+ umur);
		System.out.println("Asal saya....."+ asal);
		
	}

}
