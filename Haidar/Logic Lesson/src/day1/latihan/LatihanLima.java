package day1.latihan;

import java.util.Scanner;

public class LatihanLima {

	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in); //Inisiasi tipe data Scanner variabel masukan sebagai input dari console
		
		System.out.print("Banyaknya uang sepuluh ribuan:  ");
		int jsepuluh = masukan.nextInt(); //Input banyaknya uang sepuluh ribuan
		
		System.out.print("Banyaknya uang lima ribuan: ");
		int jlima = masukan.nextInt(); //Input banyaknya uang lima ribuan
		
		System.out.print("Banyaknya uang dua ribuan: ");
		int jdua = masukan.nextInt(); //Input banyankya uang dua ribuan
		
		int total = (10000*jsepuluh)+(5000*jlima)+(2000*jdua); //Rumus total uang yang dimiliki
		
		System.out.println("Total uang yang dimiliki pedagang adalah " + total);
		
	}

}
//6m30s