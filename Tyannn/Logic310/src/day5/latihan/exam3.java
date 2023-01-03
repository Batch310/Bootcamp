package day5.latihan;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {

		// input sebanyak n
		// 11 atau 111 langsung si angka 1
		// int hasil=0;
		Scanner input = new Scanner(System.in);

		System.out.print("input n: ");// misal input 2, data sejumlah 2
		int data = input.nextInt();// 2

		int found = 0;// 2

		for (int seratusInt = 100; found < data; seratusInt++) { // seratusInt = 104, found=2, data=2
			// Perulangan mulai dari 100 ditambah 1
			int hasil = 0; // 11
			String seratusStr = Integer.toString(seratusInt);// "103"
			// String 100 = 1 0 0
			String[] arrStringSeratus = seratusStr.split(""); // "1" "0" "3"

			for (int i = 0; i < arrStringSeratus.length; i++) { // i=3, arrStringSeratus.length=3
				int convertAngka = Integer.parseInt(arrStringSeratus[i]);// 3
				// misal i=0 String 1 menjadi int 1

				// int 1
				int totalPangkat = (int) Math.pow(convertAngka, 2);// 3pangkat2=9
				// pangkat 2
				// int 1 pangkat 2 =1, int 0 pangkat 2 = 0, int 0 pangkat 2 = 0
				hasil = hasil + totalPangkat;

			}

			if (hasil == 1) {
				System.out.println(seratusInt + " adalah Si Angka 1"); // Cetak angka (100 + (berapa kali perulangan))
																		// adalah Si Angka 1
				found++;

			} else { // !=1
				while (hasil > 9) { // Perulangan untuk menemukan hasil penjumlahan pangkat yang banyaknya 1 digit
					String hasilStr = Integer.toString(hasil);// "10"

					// Konversi atau pengubahan hasil penjumlahan pangkat

					String[] arrHasilStr = hasilStr.split(""); // "1","0"
					// Pemecahan hasil penjumlahan pangkat tipe data String

					hasil = 0; // 1
					for (int j = 0; j < arrHasilStr.length; j++) { // j=2, arrHasilStr.length=2
						// Perulangan untuk mengambil setiap digit dari array
						// hasil penjumlahan pangkat
						int convAngka = Integer.parseInt(arrHasilStr[j]);// 0
						// konversi ke int
						int totalPangkat = (int) Math.pow(convAngka, 2);// 0 dipangkatkan 2=0
						hasil += totalPangkat;
					}
					if (hasil == 1) { // Kondisi jika hasil penjumlahan pangkat setiap digit sama dengan 1
						System.out.println(seratusInt + " adalah Si Angka 1"); // Cetak
						found++;
					}
				}
			}

		}

	}
}