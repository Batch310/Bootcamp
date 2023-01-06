package day5.test;

import java.util.Random;
import java.util.Scanner;

public class Soal7TebakAngkaGameKartu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Input Jumlah Kartu
		System.out.print("Jumlah Kartu Anda : ");
		int jmlKartu = input.nextInt();
		System.out.print("Jumlah Kartu Komputer : ");
		int jmlKartuKomputer = input.nextInt();

		int[] pilihanAngkaRandom = new int[2];
		Random random = new Random();
		for (int i = 0; i < 2; i++) {
			int angka = random.nextInt(10);
			pilihanAngkaRandom[i] = angka;
			// System.out.println(angka);
		}

		// Pasang Taruhan
		System.out.print("Masukkan Jumlah Taruhan : ");
		int jmlTaruhan = input.nextInt();

		// Memanggil index array angka acak pilihan
		int opsiA = pilihanAngkaRandom[0];
		int opsiB = pilihanAngkaRandom[1];

		// Memilih Kotak A /B
		System.out.println("Pilih Kotak A / B : ");
		String pilih = input.next();

		int jmlKartuTerakhir = 0;
		int jmlkartuKomputerTerahkir = 0;
		if (pilih.equals("A")) {
			System.out.println("Kotak A : "+opsiA+" dan Kotak B : "+opsiB);
			if (opsiA > opsiB) {
				System.out.println("Angka yang anda pilih lebih besar. anda menang sebanyak " + jmlTaruhan + " kartu");
				jmlKartuTerakhir = jmlKartu + jmlTaruhan;
				jmlkartuKomputerTerahkir = jmlKartuKomputer - jmlTaruhan;
				System.out.println("Jumlah Kartu Anda saat ini sebanyak "+jmlKartuTerakhir+" kartu");
				System.out.println("Komputer menang "+jmlkartuKomputerTerahkir+" kartu");
			} else if (opsiA < opsiB) {
				System.out.println("Angka yang anda pilih lebih kecil. Anda kalah sebanyak " + jmlTaruhan + " kartu");
				jmlKartuTerakhir = jmlKartu - jmlTaruhan;
				jmlkartuKomputerTerahkir = jmlKartuKomputer + jmlTaruhan;
				System.out.println("Jumlah Kartu Anda saat ini sebanyak "+jmlKartuTerakhir+" kartu");
				System.out.println("Komputer menang "+jmlkartuKomputerTerahkir+" kartu");
			}
		}else if(pilih.equals("B")) {
			System.out.println("Kotak A : "+opsiA+" dan Kotak B : "+opsiB);
			if (opsiA < opsiB) {
				System.out.println("Angka yang anda pilih lebih besar. anda menang sebanyak " + jmlTaruhan + " kartu");
				jmlKartuTerakhir = jmlKartu + jmlTaruhan;
				jmlkartuKomputerTerahkir = jmlKartuKomputer - jmlTaruhan;
				System.out.println("Jumlah Kartu Anda saat ini sebanyak "+jmlKartuTerakhir+" kartu");
				System.out.println("Komputer menang "+jmlkartuKomputerTerahkir+" kartu");
			} else if (opsiA > opsiB) {
				System.out.println("Angka yang anda pilih lebih kecil. Anda kalah sebanyak " + jmlTaruhan + " kartu");
				jmlKartuTerakhir = jmlKartu - jmlTaruhan;
				jmlkartuKomputerTerahkir = jmlKartuKomputer + jmlTaruhan;
				System.out.println("Jumlah Kartu Anda saat ini sebanyak "+jmlKartuTerakhir+" kartu");
				System.out.println("Komputer menang "+jmlkartuKomputerTerahkir+" kartu");
			}
		}

	}

}
