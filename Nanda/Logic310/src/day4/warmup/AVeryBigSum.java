package day4.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = scanner.nextInt();
		
		long a = 0;
		long b = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan angka : ");
			a = scanner.nextLong();
			b += a;
		}
		System.out.print("Hasil = " +b);
		}		
	}