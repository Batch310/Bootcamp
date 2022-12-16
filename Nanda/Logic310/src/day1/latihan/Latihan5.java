package day1.latihan;

import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		//input 10k
		System.out.print("banyaknya uang sepuluh ribuan : ");
		int sepuluhrb = inputan.nextInt();
		
		//inputan 5k
		System.out.print("banyaknya uang lima ribuan : ");
		int limarb = inputan.nextInt();
		
		//inputan 2k
		System.out.print("banyaknya uang dua ribuan : ");
		int duarb = inputan.nextInt();
		
		//output
		int a = sepuluhrb*10000;
		int b = limarb*5000;
		int c = duarb*2000;
		int t = a+b+c;
		System.out.println("Total uang yang dimiliki pedagang adalah " +t);

	}

}
