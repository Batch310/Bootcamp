package day2.latihan;

import java.util.Scanner;

public class LatihannSoal10 {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); //Memanggil fungsi atau package Scanner milik Java
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt(); //Input banyaknya deret
		
		int angka = 3; //Variabel bantu angka awal bilangan
		int[] deretAngka = new int[deret]; //Inisiasi array deret bilangan
		
		for (int i = 0; i < deretAngka.length; i++) { //Pengulangan for dari indeks array ke-0 sampai indeks array ke-(deret-1)
			deretAngka[i] = angka; //Memasukkan variabel bantu angka ke array
			
			if (deret%2 == 0) { //Kondisi jika banyaknya deret genap
				if (i == deret/2 || i == (deret/2)+1) { //Kondisi jika indeks para array adalah setengah dari deret dan setengah dari deret + 1
					System.out.print("XXX "); //Cetak XXX sebagai pengganti bilangan pada indeks yang berada pada setengah dari deret dan setengah dari deret + 1
				} else {
					System.out.print(deretAngka[i] + " "); //Cetak array bilangan
				}
			} else {
				if (i == deret/2) { //Kondisi jika banyaknya deret ganjil
					System.out.print("XXX "); //Cetak XXX sebagai pengganti bilangan pada indeks yang berada pada setengah dari deret 
				} else {
					System.out.print(deretAngka[i] + " "); //Cetak array bilangan
				}
			}
			angka = angka * 3; //Kalikan variabel bantu angka dengan 3
		}

	}

}
