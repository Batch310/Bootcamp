package day1.latihan;

import java.util.Scanner;

public class Latihan3 {
	
	public static void main(String[] args) {
		
		Scanner inputan = new Scanner(System.in);
		System.out.print("Masukkan panjang :");
		int p = inputan.nextInt();
		
		System.out.print("Masukkan lebar:");
		int l = inputan.nextInt();
		
		System.out.print("Masukkan tinggi:");
		int t = inputan.nextInt();
	
		int total = p*l*t;
			
			
//		System.out.println("Masukkan panjang:"+p);
//		System.out.println("Masukkan lebar:"+l);
//		System.out.println("Masukkan tinggi:"+t);
		System.out.println("");
		System.out.println("Volume balok adalah : " + p + "x" + l + "x" + t + "= " + total);
		
		
		
		
		
	}
	

}
