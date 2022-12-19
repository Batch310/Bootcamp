package day2.latihan;

import java.util.Scanner;

public class LatihanSoal07 {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); //Memanggil fungsi atau package Scanner milik Java
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt(); //Input banyaknya deret
		
		int angka = 2; //Variabel bantu angka awal bilangan
		int[] deretAngka = new int[deret]; //Inisiasi array deret bilangan
		
		for (int i = 0; i < deretAngka.length; i++) { //Pengulangan for dari indeks array ke-0 sampai indeks array ke-(deret-1)
			deretAngka[i] = angka; //Memasukkan variabel bantu angka ke array
			System.out.print(deretAngka[i] + " "); //Cetak array bilangan
			angka = angka * 2; //Kalikan variabel bantu angka dengan 2
		}

	}

}
