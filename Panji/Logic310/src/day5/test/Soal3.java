package day5.test;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input : ");
		int data = input.nextInt(); // Input banyak data yang ingin ditampilkan

		int a = 0;

		for (int i = 100; a < data; i++) {

			String b = Integer.toString(i);
			String[] arr2 = b.split("");
			int simpan = 0;

			for (int j = 0; j < arr2.length; j++) {
				int c = Integer.parseInt(arr2[j]);

				int hasil = (int) Math.pow(c, 2);
				simpan += hasil;
			}
			if (simpan == 1) {
				System.out.println(i + " adalah Si Angka 1");
				a++;
			} else {
				while (simpan > 9) {
					String d = Integer.toString(simpan);
					String[] arr3 = d.split("");
					simpan = 0;
					for (int k = 0; k < arr3.length; k++) {
						int c = Integer.parseInt(arr3[k]);
						int hasil = (int) Math.pow(c, 2);
						simpan += hasil;
					}
					if (simpan == 1) {
						System.out.println(i + " adalah Si Angka 1");
						a++;
					}
				}

			}
		}
	}
}
