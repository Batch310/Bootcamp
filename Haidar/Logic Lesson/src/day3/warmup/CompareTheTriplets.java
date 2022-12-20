package day3.warmup;

import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		int[] nilaiAlice = new int[3];
		int[] nilaiBob = new int[3];
//		int[] versus = new int[2];
		int menangAlice = 0;
		int menangBob = 0;
		
		for (int i = 0; i < nilaiAlice.length; i++) {
			System.out.print("Masukkan nilai Alice ke-" + (i+1) + ": ");
			nilaiAlice[i] = masukan.nextInt();
		}
		
		for (int i = 0; i < nilaiBob.length; i++) {
			System.out.print("Masukkan nilai Bob ke-" + (i+1) + ": ");
			nilaiBob[i] = masukan.nextInt();
		}
		
		for (int i = 0; i < nilaiAlice.length; i++) {
			if (nilaiAlice[i] > nilaiBob[i]) {
				menangAlice++;
			} else if (nilaiAlice[i] < nilaiBob[i]) {
				menangBob++;
			}
//			versus[0] = menangAlice;
//			versus[1] = menangBob;
		}
		System.out.print(menangAlice + " " + menangBob);
		
	}
}
