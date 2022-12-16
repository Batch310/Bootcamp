package day1.latihan;

import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sepuluh_ribu, lima_ribu, dua_ribu, total;
		
		System.out.println("Banyaknya uang sepuluh ribuan: ");
		sepuluh_ribu = input.nextInt()*10000;
		
		System.out.println("Banyaknya uang lima ribuan : ");
		lima_ribu = input.nextInt()*5000;
		
		System.out.println("Banyaknya uang dua ribuan : ");
		dua_ribu = input.nextInt()*2000;
		
		total = sepuluh_ribu+lima_ribu+dua_ribu;
		
		System.out.println("Total uang dimiliki pedagang adalah : "+total);
	}

}
