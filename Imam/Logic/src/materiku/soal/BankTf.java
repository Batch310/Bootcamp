package materiku.soal;

import java.util.Scanner;

public class BankTf {

	public static void main(String[] args) {

		int saldo = 0;

		Scanner inputan = new Scanner(System.in);
		System.out.print("Masukkan pin :");
		int pin = inputan.nextInt();

		if (pin == 123456) {
			System.out.print("Uang yang disetor: ");
			int setor = inputan.nextInt();
			if (setor >= 50000) {
				System.out.println("Saldo anda Rp  " + (saldo += setor));

			} else {
				System.out.println("Transaksi gagal!, Setor tunai mininal Rp 50000");
				System.exit(0);
			}

		} else {
			System.out.println("PIN Salah!");
			System.exit(0);
		}

		System.out.print("Pilihan transfer : 1. Antar Rekening");
		System.out.println("   2. Antar Bank");
		System.out.println(" ");
		System.out.print("Pilih 1 atau 2 : ");
		int pilih = inputan.nextInt();

		if (pilih == 1) {
			System.out.print("Masukkan rekening tujuan :");
			String noRek = inputan.next();

			if (10 == noRek.length()) {
				System.out.print("Masukkan nominal transfer : ");
				int transfer1 = inputan.nextInt();

				if (saldo > transfer1) {
					System.out.println("Transaksi anda berhasil, saldo anda saat ini Rp " + (saldo -= transfer1));
				} else {
					System.out.println("Saldo tidak mencukupi");
					System.exit(0);
				}

			} else {
				System.out.println("No rekening harus 10 digit!");
				System.exit(0);
			}

		} else if (pilih == 2) {
			System.out.print("Masukkan kode Bank :");
			int kode = inputan.nextInt();
			System.out.print("Rekening tujuan : ");
			String noRek = inputan.next();

			int biaya = 7500;

			if (10 == noRek.length()) {
				System.out.print("Masukkan nominal transfer : ");
				int transfer2 = inputan.nextInt();

				if (saldo > transfer2) {
					System.out.println("Transaksi anda berhasil!, saldo anda saat ini Rp " + (saldo - transfer2 - biaya));
				} else {
					System.out.println("Saldo tidak mencukupi!");
					System.exit(0);
				}

			} else {
				System.out.println("No rekening harus 10 digit!");
				System.exit(0);
			}
		} else {
			System.out.println("Pilih 1 atau 2!");
			System.exit(0);
		}
	}
}