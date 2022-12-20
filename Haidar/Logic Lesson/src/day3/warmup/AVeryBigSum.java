package day3.warmup;

import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya angka: ");
		int input = masukan.nextInt();
		
		long sum = 0;
		
		for (int i = 0; i < input; i++) {
			System.out.print("Masukkan angka besar: ");
			long angka = masukan.nextLong();
			sum += angka;
		}		
		System.out.println(sum);
		
	}
}
