package day1.latihan;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("Harga Beli :");
		int beli = inputan.nextInt();

		System.out.print("Harga Jual :");
		int jual = inputan.nextInt();

		int laba = jual - beli;
		int untung = laba * 100 / beli;

		System.out.println("");
		System.out.print("Keuntungan Pedagang adalah  " + untung + " persen");

	}

}
