package day1.latihan;

import java.util.Scanner;

public class LatihanTiga {

	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in); //Inisiasi tipe data Scanner variabel masukan sebagai input dari console
		
		System.out.print("Masukkan panjang: ");
		float p = masukan.nextInt(); //Input panjang
		
		System.out.print("Masukkan lebar: ");
		float l = masukan.nextInt(); //Input lebar
		
		System.out.print("Masukkan tinggi: ");
		float t = masukan.nextInt(); //Input tinggi
		
		float v = p*l*t; //Rumus Volume
		
		System.out.println("Volume balok adalah " + p + " x " + l + " x " + t + " = " + v);	

	}

}
//5m