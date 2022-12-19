package day2.latihan2;

import java.util.Scanner;

public class Latihan2Soal04 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt();
		
		System.out.print("Masukkan rasio: ");
		int rasio = masukan.nextInt();
		
		int angka = 1;
		int angka5 = 5;
		int[][] deretAngka = new int[deret][2];
		
		for (int i = 0; i < deretAngka.length; i++) {
			deretAngka[i][0] = i;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int j = 0; j < deretAngka.length; j++) {
			if (j%2 == 0) {
				deretAngka[j][1] = angka;
				System.out.print(angka + " ");
				angka++;
			} else {
				deretAngka[j][1] = angka5;
				System.out.print(angka5 + " ");
				angka5 += 5;
			}
		}
	}
}
