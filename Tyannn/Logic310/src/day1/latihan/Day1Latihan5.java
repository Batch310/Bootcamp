package day1.latihan;

import java.util.Scanner;

public class Day1Latihan5 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("banyaknya uang sepuluh ribuan : ");
		int uang1 = inputan.nextInt();
		System.out.print("banyaknya uang lima ribuan : ");
		int uang2 = inputan.nextInt();
		System.out.print("banyaknya uang dua ribuan : ");
		int uang3 = inputan.nextInt();
		
		uang1 = uang1*10000;
		uang2 = uang2*5000;
		uang3 = uang3*2000;
		
		int total = uang1 + uang2 + uang3;
		
		System.out.println();
		System.out.print("Total uang yang dimilik pedagang adalah " + total);

	}

}
