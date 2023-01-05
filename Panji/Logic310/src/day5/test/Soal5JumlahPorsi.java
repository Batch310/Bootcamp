package day5.test;

import java.util.Scanner;

public class Soal5JumlahPorsi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("input : ");
		String data1 = input.nextLine();// Input

		int dataPerempuan = 0;
		int totalOrang = 0;
		int totalPorsi = 0;
		double porsiMakanan = 0;
		String[] arr1 = data1.split("; "); // Program split ";"
		for (int i = 0; i < arr1.length; i++) {

			String[] arr2 = arr1[i].split(" = "); // Program split "="
			String orang = arr2[0]; // Data Orang
			String jumlahOrang1 = arr2[1].substring(0, 1); // Data Jumlah Orang masih string
			int jmlOrang = Integer.parseInt(jumlahOrang1);
			System.out.println(orang);
			System.out.println(jmlOrang);

			if (orang.equalsIgnoreCase("Laki-laki dewasa")) {
				porsiMakanan = 2 * jmlOrang;
			} else if (orang.equalsIgnoreCase("Remaja")) {
				porsiMakanan = 2 * jmlOrang;
			} else if (orang.equalsIgnoreCase("Perempuan Dewasa")) {
				porsiMakanan = 1 * jmlOrang;
				dataPerempuan += jmlOrang;
			} else if (orang.equalsIgnoreCase("Anak-anak")) {
				porsiMakanan = jmlOrang * 0.5;
			} else if (orang.equalsIgnoreCase("Balita")) {
				porsiMakanan = jmlOrang * 1;
			}
			totalOrang += jmlOrang;
			totalPorsi += porsiMakanan;
		}
		if (totalOrang > 5 && totalOrang % 2 != 0) {
			totalPorsi += dataPerempuan;
		}
		System.out.println("Jumlah porsi : " + totalPorsi);
	}

}
