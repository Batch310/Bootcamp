package day1.latihan;

import java.util.Scanner;

public class LatihanLima {

	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Banyaknya uang sepuluh ribuan:  ");
		int jsepuluh = masukan.nextInt();
		
		System.out.print("Banyaknya uang lima ribuan: ");
		int jlima = masukan.nextInt();
		
		System.out.print("Banyaknya uang dua ribuan: ");
		int jdua = masukan.nextInt();
		
		int total = (10000*jsepuluh)+(5000*jlima)+(2000*jdua);
		
		System.out.println("Total uang yang dimiliki pedagang adalah " + total);
		
	}

}
//6m30s