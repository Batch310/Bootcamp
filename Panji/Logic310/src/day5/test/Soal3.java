package day5.test;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int data;
		System.out.print("Input : ");
		data = input.nextInt(); // Input banyak data yang ingin ditampilkan

		int a = 0;

		for (int i = 100; a < data; i++) {

			String b = Integer.toString(i);
			String[] arr2 = b.split("");

			int simpan = 0;

			for (int j = 0; j < arr2.length; j++) {
				Integer c = Integer.valueOf(arr2[j]);
				int hasil = (int) Math.pow(c, 2);
				simpan += hasil;
				if (simpan == 1) {
					System.out.println(i + " adalah Si Angka 1");
					a++;
				} else {

					while (simpan > 9) {
						String d = Integer.toString(simpan);
						String[] arr3 = d.split("");
						simpan = 0;
						for (int k = 0; k < arr3.length; k++) {
							Integer e = Integer.valueOf(arr3[k]);
							int hasil2 = (int) Math.pow(e, 2);
							simpan += hasil2;
						}
						if (simpan == 1) {
							System.out.println(i + " adalah Si Angka 1");
							a++;
						}
					}

				}
				// System.out.println(simpanan);
			}
		}
	}
}
