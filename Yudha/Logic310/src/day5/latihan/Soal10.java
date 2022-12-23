package day5.latihan;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Inputkan Saldo : Rp.");
		int saldo = input.nextInt();
		int kopi = 18000,diskon = 0;
		int jumlahKopi = 0,totalDiskon=0,totalHarga = 0;
		int maxCB = 100000;
		int maxSaldo = 100/50 *maxCB; 
		System.out.println(kopi);
		if(saldo>=40000) {
			diskon = kopi*50/100;
			kopi -=diskon;
			jumlahKopi = saldo / diskon;
			totalDiskon = jumlahKopi * diskon;
			if(totalDiskon>100000) {
				totalDiskon = 100000;
			}
			totalHarga = kopi * jumlahKopi;
			
			System.out.println(diskon);
			System.out.println(kopi);
			System.out.println(jumlahKopi);
			System.out.println(totalDiskon);
			System.out.println(totalHarga);
			
		}
	}

}
