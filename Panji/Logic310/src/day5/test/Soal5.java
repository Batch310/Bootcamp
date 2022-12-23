package day5.test;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Laki-laki Dewasa : ");
		int orangDewasaLakiLaki = input.nextInt();// Input Jumlah orang dewasa laki-laki
		System.out.print("Perempuan Dewasa : ");
		int orangDewasaPerempuan = input.nextInt();// Input Jumlah orang dewasa perempuan
		System.out.print("Remaja : ");
		int orangRemaja = input.nextInt();// Jumlah orang remaja
		System.out.print("Anak : ");
		int orangAnak = input.nextInt();// Jumlah orang anak
		System.out.print("Balita : ");
		int orangBalita = input.nextInt();// Jumlah orang balita

		int totalNasiGorengDewasaLakiLaki = orangDewasaLakiLaki * 2;
		int totalMieGorengDewasaPerempuan = orangDewasaPerempuan * 1;
		int totalAyamRemaja = orangRemaja * 2;
		int totalNasiGorengAnak = (int) (orangAnak * 0.5);
		int totalBuburSehatBalita = orangBalita * 1;

		// Hitung total porsi makanan yang dimakan
		int totalPorsiMakanan = totalNasiGorengDewasaLakiLaki + totalMieGorengDewasaPerempuan + totalAyamRemaja
				+ totalNasiGorengAnak + totalBuburSehatBalita;

		// Jika jumlah orang yang sedang makan ganjil dan lebih dari 5 orang
		if ((totalPorsiMakanan % 2 == 1) && (totalPorsiMakanan > 5)) {
			totalPorsiMakanan = totalPorsiMakanan + 1;
		}

		// Tampilkan total porsi makanan yang dimakan
		System.out.println("Total porsi makanan yang dimakan: " + totalPorsiMakanan);
	}

}
