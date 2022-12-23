package day5.test;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("input : ");
		String data1 = input.nextLine();// Input

		String simpan = "";
		// Program split ";"
		String[] arr1 = data1.split("; ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			// Program split "="
			String[] arr2 = arr1[i].split(" = ");
			String orang = arr2[0];
			String jmlOrang = arr2[1].substring(0,1);
			
			int jmlO = Integer.parseInt(jmlOrang);
			
			System.out.println(orang);
			System.out.println(jmlOrang);
			System.out.println(jmlO);
			

		}
		// Program split
		// String[] arr3 = simpan.split("");
//			char newChar1 = simpan.charAt(0);
//			System.out.print(simpan.charAt(0));

//		int totalNasiGorengDewasaLakiLaki = orangDewasaLakiLaki * 2;
//		int totalMieGorengDewasaPerempuan = orangDewasaPerempuan * 1;
//		int totalAyamRemaja = orangRemaja * 2;
//		int totalNasiGorengAnak = (int) (orangAnak * 0.5);
//		int totalBuburSehatBalita = orangBalita * 1;

		// Hitung total porsi makanan yang dimakan
//		int totalPorsiMakanan = totalNasiGorengDewasaLakiLaki + totalMieGorengDewasaPerempuan + totalAyamRemaja
//				+ totalNasiGorengAnak + totalBuburSehatBalita;

		// Jika jumlah orang yang sedang makan ganjil dan lebih dari 5 orang
//		if ((totalPorsiMakanan % 2 == 1) && (totalPorsiMakanan > 5)) {
//			totalPorsiMakanan = totalPorsiMakanan + 1;
//		}

		// Tampilkan total porsi makanan yang dimakan
		// System.out.println("Total porsi makanan yang dimakan: " + totalPorsiMakanan);
	}

}
