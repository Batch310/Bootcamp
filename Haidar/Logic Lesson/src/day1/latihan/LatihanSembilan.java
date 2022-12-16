package day1.latihan;

import java.util.Random;
import java.util.Scanner;

public class LatihanSembilan {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); //Inisiasi tipe data Scanner variabel masukan sebagai input dari console
		Random angkaRandom = new Random(); //Inisiasi tipe data Random variabel angkaRandom sebagai pengacak angka pada mesin
		
		int angkaB = angkaRandom.nextInt(10); //Inisasi angkaB sebagai variabel angka acak dengan batas 0 sampai 9 (10 angka)
		
		System.out.print("Tebakan Angka Anda: ");
		int angka = masukan.nextInt(); //Input angka
		
		if (angka < 0 || angka > 9) { //Kondisi angka kurang dari 0 atau lebih dari 9
			System.out.println("Angka tidak valid, masukkan angka antara 0 - 9");
		} else if (angka == angkaB) { //Kondisi angka input sama dengan angka acak
			System.out.println("Angka dari bandar " + angkaB);
			System.out.println("Tebakan Anda benar bosku!");
		} else { //Kondisi angka input tidak sama dengan angka acak
			System.out.println("Angka dari bandar " + angkaB);
			System.out.println("Tebakan Anda Salah bosku!");
		}

	}

}
//9m