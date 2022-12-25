package day4.latihan.exam;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String rekening;

		int setor = 0;
		int transfer = 0;
		int sisa_saldo = 0;
		int pin = 123456;
		int pilihan;

		System.out.print("Masukkan PIN: ");
		pin = scan.nextInt();
		if (!(pin == 123456)) {
			System.out.print("PIN salah");
			System.exit(0);
		}

		System.out.print("Masukkan setor: ");
		setor = scan.nextInt();

		System.out.println();

		System.out.println("Pilihan transfer: ");
		System.out.print("1.antar rekening  ");
		System.out.println("2.antar bank");

		pilihan = scan.nextInt();

		if (pilihan == 1) {

			System.out.println("Masukkan rekening tujuan: ");
			rekening = scan.next();

			if (rekening.length() != 10) {
				System.out.println("rekening harus 10 digit");
				System.exit(0);
			}

			System.out.println("Masukkan nomoinal transfer");
			transfer = scan.nextInt();

			if (setor - transfer < 0) {
				System.out.println("saldo tidak mencukupi");
			} else if (setor - transfer >= 0) {
				sisa_saldo = setor - transfer;
				System.out.println("Transaksi berhasil, sisa saldo: " + sisa_saldo);

			}

		} else if (pilihan == 2) {

			System.out.print("masukkan kode bank: ");
			int kd_bank = scan.nextInt();

			System.out.print("Masukkan rekening tujuan: ");
			rekening = scan.next();
			if (rekening.length() != 10) {
				System.out.println("rekening harus 10 digit");
			}

			System.out.print("masukkan nominal transfer: ");
			transfer = scan.nextInt();

			if (setor - transfer - 7500 < 0) {
				System.out.println("saldo tidak cukup");
			} else if (setor - transfer - 7500 >= 0) {
				sisa_saldo = setor - transfer - 7500;
				System.out.println("Transfer berhasil, saldo anda " + sisa_saldo);
			}

		} else {
			System.out.println("pilihan salah");
		}

	}

}
