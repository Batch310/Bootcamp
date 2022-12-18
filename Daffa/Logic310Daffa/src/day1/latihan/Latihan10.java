package day1.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int biayaAdmin, saldo, pin;
		
		biayaAdmin = 7500;
		saldo = 0;
		pin = 123456;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan pin anda : ");
		int masukanPin = input.nextInt();
		
		if (masukanPin == pin) {
			System.out.println("Masukkan uang yang disetor: ");
			int setor = input.nextInt();
			saldo = saldo + setor;
			
			System.out.println("1.Transfer Antar Rekening \n2. Transfer Antar Bank");
			System.out.println("Masukkan pilihan : ");
			int pilih = input.nextInt();
			if (pilih == 1) {
				System.out.println("Masukkan rekening tujuan : ");
				String rekTujuan = input.nextLine();
				if (rekTujuan.length()==10) {
					System.out.println("Masukkan nominal transfer : ");
					int nominalTransfer = input.nextInt();
					if(nominalTransfer < saldo) {
						saldo = saldo - nominalTransfer;
						System.out.println("Transaksi berhasil, saldo anda " + saldo);
					} else {
						System.out.println("Saldo anda tidak cukup");
					}
				} else {
					System.out.println("Nomor rekening salah");
				}
			} else if (pilih == 2) {
				System.out.println("Masukkan kode bank tujuan : ");
				String kodeBank = input.nextLine();
				if (kodeBank == "001") {
					System.out.println("Masukkan rekening tujuan : ");
					String rekTujuan = input.next();
					if (rekTujuan.length()==10) {
						System.out.println("Masukkan nominal transfer : ");
						int nominalTransfer = input.nextInt();
						if(nominalTransfer < (saldo - biayaAdmin)) {
							saldo = (saldo-biayaAdmin) - nominalTransfer;
							System.out.println("Transaksi berhasil, saldo anda " + saldo);
						} else {
							System.out.println("Saldo anda tidak cukup");
						}
					} else {
						System.out.println("Nomor rekening salah");
					}
				} else {
					System.out.println("Kode bank tidak dikenal");
				}
						
				
			} else {
				System.out.println("Pilihan tidak dikenal");
			}
			
		} else {
			System.out.println("PIN yang anda masukkan salah");
			System.exit(0);
		}
		
	}
}