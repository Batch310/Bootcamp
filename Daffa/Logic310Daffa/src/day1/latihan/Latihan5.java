package day1.latihan;

import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("banyaknya uang sepuluh ribuan :");
		int sepuluh = input.nextInt();

		System.out.println("banyaknya uang lima ribuan :");
		int lima = input.nextInt();

		System.out.println("banyaknya uang dua ribuan :");
		int dua = input.nextInt();

		int jumlah = ((sepuluh * 10000) + (lima * 5000) + (dua * 2000));
		System.out.println("Total uang yang dimiliki pedagang adalah " + jumlah

		);
	}
}