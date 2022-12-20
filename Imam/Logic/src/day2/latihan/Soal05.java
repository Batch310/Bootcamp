package day2.latihan;

import java.util.Scanner;

public class Soal05 {

	// output
    // 1 5 * 9 13 * 17
	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int a = inputan.nextInt();

		int nilaiAwal = 1;

		for (int i = 0; i < a; i++) {

			// i :
			// 0,1,2,3,4,5,6,7,8
			// 0,1,*,3,4,*,6,7,8

			// Rumus Bintang
			// 2, 5, 8, 11, ....(dibagi 3 selalu sisa 2)
			// i % 3 == 2

			if (i % 3 == 2) {
				System.out.print("* ");
			} else {
				System.out.print(nilaiAwal + " ");
				nilaiAwal += 4;
			}
		}
	}

}
