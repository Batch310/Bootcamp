package day1.latihan;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		//Input nama
		System.out.print("Masukkan Nama : ");
		String nama = inputan.nextLine();
		
		System.out.println("Nama : " + nama);
		
		//Input umur
		System.out.print("Masukkan Umur : ");
		int umur = inputan.nextInt();
		
		System.out.println("Umur : " + umur);
		
		// Input Golongan
		System.out.print("Masukkan Golongan : ");
		String golongan = inputan.next ();
		
		System.out.println("Golongan : " + golongan);
		
		inputan.nextLine();
		
		//input universitas
		System.out.print("Masukkan Universitas : ");
		String universitas = inputan.nextLine();
		
		System.out.println("Universitas : " + universitas);

	}

}
