package day2.latihan;

import java.util.Iterator;
import java.util.Scanner;

public class LatihanSoal05 {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); //Memanggil fungsi atau package Scanner milik Java
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt(); //Input banyaknya deret
		
		int angka = 1; //Variabel bantu angka awal bilangan
		int[] deretAngka = new int[deret]; //Inisiasi array deret bilangan
		int kelipatan = 1; //Variabel bantu kelipatan yang akan dijeda dengan tanda *
		
		for (int i = 0; i < deretAngka.length; i++) { //Pengulangan for dari indeks array ke-0 sampai indeks array ke-(deret-1)
			deretAngka[i] = angka; //Memasukkan variabel bantu angka ke array
			if (i == (3*kelipatan)-1) { //Kondisi jika indeks pada array sama dengan kelipatan 3 (minus 1 karena indeks array dimulai dari 0)
				System.out.print("* "); //Cetak * sebagai penjeda pada array bilangan
				kelipatan++; //Tambahkan variabel bantu kelipatan dengan 1
			} else {
				System.out.print(deretAngka[i] + " "); //Cetak array bilangan
				angka = angka+4; //Tambahkan variabel bantu angka dengan 4
			}
		}

	}

}
