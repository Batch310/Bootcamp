package day1.latihan;

import java.util.Scanner;

public class Latihan5 {
	
	public static void main(String[] args) {
		
		Scanner inputan = new Scanner(System.in);
		System.out.print("banyaknya uang sepuluh ribuan:");
		int a = inputan.nextInt();
		
		System.out.print("banyaknya uang lima ribuan:");
		int b = inputan.nextInt();
		
		System.out.print("banyaknya uang dua ribuan :");
		int c = inputan.nextInt();
		
		int total = a*10000 + b*5000 + c*2000 ;
		
//		System.out.println("banyaknya uang sepuluh ribuan:" + a);
//		System.out.println("banyaknya uang lima ribuan   :" + b);
//		System.out.println("banyaknya uang dua ribuan    :" + c);
		System.out.println("");
		System.out.println("Total uang yang dimiliki pedagang adalah " + total);
		
		
		
		
		
	}

}
