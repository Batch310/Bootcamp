package day5.latihanFT;

import java.util.Scanner;

public class Soal5PorsiMakan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int Lakilaki = 2;
		int Perempuan = 1;
		int remaja = 1;
		double anak = 0.5;
		int balita = 1;

		int porsiLakilaki = 0;
		int porsiPerempuan = 0;
		int porsiRemaja = 0;
		double porsiAnak = 0;
		int porsiBalita = 0;

		double totalJumlahPorsi = 0;
		int totalOrang = 0;
		int intOrang = 0;
		String orang = "";

		System.out.print("Masukkan pelanggan : "); //1Lakilaki ; 2Perempuan ; 
		String pelanggan = input.nextLine();

		String[] arrPelanggan = pelanggan.split(";");
		for (int i = 0; i < arrPelanggan.length; i++) {
			String[] yangMakan = arrPelanggan[i].split(" = ");
			for (int j = 1; j >= 0; j--) {
				orang = yangMakan[0];
				if (yangMakan[j].contains(" orang")) {
					String jmlOrang = yangMakan[j].replace(" orang", "");
					intOrang = Integer.parseInt(jmlOrang);
				}
			}
			if (orang.equalsIgnoreCase("Laki-laki dewasa")) {
				porsiLakilaki += intOrang * Lakilaki;
			} else if (orang.equalsIgnoreCase("Perempuan dewasa")) {
				porsiPerempuan += intOrang * Perempuan;
			} else if (orang.equalsIgnoreCase("Remaja")) {
				porsiRemaja += intOrang * remaja;
			} else if (orang.equalsIgnoreCase("Anak-anak")) {
				porsiAnak += intOrang * anak;
			} else if (orang.equalsIgnoreCase("Balita")) {
				porsiBalita += intOrang * balita;
			}
			totalOrang += intOrang;
			if (totalOrang % 2 == 1 && totalOrang > 5) {
				porsiPerempuan += porsiPerempuan;
				totalJumlahPorsi = porsiLakilaki + porsiPerempuan + porsiRemaja + porsiAnak + porsiBalita;
			} else {
				totalJumlahPorsi = porsiLakilaki + porsiPerempuan + porsiRemaja + porsiAnak + porsiBalita;
			}
		}
		System.out.println(totalJumlahPorsi+ " porsi");
	}
}