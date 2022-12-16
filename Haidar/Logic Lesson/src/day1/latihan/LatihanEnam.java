package day1.latihan;

import java.util.Scanner;

public class LatihanEnam {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); //Inisiasi tipe data Scanner variabel masukan sebagai input dari console

		System.out.print("Masukkan Angka: ");
		int angka = masukan.nextInt(); //Input angka

		if (angka < 0) { //Kondisi angka kurang dari 0, maka bukan satuan atau puluhan
			System.out.println(angka + " bukan satuan atau puluhan");
		} else if (angka < 10) { //Kondisi angka lebih dari 0 dan kurang dari 10, maka angka adalah satuan
			System.out.println(angka + " adalah satuan");
		} else if (angka < 100) { //Kondisi angka lebih dari 0 dan kurang dari 100, maka angka adalah puluhan
			System.out.println(angka + " adalah puluhan");
		} else { //Kondisi angka lebih dari 0 dan lebih dari 100, maka angka bukan satuan atau puluhan
			System.out.println(angka + " bukan satuan atau puluhan");
		}

	}

}
//5m