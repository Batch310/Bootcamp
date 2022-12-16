package day1.latihan;

import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Banyaknya uang sepuluh ribuan : ");
		int sepuluh = input.nextInt();
		System.out.print("Banyaknya uang lima ribuan : ");
		int lima = input.nextInt();
		System.out.print("Banyaknya uang dua ribuan : ");
		int dua = input.nextInt();

		int totalUang = (10000 * sepuluh) + (5000 * lima) + (2000 * dua);

		System.out.println("Total uang yang dimiliki pedagang adalah " + totalUang);

	}

}
