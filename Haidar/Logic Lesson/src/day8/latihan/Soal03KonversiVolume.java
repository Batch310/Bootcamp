package day8.latihan;

import java.util.Scanner;

public class Soal03KonversiVolume {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("1 ");
		String barang1 = masukan.next();
		
		System.out.print("... ");
		String barang2 = masukan.next();
		
		double volume = 0;
		
		if (barang1.equalsIgnoreCase("botol") && barang2.equalsIgnoreCase("gelas")) {
			volume = 2;
		} else if (barang1.equalsIgnoreCase("botol") && barang2.equalsIgnoreCase("cangkir")) {
			volume = 5;
		} else if (barang1.equalsIgnoreCase("botol") && barang2.equalsIgnoreCase("teko")) {
			volume = 0.2;
		} else if (barang1.equalsIgnoreCase("teko") && barang2.equalsIgnoreCase("cangkir")) {
			volume = 25;
		} else if (barang1.equalsIgnoreCase("teko") && barang2.equalsIgnoreCase("gelas")) {
			volume = 10;
		} else if (barang1.equalsIgnoreCase("teko") && barang2.equalsIgnoreCase("botol")) {
			volume = 5;
		} else if (barang1.equalsIgnoreCase("gelas") && barang2.equalsIgnoreCase("cangkir")) {
			volume = 2.5;
		} else if (barang1.equalsIgnoreCase("gelas") && barang2.equalsIgnoreCase("teko")) {
			volume = 0.1;
		} else if (barang1.equalsIgnoreCase("gelas") && barang2.equalsIgnoreCase("botol")) {
			volume = 0.5;
		} else if (barang1.equalsIgnoreCase("cangkir") && barang2.equalsIgnoreCase("teko")) {
			volume = 0.04;
		} else if (barang1.equalsIgnoreCase("cangkir") && barang2.equalsIgnoreCase("botol")) {
			volume = 0.2;
		} else if (barang1.equalsIgnoreCase("cangkir") && barang2.equalsIgnoreCase("gelas")) {
			volume = 0.4;
		}
		System.out.println("1 " + barang1 + " = " + volume + " " + barang2);
		masukan.close();
		
	}
}
