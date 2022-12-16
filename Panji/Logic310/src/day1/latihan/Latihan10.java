package day1.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int biayaAdmin = 7500;
		System.out.print("Masukkan PIN : ");
		int pin = input.nextInt();

		if (pin == 123456) {
			System.out.print("Masukkan jumlah disetor : ");
			int setor = input.nextInt();
			System.out.println("Pilihan Transfer : ");
			System.out.println("1. Antar Rekening");
			System.out.println("2. Antar Bank");
			System.out.print("Pilih :");
			int pilih = input.nextInt();

			switch (pilih) {
			case 1:
				System.out.print("Masukkan PIN : ");
				pin = input.nextInt();
				if (pin == 123456) {
					System.out.println("Transfer Antar Rekening");
					System.out.print("Masukkan Rekening Tujuan :");
					int rekening1 = input.nextInt();
					System.out.print("Masukkan Nominal Transfer :");
					int nominal1 = input.nextInt();

					if (nominal1 < setor) {
						int sisa1 = setor - nominal1;
						System.out.println("Transaksi berhasil, saldo anda saat ini Rp" + sisa1);
					} else if (nominal1 > setor) {
						System.out.println("Saldo Tidak Mencukupi");
					}
				} else {
					System.out.println("PIN salah");
				}
				break;
			case 2:
				System.out.println("Transfer Beda Bank");
				System.out.print("Masukkan Rekenin Tujuan :");
				int rekening2 = input.nextInt();
				System.out.print("Masukkan Nominal Transfer :");
				int nominal2 = input.nextInt();

				int sisa2 = setor - nominal2 - biayaAdmin;
				System.out.println("Transaksi berhasil, saldo anda saat ini Rp" + sisa2);
				break;
			}

		} else {
			System.out.println("PIN salah");
		}
	}

}
