package day1.latihan;

import java.util.Scanner;

public class LatihanTiga {

	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan panjang: ");
		float p = masukan.nextInt();
		
		System.out.print("Masukkan lebar: ");
		float l = masukan.nextInt();
		
		System.out.print("Masukkan tinggi: ");
		float t = masukan.nextInt();
		
		float v = p*l*t; 
		
		System.out.println("Volume balok adalah " + p + " x " + l + " x " + t + " = " + v);	

	}

}
//5m