package day2.latihan2;

import java.util.Scanner;

public class Latihan2Soal03 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt();
		
		System.out.print("Masukkan angka = ");
		int angka = masukan.nextInt();
		
//		int angka = 3;
		int[][] deretAngka = new int[deret][2];
		
		for (int i = 0; i < deretAngka.length; i++) {
			deretAngka[i][0] = i;
			System.out.print(deretAngka[i][0] + " ");
		}
		
		System.out.println();
		
		for (int j = 0; j < deretAngka.length; j++) {
			deretAngka[j][1] = angka;
			System.out.print(deretAngka[j][1] + " ");
			if (deret%2 == 0) {
				if (j < (deret/2)-1) {
					angka += angka;
				} else if(j == (deret/2)-1) {
					angka = angka;
				} else {
					angka /= 2;
				}
			} else {
				if (j < deret/2) {
					angka += angka;
				} else {
					angka /= 2;
				}
			}
			
			
		}
	}
}
