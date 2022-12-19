package day2.latihan;

import java.util.Scanner;

public class LatihanSoal01 {

	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in); //Memanggil fungsi atau package Scanner milik Java
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt(); //Input banyaknya deret
		
		int angka = 1; //variabel bantu angka awal bilangan ganjil
		int[] deretGanjil = new int[deret]; //Inisiasi array deret bilangan ganjil
		
		for (int i = 0; i < deretGanjil.length; i++) { //Pengulangan for dari indeks array ke-0 sampai indeks array ke-(deret-1)
			if (angka%2 != 0) { //Kondisi jika variabel bantu angka dibagi 2 tidak habis, maka
				deretGanjil[i] = angka; //Masukkan variabel bantu angka ke dalam array
				System.out.print(deretGanjil[i] + " "); //Cetak array deret bilangan ganjil
			}
			angka = angka + 2; //Tambahkan variabel bantu angka dengan 2
		}
	}

}
