package day3.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan panjang deret : ");
		int n = input.nextInt();
		long[] deret = new long[n];
		long max = 0;
		long min = 0;
		long sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan angka : ");
			long angka = input.nextLong();
			deret[i] = angka;
			sum += angka;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(deret[i] + " \n");
		}
		Arrays.sort(deret);
		max = sum - deret[0];
		min = sum - deret[n - 1];
		System.out.println("\n" + min + " " + max);
	}

}
