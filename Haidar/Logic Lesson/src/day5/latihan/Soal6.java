package day5.latihan;

import java.util.Scanner;

public class Soal6 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan PIN: ");
		int pin = masukan.nextInt();
		
		while (pin != 123456) {
			System.out.println("PIN salah");
			System.out.print("Masukkan PIN: ");
			pin = masukan.nextInt();
		}
		
		System.out.print("Uang yang disetor: ");
		int uang = masukan.nextInt();
			
		System.out.println("Pilihan transfer: 1. Antar Rekening 2. Antar Bank");
		int tf = masukan.nextInt();
			
		if (tf == 1) {
			System.out.print("Masukkan rekening tujuan: ");
			String rekTujuan = masukan.next();
				
			while (rekTujuan.length() < 10 || rekTujuan.length() > 10) {
				System.out.println("Panjang rekening harus 10 digit!");
				System.out.print("Masukkan rekening tujuan: ");
				rekTujuan = masukan.next();
			} 
			System.out.print("Masukkan nominal transfer: ");
			int nominal = masukan.nextInt();
					
			int saldo = (uang - nominal);
				
			while (saldo <= -1) {
				System.out.println("Saldo tidak mencukupi");
				System.out.println("Masukkan nominal transfer: ");
				nominal = masukan.nextInt();
					
				saldo = (uang - nominal);
			}
			System.out.println("Transaksi berhasil, saldo anda saat ini " + saldo);
		} else if (tf == 2) {
			int beaAdmin = 7500;
			System.out.print("Masukkan kode bank: ");
			int kodeBank = masukan.nextInt();
				
			System.out.print("Masukkan rekening tujuan: ");
			String rekTujuan = masukan.next();
				
			while (rekTujuan.length() < 10 || rekTujuan.length() > 10) {
				System.out.println("Panjang rekening harus 10 digit!");
				System.out.print("Masukkan rekening tujuan: ");
				rekTujuan = masukan.next();
			}
			System.out.print("Masukkan nominal transfer: ");
			int nominal = masukan.nextInt();
				
			int totalTransfer = (nominal + beaAdmin);
				
			int saldo = (uang - totalTransfer);
			
			while (saldo < 0) {
				System.out.println("Saldo tidak mencukupi");
				System.out.print("Masukkan nominal transfer: ");
				nominal = masukan.nextInt();
				totalTransfer = (nominal+beaAdmin);
				saldo = (uang - totalTransfer);
			}
			System.out.println("Transaksi berhasil, saldo anda saat ini " + saldo);
		}
	}
}
