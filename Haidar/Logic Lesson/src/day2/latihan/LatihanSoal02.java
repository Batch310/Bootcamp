package day2.latihan;

import java.util.Scanner;

public class LatihanSoal02 {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); //Memanggil fungsi atau package Scanner milik Java
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt(); //Input banyaknya deret
		
		int angka = 2; //Variabel bantu angka awal bilangan genap
		int[] deretGenap = new int[deret]; //Inisiasi array deret bilangan genap
		
		for (int i = 0; i < deretGenap.length; i++) { //Pengulangan for dari indeks array ke-0 sampai indeks array ke-(deret-1)
			if (angka%2 == 0) { //Kondisi jika variabel bantu angka habis dibagi 2
				deretGenap[i] = angka; //Memasukkan variabel bantu angka ke array bilangan genap
				System.out.print(deretGenap[i] + " "); //Cetak array bilangan genap
			}
			angka = angka + 2; //Tambahkan variabel bantu dengan 2
		}
	}

}
