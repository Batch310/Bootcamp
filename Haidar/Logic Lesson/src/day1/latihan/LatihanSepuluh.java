 package day1.latihan;

import java.util.Scanner;

public class LatihanSepuluh {

	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan PIN: ");
		int pin = masukan.nextInt();
		
		System.out.print("Uang yang disetor: ");
		long uang = masukan.nextLong();
		
		System.out.println("Pilihan transfer: 1. Antar Rekening    2. Antar Bank" );
		int tf = masukan.nextInt();
		
		if (tf == 1) {
			System.out.print("Masukkan rekening tujuan: ");
			long rekTujuan = masukan.nextLong();
			
			System.out.print("Masukkan nominal transfer: ");
			long nominal = masukan.nextLong();
			
			System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + nominal + ",-");
		} else if (tf == 2) {
			System.out.print("Masukkan kode bank: ");
			int kodeBank = masukan.nextInt();
			
			System.out.print("Masukkan rekening tujuan: ");
			long rekTujuan = masukan.nextLong();
			
			System.out.print("Masukkan nominal transfer: ");
			long nominal = masukan.nextLong();
			
			System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + nominal + ",-");
		} else {
			System.out.println("Pilihan transfer tidak valid");
		}

	}

}
//12m15s