package day1.latihan;

import java.util.Scanner;

public class Day1Latihan3 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Masukan panjang : ");
		int panjang = inputan.nextInt();
		System.out.print("Masukan lebar : ");
		int lebar = inputan.nextInt();
		System.out.print("Masukan tinggi : ");
		int tinggi = inputan.nextInt();
		
		int vol = panjang * lebar * tinggi;
		
		System.out.println();
		System.out.println("Volume balok adalah :" +  panjang + " x " + lebar + " x " + tinggi +" = "+ vol );
		
	}

}
