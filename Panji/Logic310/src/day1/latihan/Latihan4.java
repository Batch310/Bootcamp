package day1.latihan;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Harga Beli : ");
		double beli = input.nextInt();
		System.out.print("Harga Jual : ");
		double jual = input.nextInt();

		double untung = jual - beli; // rumus mencari untung
		double persen = (untung / beli) * 100; // rumus mencari persen

		System.out.println("Keuntungan pedagang adalah " + persen + " persen");

	}

}
