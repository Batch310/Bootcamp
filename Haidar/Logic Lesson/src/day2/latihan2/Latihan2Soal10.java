package day2.latihan2;

import java.util.Scanner;

public class Latihan2Soal10 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt();
		
		System.out.print("Masukkan rasio: ");
		int rasio = masukan.nextInt();
		
		int angka = 0;
		int angka1 = 0;
		int[][] deretAngka = new int[deret][3];
		
		for (int i = 0; i < deretAngka.length; i++) {
			deretAngka[i][0] = i;
			System.out.print(deretAngka[i][0] + " ");
		}
		
		System.out.println();
		
		for (int j = 0; j < deretAngka.length; j++) {
			deretAngka[j][1] = angka;
			System.out.print(deretAngka[j][1] + " ");
			angka += rasio;
		}
		
		System.out.println();
		
		for (int k = 0; k < deretAngka.length; k++) {
			deretAngka[k][2] = angka1;
			System.out.print(deretAngka[k][2] + " ");
			angka1 = angka1 + rasio + 1;
		}
		
	}
}
