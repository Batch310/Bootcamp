package day1.latihan;

import java.util.Scanner;

public class LatihanTujuh {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); //Inisiasi tipe data Scanner variabel masukan sebagai input dari console
		
		System.out.print("Masukkan Angka: ");
		int angka = masukan.nextInt(); //Input Angka
		
		if (angka%2 == 0) { //Kondisi bila angka habis dibagi 2
			System.out.println("Bilangan Genap");
		} else { //Kondisi bila angka tidak habis dibagi 2
			System.out.println("Bilangan Ganjil");
		}

	}

}
//5m