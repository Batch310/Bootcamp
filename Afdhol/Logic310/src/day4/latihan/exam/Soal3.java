package day4.latihan.exam;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("input n: ");
		int data = input.nextInt();

		int found = 0;

		for (int seratusInt = 100; found < data; seratusInt++) { // Perulangan Si Angka 1 mulai dari 100 ditambah satu
																	// terus sampai yang ditemukan (found) sama dengan
																	// data
			int hasil = 0; 
			String seratusStr = Integer.toString(seratusInt); // Pengubahan angka 100 dari tipe data integer ke String

			String[] arrSeratusStr = seratusStr.split(""); // Pemecahan angka 100 tipe data String untuk mengambil
															// setiap digit dari angka 100 dan dimasukkan array

			for (int i = 0; i < arrSeratusStr.length; i++) { // Perulangan untuk mengambil angka digit pada array angka
																// seratus
				int convertAngka = Integer.parseInt(arrSeratusStr[i]); // Konversi atau pengubahan setiap digit pada
																		// angka array seratus dari tipe data String ke
																		// int
				int totalPangkat = (int) Math.pow(convertAngka, 2); // Mempangkatkan setiap digitnya dengan pangkat 2
				hasil += totalPangkat; // Menambahkan hasil penjumlahan pangkat setiap digit
//				System.out.println(hasil);
			}

			if (hasil == 1) { // Kondisi jika hasil penjumlahan pangkat setiap digit sama dengan 1
				System.out.println(seratusInt + " adalah Si Angka 1"); // Cetak angka (100 + (berapa kali perulangan))
																		// adalah Si Angka 1
				found++; // Menambahkan penemuan Si Angka 1
			} 

		}

	}

}
