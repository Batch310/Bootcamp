package day5.latihan.exam;

import java.util.Scanner;

public class Soal3SiAngka100 {

	public static void main(String[] args) {

		// input sebanyak n
		//
		// challenge : apabila hasil 11 atau 111 atau 111 maka langsung menjadi "Si Angka 1"

		Scanner input = new Scanner(System.in);
		System.out.print("input n: ");
		int data = input.nextInt();

		int found = 0;

		for (int seratusInt = 100; found < data; seratusInt++) { // Perulangan mulai dari 100 ditambah 1
			int hasil = 0;
			String seratusStr = Integer.toString(seratusInt); //ubah dari integer ke string

			String[] arrStringSeratus = seratusStr.split(""); // split per karakter

			for (int i = 0; i < arrStringSeratus.length; i++) { // Perulangan untuk mengambil angka digit pada array
																// angka
																// seratus
				int convertAngka = Integer.parseInt(arrStringSeratus[i]);

				int totalPangkat = (int) Math.pow(convertAngka, 2); // pangkat 2
				hasil += totalPangkat;

			}

			if (hasil == 1 || hasil == 11 || hasil == 111 || seratusInt == 111 ) { // jika hasil=1 atau hasil = 11 atau
																					
				System.out.println(seratusInt + " adalah Si Angka 1"); // Cetak angka (100 + (berapa kali perulangan))
																		// adalah Si Angka 1
				found++;

			} else { // !=1
				while (hasil > 9) { // Perulangan untuk menemukan hasil penjumlahan pangkat yang banyaknya 1 digit
					String hasilStr = Integer.toString(hasil); // Konversi atau pengubahan hasil penjumlahan pangkat

					String[] arrHasilStr = hasilStr.split(""); // Pemecahan hasil penjumlahan pangkat tipe data String

					hasil = 0; // Mereset hasil menjadi 0
					for (int j = 0; j < arrHasilStr.length; j++) { // Perulangan untuk mengambil setiap digit dari array
																	// hasil penjumlahan pangkat
						int convAngka = Integer.parseInt(arrHasilStr[j]);
						int totalPangkat = (int) Math.pow(convAngka, 2);
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
