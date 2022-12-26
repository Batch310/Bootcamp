package day5.latihanFT;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan PIN: ");
		int pin = input.nextInt();
		
		while (pin != 123456) {
			System.out.println("PIN salah");
			System.out.print("Masukkan PIN: ");
			pin = input.nextInt();
		}
		
		System.out.print("Uang yang disetor: ");
		int uang = input.nextInt();
			
		System.out.println("Pilihan transfer: 1. Antar Rekening 2. Antar Bank");
		int transfer = input.nextInt();
			
		if (transfer == 1) {
			System.out.print("Masukkan rekening tujuan: ");
			String rekeningtujuan = input.next();
				
			while (rekeningtujuan.length() < 10 || rekeningtujuan.length() > 10) {
				System.out.println("Panjang rekening harus 10 digit!");
				System.out.print("Masukkan rekening tujuan: ");
				rekeningtujuan = input.next();
			} 
			System.out.print("Masukkan nominal transfer: ");
			int nominal = input.nextInt();
					
			int saldo = (uang - nominal);
				
			while (saldo <= -1) {
				System.out.println("Saldo tidak mencukupi");
				System.out.println("Masukkan nominal transfer: ");
				nominal = input.nextInt();
					
				saldo = (uang - nominal);
			}
			System.out.println("Transaksi berhasil, saldo anda saat ini " + saldo);
		} else if (transfer == 2) {
			int Admin = 7500;
			System.out.print("Masukkan kode bank: ");
			int kodeBank = input.nextInt();
				
			System.out.print("Masukkan rekening tujuan: ");
			String rekeningtujuan = input.next();
				
			while (rekeningtujuan.length() < 10 || rekeningtujuan.length() > 10) {
				System.out.println("Panjang rekening harus 10 digit!");
				System.out.print("Masukkan rekening tujuan: ");
				rekeningtujuan = input.next();
			}
			System.out.print("Masukkan nominal transfer: ");
			int nominal = input.nextInt();
				
			int totalTransfer = (nominal + Admin);
				
			int saldo = (uang - totalTransfer);
			
			while (saldo < 0) {
				System.out.println("Saldo tidak mencukupi");
				System.out.print("Masukkan nominal transfer: ");
				nominal = input.nextInt();
				totalTransfer = (nominal+Admin);
				saldo = (uang - totalTransfer);
			}
			System.out.println("Transaksi berhasil, saldo anda saat ini " + saldo);
		}
	}
}
