package day3.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah lilin: ");
		int lilin = masukan.nextInt();
		
		int[] arrayLilin = new int[lilin];
		int lilinTertinggi = 0;
		int totalLilin = 0;
		
		for (int i = 0; i < lilin; i++) {
			System.out.print("Masukkan tinggi lilin: ");
			arrayLilin[i] = masukan.nextInt();
		}
		
		for (int i = 0; i < arrayLilin.length; i++) {
			for (int j = 0; j < arrayLilin.length; j++) {
				if (arrayLilin[j] > lilinTertinggi) { //1 > 0 4 > 1
					lilinTertinggi = arrayLilin[j]; // 0 >> 1 1 >> 4
				}
			}
			if (arrayLilin[i] == lilinTertinggi) {
				totalLilin++;
			}
		}
		System.out.println(totalLilin);		
	
	}
}
