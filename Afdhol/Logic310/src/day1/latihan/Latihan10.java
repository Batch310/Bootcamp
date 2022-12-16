package day1.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pin=123456, uang_saldo, pilihan, kode_bank, uang_setor = 0;
		String rekening;

		System.out.print("Masukkan PIN : ");
		pin = input.nextInt();
		if (pin == 123456) {
		
		}else {
			System.out.println("PIN salah, Ulangi Kembali");
			System.exit(0);
		}

		System.out.print("Uang disetor: ");
		uang_saldo = input.nextInt();

		System.out.println("Pilihan Transfer : 1. Antar Rekening \t 2.Antar Bank");
		pilihan = input.nextInt();


		if (pilihan == 1) {
			System.out.println("Masukkan Rekening Tujuan : ");
			rekening = input.next();
			if (rekening.length()==10) {
				System.out.println("Uang disetor: " );
				uang_setor = input.nextInt();

				//System.out.println("Transaksi berhasil, saldo anda selama ini : " + (uang_saldo-uang_setor));
				if (uang_saldo-uang_setor<0) {
					System.out.println("saldo ga cukup");
				}else if (uang_saldo>0) {
					System.out.println("Transaksi berhasil, saldo anda selama ini : " + (uang_saldo-uang_setor));
				}
			
			}else {
				System.out.println("saldo tidak cukup");
			}

			

		} else if (pilihan == 2) {
			System.out.print("Masukkan kode bank: ");
			kode_bank = input.nextInt();

			System.out.print("Masukkan Rekening Tujuan: ");
			rekening = input.next();
			if (rekening.length()==10) {
				System.out.println("Uang disetor: " );
				uang_setor = input.nextInt();
				
				if ((uang_saldo-uang_setor-7500)<0) {
					System.out.println("saldo ga cukup");

				}else if (uang_saldo>0) {
						System.out.println("Transaksi anda berhasil, saldo anda saat ini: " + (uang_saldo - 7500));
					}
				
			}else {
				System.out.println("Panjang Rekening harus 10");
			}

			
			input.nextInt();

			
			
		} else {
			
			System.out.println("pilihan anda salah");
		}

	}

}
