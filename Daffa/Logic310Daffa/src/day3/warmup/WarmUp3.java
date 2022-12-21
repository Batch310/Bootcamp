package day3.warmup;

import java.util.Scanner;

public class WarmUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		int[] kumpulan = new int[n];
		int jumlah = 0;
		System.out.println("Masukkan angka : ");
		for (int i = 0; i < n; i++) {
			int angka = input.nextInt();
			kumpulan[i] = angka;
			jumlah = jumlah + angka;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(kumpulan[i] + " ");
		}
		System.out.println();
		System.out.println(jumlah);
	}

}