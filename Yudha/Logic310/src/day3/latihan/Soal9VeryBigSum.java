package day3.latihan;

import java.util.Scanner;

public class Soal9VeryBigSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		long[] deret= new long[n];
		long sum=0;
		System.out.println("Masukkan angka : ");
		for(int i=0; i<n;i++) {
			long angka = input.nextInt();
			deret[i] = angka;
			sum = sum + angka;
		}
		for(int i=0; i<n;i++) {
			System.out.print(deret[i]+" ");
		}
		System.out.println();
		System.out.println(sum);

	}

}
