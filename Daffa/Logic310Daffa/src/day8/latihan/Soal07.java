package day8.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random acak = new Random();
				
		System.out.print("Masukkan n: ");
		int n = input.nextInt();
		
		System.out.print("Masukkan m: ");
		int m = input.nextInt();
		
		System.out.print("Masukkan keranjang (1 - 3) yang dibawa ke pasar: ");
		int keranjang = input.nextInt();
				
		int[] isiKeranjang = new int[3];
		int found = 0;
		int jumlahBuah = 0;
		
		isiKeranjang[acak.nextInt(3)] = n;
		
		for (int i = acak.nextInt(3); found < 1; i = acak.nextInt(3)) {
			if (isiKeranjang[i] == 0 || !(isiKeranjang[i] == n)) {
				isiKeranjang[i] = m;
				found++;
			}
		}
		
		if (keranjang == 1) {
			jumlahBuah = isiKeranjang[1] + isiKeranjang[2];
			if (isiKeranjang[1] == 0 ) {
				System.out.println("Jumlah Buah -> " + "kosong" + " + " + isiKeranjang[2] + " = " + jumlahBuah);
			} else if (isiKeranjang[2] == 0 ) {
				System.out.println("Jumlah Buah -> " + isiKeranjang[1] + " + " + "kosong" + " = " + jumlahBuah);
			} else {
			System.out.println("Jumlah Buah -> " + isiKeranjang[1] + " + " + isiKeranjang[2] + " = " + jumlahBuah);
			}
		} else if (keranjang == 2) {
			jumlahBuah = isiKeranjang[0] + isiKeranjang[2];
			if (isiKeranjang[0] == 0 ) {
				System.out.println("Jumlah Buah -> " + "kosong" + " + " + isiKeranjang[2] + " = " + jumlahBuah);
			} else if (isiKeranjang[2] == 0 ) {
				System.out.println("Jumlah Buah -> " + isiKeranjang[0] + " + " + "kosong" + " = " + jumlahBuah);
			} else {
			System.out.println("Jumlah Buah -> " + isiKeranjang[0] + " + " + isiKeranjang[2] + " = " + jumlahBuah);
			}
		} else if (keranjang == 3) {
			jumlahBuah = isiKeranjang[0] + isiKeranjang[1];
			if (isiKeranjang[0] == 0 ) {
				System.out.println("Jumlah Buah -> " + "kosong" + " + " + isiKeranjang[1] + " = " + jumlahBuah);
			} else if (isiKeranjang[1] == 0 ) {
				System.out.println("Jumlah Buah -> " + isiKeranjang[0] + " + " + "kosong" + " = " + jumlahBuah);
			} else {
			System.out.println("Jumlah Buah -> " + isiKeranjang[0] + " + " + isiKeranjang[1] + " = " + jumlahBuah);	
			}
		} else {
			System.out.println("Keranjang tidak ada!");
		}
		input.close();
	}

}
