package day1.latihan;

import java.util.Scanner;

public class Latihan10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int admin = 7500;
		int pass = 123456;
		System.out.print("Masukkan PIN : ");
		int pin = input.nextInt();

		if (pin == pass) {
			System.out.print("Uang yang disetor : ");
			int setor = input.nextInt();
			System.out.println("Pilihan transfer  : 1. Antar Rekening	2. Antar Bank");
			int pil = input.nextInt();
			if (pil == 1) {
				System.out.print("Masukkan rekening tujuan  : ");
				String rekening = input.next();
				if(rekening.length()==10) {
					System.out.print("Masukkan nominal transfer : ");
					int transfer = input.nextInt();
					if (transfer < setor) {
						int saldo = setor - transfer;
						System.out.println("Transaksi berhasil, saldo anda saat ini Rp. " + saldo + ",-");
					}
					else {
						System.out.println("Saldo tidak cukup");
					}
					
				}
				else {
					System.out.println("Panjang rekening harus 10 digit");
				}
				
			} else if (pil == 2) {
				System.out.print("Masukkan kode bank        : ");
				input.next();
				System.out.print("Masukkan rekening tujuan  : ");
				String rekening = input.next();
				if(rekening.length()==10) {
					System.out.print("Masukkan nominal transfer : ");
					int transfer = input.nextInt();
					if (transfer <= (setor-admin)) {
						int saldo = setor - transfer - admin;
						System.out.println("Transaksi berhasil, saldo anda saat ini Rp. " + saldo + ",-");
					}
					else {
						System.out.println("Saldo tidak cukup");
					}
					
				}
				else {
					System.out.println("Panjang rekening harus 10 digit");
				}
			} else {
				System.out.println("Pilihan Tidak Ada");
			}

		} else {
			System.out.println("PIN Salah");
		}
	}

}
