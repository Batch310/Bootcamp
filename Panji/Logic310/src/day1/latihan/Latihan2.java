package day1.latihan;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);

		System.out.print("Masukkan Nama :"); // input nama
		String nama = inputan.next();
		System.out.print("Masukkan Umur :"); // input umur
		int umur = inputan.nextInt();
		System.out.print("Masukkan Golongan :"); // input golongan
		String golongan = inputan.next();
		inputan.nextLine(); // nextline untuk input lebih dari 1 kata
		System.out.print("Masukkan Universitas :"); // input universitas
		String universitas = inputan.nextLine();

		System.out.println();

		System.out.println("Nama 		: " + nama);
		System.out.println("Umur 		: " + umur);
		System.out.println("Golongan 	: " + golongan);
		System.out.println("Universitas	: " + universitas);
	}

}
