package day1.latihan;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama        : ");
		String nama = input.nextLine();

		System.out.print("Masukkan umur        : ");
		int umur = input.nextInt();

		System.out.print("Masukkan golongan    : ");
		String golongan = input.nextLine();

		System.out.print("Masukkan Universitas : ");
		String univ = input.nextLine();

		System.out.println();
		System.out.println();

		System.out.println("Nama        : " + nama);
		System.out.println("Umur        : " + umur);
		System.out.println("Golongan    : " + golongan);
		System.out.println("Universitas : " + univ);

	}

}
