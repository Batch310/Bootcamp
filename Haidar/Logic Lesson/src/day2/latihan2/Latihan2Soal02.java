package day2.latihan2;

import java.util.Scanner;

public class Latihan2Soal02 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt();
		
		System.out.print("Masukkan rasio: ");
		int rasio = masukan.nextInt();
		
		int angka = 1;
		int[][] deretAngka = new int[deret][2];
		int kelipatan = 1;
		
		for (int i = 0; i < deretAngka.length; i++) {
			deretAngka[i][0] = i;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int j = 0; j < deretAngka.length; j++) {
			deretAngka[j][1] = angka;
			if (j == (3*kelipatan)-1) {
				System.out.print(angka*-1 + " ");
				kelipatan++;
			} else {
				System.out.print(angka + " ");
			}
			angka *= rasio;
		}
		
	}
}
