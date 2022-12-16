package day1.latihan;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int panjang, lebar, tinggi, hasil;
		
		
		
		System.out.println("Masukkan panjang : ");
		panjang = input.nextInt();
		
		System.out.println("Masukkan lebar : ");
		lebar = input.nextInt();
		
		System.out.println("Masukkan tinggi");
		tinggi = input.nextInt();
		
		hasil = panjang*lebar*tinggi;
		
		System.out.println("Volume balok adalah : "+hasil);

	}

}
