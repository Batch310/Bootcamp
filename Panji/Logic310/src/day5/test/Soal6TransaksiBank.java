package day5.test;

import java.util.Scanner;

public class Soal6TransaksiBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int biayaAdmin = 7500; // Biaya Admin untuk transaksi beda bank
		int pinBenar = 123456; // PIN yang dimasukkan tiap transaksi
		int pin, setor, nominal1, nominal2, pilih, sisa1, sisa2, kode;

		// Input Awal Menu
		System.out.print("Masukkan PIN anda 		: ");
		pin = input.nextInt();

		// Step Transaksi
		if (pin == pinBenar) {
			System.out.println();
			System.out.print("Masukkan jumlah disetor 	: Rp");
			setor = input.nextInt();
			System.out.println();
			System.out.println("===== Pilihan Transfer =====");
			System.out.println("1. Antar Rekening");
			System.out.println("2. Antar Bank");
			System.out.print("Pilih : ");
			pilih = input.nextInt();

			// Step Ketika Pilih Transaksi 1
			if (pilih == 1) {
				System.out.print("Masukkan PIN anda		: ");
				pin = input.nextInt();

				if (pin == pinBenar) {
					System.out.print("Masukkan Rekening Tujuan 	: ");
					String rekening1 = input.next();

					if (rekening1.length() >= 10) {
						System.out.print("Masukkan Nominal Transfer	: Rp");
						nominal1 = input.nextInt();

						if (nominal1 < setor) {
							sisa1 = setor - nominal1;
							System.out.println("Transaksi berhasil, saldo anda saat ini Rp" + sisa1);
						} else if (nominal1 > setor) {
							System.out.println("Saldo Tidak Mencukupi");
						}
					} else {
						System.out.println("Nomor rekening harus minimal 10 digit");
					}
				} else {
					System.out.println("PIN salah");
				}
			}
			// Step Ketika Pilih Transaksi 2
			if (pilih == 2) {
				System.out.print("Masukkan PIN anda		: ");
				pin = input.nextInt();

				if (pin == pinBenar) {
					System.out.print("Masukkan Kode Bank 		: ");
					kode = input.nextInt();
					System.out.print("Masukkan Rekening Tujuan 	: ");
					String rekening2 = input.next();

					if (rekening2.length() >= 10) {
						System.out.print("Masukkan Nominal Transfer	: Rp");
						nominal2 = input.nextInt();

						if (nominal2 < setor) {
							sisa2 = setor - nominal2 - biayaAdmin;
							if (sisa2 > 0) {
								System.out.println("Transaksi berhasil, saldo anda saat ini Rp" + sisa2);
							} else if (sisa2 < 0) {
								System.out.println("Saldo Tidak Mencukupi");
							}
						} else if (nominal2 > setor) {
							System.out.println("Saldo Tidak Mencukupi");
						}
					} else {
						System.out.println("Nomor rekening harus minimal 10 digit");
					}
				} else {
					System.out.println("PIN salah");
				}
			}

		} else {
			System.out.println("PIN salah"); // Output jika salah pin
		}
	}
}