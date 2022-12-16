package day1.latihan;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Panjang : ");
		int panjang = input.nextInt();
		System.out.print("Masukkan Lebar : ");
		int lebar = input.nextInt();
		System.out.print("Masukkan Tiggi : ");
		int tinggi = input.nextInt();

		int hasil = panjang * lebar * tinggi; // rumus hitung volume balok
		System.out.println();

		System.out.println("Volume balok adalah " + panjang + " x " + lebar + " x " + tinggi + " = " + hasil);

	}

}
