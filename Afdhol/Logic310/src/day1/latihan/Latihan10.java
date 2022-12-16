package day1.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pin=123456, uang, pilihan, kode_bank, rekening, uang_setor = 0;

		System.out.print("Masukkan PIN : ");
		pin = input.nextInt();
		if (pin == 123456) {
		
		}else {
			System.out.println("PIN salah, Ulangi Kembali");
			System.exit(0);
		}

		System.out.print("Uang disetor: ");
		uang = input.nextInt();

		System.out.println("Pilihan Transfer : 1. Antar Rekening \t 2.Antar Bank");
		pilihan = input.nextInt();


		if (pilihan == 1) {
			System.out.println("Masukkan Rekening Tujuan : ");
			input.nextInt();

			System.out.println("Uang disetor: " + uang);

			System.out.println("Transaksi berhasil, saldo anda selama ini : " + uang);

		} else if (pilihan == 2) {
			System.out.println("Masukkan kode bank: ");
			//kode_bank = input.nextInt();

			System.out.print("Masukkan Rekening Tujuan");
	

			
			input.nextInt();

			System.out.println("Uang disetor: " + uang);
			

			System.out.println("Transaksi anda berhasil, saldo anda saat ini: " + (uang - 7500));
			
		} else {
			
			System.out.println("pilihan anda salah");
		}

	}

}
