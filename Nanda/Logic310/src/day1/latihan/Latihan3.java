package day1.latihan;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
				
		//input panjang
		System.out.print("Masukkan Panjang : ");
		int p = inputan.nextInt();
		
		//input lebar
		System.out.print("Masukka Lebar : ");
		int l = inputan.nextInt();
		
		//input tinggi
		System.out.print("Masukkan Tinggi : ");
		int t = inputan.nextInt();
		
		System.out.print("Volume Balok adalah : " + p*l*t);

	}

}
