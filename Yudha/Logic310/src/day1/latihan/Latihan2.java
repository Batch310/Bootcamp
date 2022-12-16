package day1.latihan;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nama	    : ");
		String nama = input.next();
		System.out.print("Masukkan Umur	    : ");
		String umur = input.next();
		System.out.print("Masukkan Golongan    : ");
		String golongan = input.next();
		System.out.print("Masukkan Universitas : ");
		String universitas = input.next();
		
		System.out.println("\nNama        : " + nama);
		System.out.println("Umur        : " + umur);
		System.out.println("Golongan    : " + golongan);
		System.out.println("Universitas : " + universitas);

	}

}
