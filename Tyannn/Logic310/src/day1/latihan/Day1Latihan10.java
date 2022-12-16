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
				int rekening1 = inputan.nextInt();
				System.out.print("Masukan nominal transfer : ");
				int nominal1 = inputan.nextInt();

				int saldo = setor - nominal1;
				System.out.print("Transaksi berhasil, saldo anda saat ini Rp. " + saldo+ ",-");
			} else if (pilihan == 2) {
				System.out.print("Masukan kode bank : ");
				int kodebank = inputan.nextInt();
				System.out.print("Masukan rekening tujuan : ");
				int rekening2 = inputan.nextInt();
				System.out.print("Masukan nominal transfer : ");
				int nominal2 = inputan.nextInt();

				int saldo2 = setor - nominal2 - 7500;
				System.out.print("Transaksi berhasil, saldo anda saat ini Rp. " + saldo2 + ",-");
			}

		} else {
			System.out.println("PIN Salah");
		}

	}
}
