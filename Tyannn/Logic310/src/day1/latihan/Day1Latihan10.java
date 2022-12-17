package day1.latihan;

import java.util.Scanner;

public class Day1Latihan10 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);

		System.out.print("Masukan PIN : ");
		int pin = inputan.nextInt();

		if (pin == 123456) {
			System.out.println("PIN Benar");

			System.out.print("Uang yang disetor : ");
			int setor = inputan.nextInt();
			System.out.print("Pilihan Transfer : ");
			int pilihan = inputan.nextInt();

			if (pilihan == 1) {
				System.out.print("Masukkan rekening tujuan : ");
				int rek1 = 10;
				String rekening1 = inputan.next();

				if (rekening1.length() == rek1) {
					System.out.print("Masukan nominal transfer : ");
					int nominal1 = inputan.nextInt();
					if (setor < nominal1) {
						System.out.println("Saldo tidak mecukupi");
					} else {
						int saldo = setor - nominal1;
						System.out.print("Transaksi berhasil, saldo anda saat ini Rp. " + saldo + ",-");
					}
					System.exit(0);
				} else if (rekening1.length() > rek1) {
					System.out.println("Maaf. Nomor Rekening kelebihan");
				} else {
					System.out.println("Maaf. Nomor Rekening Kurang");
				}

			} else if (pilihan == 2) {
				System.out.print("Masukan kode bank : ");
				int kodebank = inputan.nextInt();
				System.out.print("Masukan rekening tujuan : ");
				int rek2 = 10;
				String rekening2 = inputan.next();

				if (rekening2.length() == rek2) {
					System.out.print("Masukan nominal transfer : ");
					int nominal2 = inputan.nextInt();

					if (setor < nominal2) {
						System.out.println("Saldo tidak mencukupi");
					} else {
						int saldo2 = setor - nominal2 - 7500;
						System.out.print("Transaksi berhasil, saldo anda saat ini Rp. " + saldo2 + ",-");
					}
					System.exit(0);
				}else if(rekening2.length() > rek2){
					System.out.println("Maaf. No Rekening Kelebihan");
				}else {
					System.out.println("Maaf. No Rekening Kurang");
				}

			}
			System.exit(0);
		} else {
			System.out.println("PIN Salah");
			System.exit(0);
		}

	}
}
