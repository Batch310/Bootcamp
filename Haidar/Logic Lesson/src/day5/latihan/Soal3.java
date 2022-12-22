package day5.latihan;

import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan data: ");
		int data = masukan.nextInt();
		
//		int seratusInt = 100;	
		
		int found = 0;
		
		for (int seratusInt = 100; found < data; seratusInt++) { //Perulangan Si Angka 1 mulai dari 100 ditambah satu terus sampai yang ditemukan (found) sama dengan data 
			int hasil = 0; //variabel penampung hasil penjumlahan pangkat
			String seratusStr = Integer.toString(seratusInt); //Pengubahan angka 100 dari tipe data integer ke String
			
			String[] arrSeratusStr = seratusStr.split(""); //Pemecahan angka 100 tipe data String untuk mengambil setiap digit dari angka 100 dan dimasukkan array
			
			for (int j = 0; j < arrSeratusStr.length; j++) { //Perulangan untuk mengambil angka digit pada array angka seratus 
				int convAngka = Integer.parseInt(arrSeratusStr[j]); //Konversi atau pengubahan setiap digit pada angka array seratus dari tipe data String ke int
				int totalPangkat = (int) Math.pow(convAngka, 2); //Mempangkatkan setiap digitnya dengan pangkat 2
				hasil += totalPangkat; //Menambahkan hasil penjumlahan pangkat setiap digit
//				System.out.println(hasil);
			} 
			
			if (hasil == 1) { //Kondisi jika hasil penjumlahan pangkat setiap digit sama dengan 1
				System.out.println(seratusInt + " adalah Si Angka 1"); //Cetak angka (100 + (berapa kali perulangan)) adalah Si Angka 1
				found++; //Menambahkan penemuan Si Angka 1
			} else { //Kondisi jika hasil penjumlahan pangkat setiap digit tidak sama dengan 1
				while (hasil > 9) { //Perulangan untuk menemukan hasil penjumlahan pangkat yang banyaknya 1 digit
					String hasilStr = Integer.toString(hasil); //Konversi atau pengubahan hasil penjumlahan pangkat dari tipe data int ke String untuk dipisah per satu digit supaya bisa dipecah
					String[] arrHasilStr = hasilStr.split(""); //Pemecahan hasil penjumlahan pangkat tipe data String untuk mengambil setiap satu digitnya dan dimasukkan ke array
					hasil = 0; //Mereset hasil menjadi 0 kembali untuk menemukan hasil penjumlahan pangkat yang sama dengan 1
					for (int k = 0; k < arrHasilStr.length; k++) { //Perulangan untuk mengambil setiap digit dari array hasil penjumlahan pangkat
						int convAngka = Integer.parseInt(arrHasilStr[k]); //Konversi atau pengubahan setiap digit pada hasil penjumlahan pangkat dari tipe data String ke int 
						int totalPangkat = (int) Math.pow(convAngka, 2); //Mempangkatkan setiap digitnya dengan pangkat 2
						hasil += totalPangkat; //Menambahkan hasil penjumlahan pangkat setiap digit
					}
					if (hasil == 1) { //Kondisi jika hasil penjumlahan pangkat setiap digit sama dengan 1
						System.out.println(seratusInt + " adalah Si Angka 1"); //Cetak angka (100 + (berapa kali perulangan)) adalah Si Angka 1
						found++; //Menambahkan penemuan Si Angka 1
					}
				}
			}
			
//			System.out.println(hasil);
		}
		
	}
}
