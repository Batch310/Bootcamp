package catatan.untuk.FT1;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukkan PIN: ");
		int pin = masukan.nextInt(); // Input PIN

		if (pin == 123456) { // Validasi PIN
			System.out.print("Uang yang disetor: ");
			long uang = masukan.nextLong(); // Input Uang

			System.out.println("Pilihan transfer: 1. Antar Rekening    2. Antar Bank");
			int tf = masukan.nextInt(); // Input Pilihan Transfer
			if (tf == 1) { // Kondisi Pilihan 1
				System.out.print("Masukkan rekening tujuan: ");
				long rekTujuan = masukan.nextLong(); // Input rekening

				if (rekTujuan > 999999999 && rekTujuan < 10000000000l) { // Kondisi digit rekening tujuan sama dengan 10
																			// digit
					System.out.print("Masukkan nominal transfer: ");
					long nominal = masukan.nextLong(); // Input nominal transfer

					long saldo = (uang - nominal); // Rumus Saldo
					if (saldo >= 0) { // Kondisi saldo cukup
						System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + saldo + ",-");
					} else { // Kondisi saldo tidak cukup
						System.out.println("Saldo tidak mencukupi");
					}
				} else {
					System.exit(0);
				}
			} else if (tf == 2) { // Kondisi Pilihan 2
				System.out.print("Masukkan kode bank: ");
				int kodeBank = masukan.nextInt(); // Input kode bank

				System.out.print("Masukkan rekening tujuan: ");
				long rekTujuan = masukan.nextLong(); // Input rekening

				if (rekTujuan > 999999999 && rekTujuan < 10000000000l) {
					System.out.print("Masukkan nominal transfer: ");
					long nominal = masukan.nextLong();

					long biayaAdmin = 7500; // Inisiasi biaya Admin
					long totalTransfer = (nominal + biayaAdmin); // Inisiasi total biaya transfer

					long saldo = (uang - totalTransfer); // Rumus saldo
					if (saldo >= 0) { // Kondisi total biaya transfer lebih dari saldo
						System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + saldo + ",-");
					} else { // Kondisi total biaya transfer kurang dari saldo
						System.out.println("Saldo tidak mencukupi");
					}
				} else {
					System.exit(0);
				}
			}

		} else {
			System.out.println("PIN salah");
			System.exit(0); // Paksa berhenti program
		}
	}
}