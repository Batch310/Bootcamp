package day5.latihan;

import java.util.Scanner;

public class Soal03_SiAngka1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan n = ");
		int n = scanner.nextInt();
		int angka = 100;

		int found = 0;

		while (found < n) {
			String sAngka = Integer.toString(angka);//ubah int>>string anggar bisa di split
			String[] arrAngka = sAngka.split("");//split ke array
			int hasil = 0;
			for (int i = 0; i < arrAngka.length; i++) { 
				int operasiAngka = Integer.parseInt(arrAngka[i]); //masukin ke array 
				int pangkat = (int) Math.pow(operasiAngka, 2); //operasi pemangkatan
				hasil += pangkat;
			}
			if (hasil == 1) {
				System.out.println(angka + " adalah si Angka 1");
				angka++;
				found++;
			} else {
				while (hasil > 9) {     //jika 2 digit
					String sAngka2 = Integer.toString(hasil);
					String[] arrAngka2 = sAngka2.split("");
					hasil = 0;
					for (int i = 0; i < arrAngka2.length; i++) {
						int operasiAngka = Integer.parseInt(arrAngka2[i]);
						int pangkat = (int) Math.pow(operasiAngka, 2);
						hasil += pangkat;

					}
					if (hasil == 1) {
						System.out.println(angka + " adalah si Angka 1");
						found++;
					}
				}

			}
			angka++;
		}

	}

}
