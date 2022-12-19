package day1.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		int admin = 7500;
		int PINbenar = 123456;
		
		System.out.print("Masukkan PIN Anda : ");
		int PIN = inputan.nextInt();
		
		if (PIN==PINbenar) {
			System.out.print("Uang yang disetor : ");
			int setor = inputan.nextInt();
			
			System.out.println("Pilihan Transfer : 1. Antar Rekening 2. Antar Bank");
			System.out.print("Pilih : ");
			int pilihan = inputan.nextInt();
			
			switch (pilihan) {
			case 1; 
			
					if (pilihan==1) {
						System.out.println("Transfer Antar Rekening");
						System.out.print("Masukkan Rekening Tujuan : ");
						int rekening1 = inputan.nextInt();
						if (rekening1==)
						System.out.print("Masukkan Nominal Transfer : ");
						int nom1 = inputan.nextInt();
						if (nom1<setor) {
						int sisa1 = setor-nom1;
					}
			}
		} else {
			System.out.println("PIN Salah");
		}
	}

}
