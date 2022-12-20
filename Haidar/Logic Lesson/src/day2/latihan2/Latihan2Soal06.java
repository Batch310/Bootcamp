package day2.latihan2;

import java.util.Scanner;

public class Latihan2Soal06 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan angka: ");
		int angka = masukan.nextInt();
		
		int angka1 = 1;
		int angka2 = 1;
		int[][] deretAngka = new int[angka][3];
		
		for (int i = 0; i < deretAngka.length; i++) {
			deretAngka[i][0] = i;
			System.out.print(deretAngka[i][0] + " ");
		}
		
		System.out.println();
		
		for (int j = 0; j < deretAngka.length; j++) {
			deretAngka[j][1] = angka1;
			System.out.print(deretAngka[j][1] + " ");
			angka1 *= angka;
		}
		
		System.out.println();
		
		for (int k = 0; k < deretAngka.length; k++) {
			deretAngka[k][2] = angka2;
			System.out.print((deretAngka[k][2] + k) + " ");
			angka2 = (angka2*angka);
		}
	}
}
