package day5.latihan;

import java.util.Scanner;

public class Soal10ke2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Inputkan Saldo : Rp.");
		int saldo = input.nextInt();
		int kopi = 18000,diskon = 0;
		int jumlahKopi = 0,totalDiskon=0,totalHarga = 0;
		int maxCB = 30000;
		int sisaDiskon=0;
		int maxDiskon = 100000;
		int limitJumlahDiskonKopi = 0;
		int kopiDiskon = 0;
		int cashBack = 0;
		int minOrder = 40000;
		if(saldo>=27000) {
			diskon = kopi*50/100;
			kopiDiskon = kopi - diskon;
			jumlahKopi = saldo / diskon;
			totalDiskon = jumlahKopi * diskon;
			totalHarga = kopiDiskon*jumlahKopi;
			saldo = saldo - totalHarga;
			if(totalDiskon>maxDiskon) {
				jumlahKopi=1;
				totalDiskon=0;
				saldo = saldo + totalHarga;
				while(totalDiskon<=maxDiskon) {
					totalDiskon = diskon*jumlahKopi;
					jumlahKopi++;
//					System.out.println(jumlahKopi);
				}
			}
		}
		else {
//			jumlahKopi = saldo/kopi;
//			totalHarga = jumlahKopi* kopi;
//			saldo = saldo - totalHarga;
			System.out.println("Tidak jadi beli");
		}
		if(totalHarga/10>maxCB) {
			cashBack = maxCB;
		}
		else {
			cashBack = totalHarga/10;
		}
		saldo = saldo + cashBack;
		
		System.out.println("Jumlah cup = " + jumlahKopi + "; Saldo akhir = Rp." + saldo); 

	}

}
