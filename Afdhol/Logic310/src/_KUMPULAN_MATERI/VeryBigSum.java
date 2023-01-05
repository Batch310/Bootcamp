package _KUMPULAN_MATERI;

import java.util.Scanner;

public class VeryBigSum {

	public static void main(String[] args) {

		//Menambahkan setiap array dengan tipe long
		
		Scanner scan = new Scanner(System.in);

		System.out.println("n: ");

		int n = scan.nextInt();
		long[] array = new long[n];

		long jumlah = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("input: ");
			array[i] = scan.nextLong();
			jumlah += array[i];
		}
		System.out.println();
		System.out.println(jumlah);
	}
}
