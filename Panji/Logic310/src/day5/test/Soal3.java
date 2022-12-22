package day5.test;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int data;
//		System.out.print("Input : ");
//		data = input.nextInt(); // Input banyak data yang ingin ditampilkan

		int a = 109;

		int max = 0, simpanan = 0;

		String b = Integer.toString(a);
		String[] arr2 = b.split("");

		for (int j = 0; j < arr2.length; j++) {
			Integer c = Integer.valueOf(arr2[j]);
			int hasil = (int) Math.pow(c, 2);
			simpanan += hasil;
			while (simpanan > 9) {
				String d = Integer.toString(simpanan);
				String[] arr3 = d.split("");
				for (int i = 0; i < arr3.length; i++) {
					Integer e = Integer.valueOf(arr3[i]);
					int hasil2 = (int) Math.pow(e, 2);
					simpanan += hasil2;

				}
				simpanan++;
			}

		}
		System.out.println(simpanan);
	}
}
