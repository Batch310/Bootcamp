package day2.latihan2;

import java.util.Scanner;

public class Latihan2Soal08 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya deret: ");
		int deret = masukan.nextInt();
		
		int[][] deretAngka = new int[deret][3];
		
		for (int i = 0; i < deretAngka.length; i++) {
			deretAngka[i][0] = i;
			System.out.print(deretAngka[i][0] + " ");
		}
		
		System.out.println();
		
		for (int j = 0; j < deretAngka.length; j++) {
			deretAngka[j][1] = j;
			System.out.print((deretAngka[j][1]*2) + " ");
		}
		
		System.out.println();
		
		for (int k = 0; k < deretAngka.length; k++) {
			deretAngka[k][2] = k;
			System.out.print((deretAngka[k][2]*3) + " ");
		}
		
	}
}
