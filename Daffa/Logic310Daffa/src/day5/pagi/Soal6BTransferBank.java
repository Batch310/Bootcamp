package day5.pagi;

import java.util.Scanner;

public class Soal6BTransferBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int biayaAdmin = 7500;
		int pin = 123456;
		int kodeBank = 001;
		int inputPIN, setor, nominalTransfer, pilih, saldo;

		System.out.println("Selamat datang di ATM");
		System.out.print("Masukkan PIN anda : ");
		inputPIN = input.nextInt();

		if (inputPIN == pin) {
			System.out.print("\n\nMasukkan jumlah setor tunai : ");
			setor = input.nextInt();
			saldo = setor;

			System.out.print("\n\nPilih transfer : ");
			System.out.println("\n1. Antar Rekening" + "\n2. Antar Bank");
			System.out.println("Pilih : ");
			pilih = input.nextInt();

			if (pilih == 1) {
				System.out.println("Masukkan nomor rekening : ");
				String rekening1 = input.next();
				if (rekening1.length() > 9) {
					System.out.println("Masukkan nominal transfer");
					nominalTransfer = input.nextInt();
					if (nominalTransfer < saldo) {
						saldo -= nominalTransfer;
						System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + saldo);
					} else {
						System.out.println("Saldo anda tidak cukup");
					}
				} else {
					System.out.println("Rekening salah!");
				}
			} else if (pilih == 2) {
				System.out.println("Masukkan kode bank : ");
				int inputKodeBank = input.nextInt();
				if (inputKodeBank == kodeBank) {
					System.out.println("Masukkan nomor rekening : ");
					String rekening2 = input.next();
					if (rekening2.length() > 9) {
						System.out.println("Masukkan nominal transfer : ");
						nominalTransfer = input.nextInt();
						if ((saldo - biayaAdmin) > nominalTransfer) {
							saldo = (saldo - biayaAdmin) - nominalTransfer;
							System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + saldo);
						} else {
							System.out.println("Saldo anda tidak cukup");
						}
					} else {
						System.out.println("Nommor rekening salah");
					}
				} else {
					System.out.println("Kode bank tidak dikenal!");
				}
			}

			else {
				System.out.println("Pilihan tidak dikenal!");
			}
		} else {
			System.out.println("PIN salah!");
		}
	}

}
