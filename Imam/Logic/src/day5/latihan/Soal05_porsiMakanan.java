package day5.latihan;

import java.util.Scanner;

public class Soal05_porsiMakanan {

	public static void main(String[] args) {

//		// L 1 orang dewasa laki = 2 piring nasgor
//		// P 1 orang dewasa perempuan = 1 mie goreng
//		// R 2 orang remaja =  2 mie ayam
//        // A 1 anak = 1/2 nasgor
//		// B 1 balita = 1 mangkok kecil bubur

//		jika jumlah orang ganjil, 1 P += piring nasgor

//laki-laki dewasa = 3 orang; perempuan = 1 orang;Balita = 1 orang; laki-laki dewasa 1 orang

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan pelanggan = ");
		String[] inputan = scanner.nextLine().split(";"); //terakhir pake ";" >> .length

		int sumJmlOrang = 0;
		int jmlPerempuan = 0;
		double porsi = 0;
		double sumPorsi = 0;

		for (int i = 0; i < inputan.length; i++) {

			String[] pelanggan = inputan[i].split("= ");
			String orang = pelanggan[0]; // cari orang
			int jumlahOrang = Integer.parseInt(pelanggan[1].substring(0, 1));//Ubah string ke int(jmlOrang)
			String totaljmlOrang = pelanggan[1].substring(0, 1);
			if (orang.equalsIgnoreCase("laki-laki dewasa ") || orang.equalsIgnoreCase("remaja")) {
				porsi = jumlahOrang * 2;
			} else if (orang.equalsIgnoreCase("perempuan dewasa ")) {
				porsi = jumlahOrang;
				jmlPerempuan += jumlahOrang;
			} else if (orang.equalsIgnoreCase("anak ")) {
				porsi = jumlahOrang*0.5;
			} else if (orang.equalsIgnoreCase("balita ")) {
				porsi = jumlahOrang;
			}
			sumJmlOrang += jumlahOrang;
			sumPorsi += porsi;

		}

		if (sumJmlOrang > 5 && sumJmlOrang % 2 != 0) {

			sumPorsi += jmlPerempuan;
		}
		System.out.print(sumPorsi + " porsi");

	}
}
