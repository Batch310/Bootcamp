package day1.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//restart:
		System.out.print("Masukkan PIN : ");
		int pin = input.nextInt();
		
		if(pin == 123456) {
			System.out.println("Masukkan jumlah disetor : ");
			int setor = input.nextInt();
			System.out.println("Pilihan Transfer : ");
			System.out.println("1. Antar Rekening");
			System.out.println("2. Antar Bank");
			System.out.println("Pilih :");
			int pilih = input.nextInt();
			
			switch (pilih) {
			case 1:
				System.out.println("Transfer Antar Rekening");
				break;
			case 2:
				System.out.println("Transfer Beda Bank");
				break;
			default:
				
				break;
			}
			
		}else {
			System.out.println("PIN salah");
		}
	}

}
