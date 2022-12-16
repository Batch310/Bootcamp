package day1.latihan;

import java.util.Scanner;

public class Latihan4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Harga Beli : ");
		int beli = input.nextInt();
		System.out.print("Harga Jual : ");
		int jual = input.nextInt();

		int untung = (jual - beli) / 100;
		System.out.println("Keuntungan Pedagang adalah " + untung + " persen");

	}

}
