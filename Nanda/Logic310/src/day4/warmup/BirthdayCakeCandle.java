package day4.warmup;

import java.util.Scanner;

public class BirthdayCakeCandle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = scanner.nextInt();
		
		int[] deret = new int[n];
		
		for (int i = 0; i < deret.length; i++) {
			System.out.print("Masukkan angka ke " +(i+1)+ " : ");
			deret[i] = scanner.nextInt();
		}
		System.out.println();
		//menampilkan array
		for (int i = 0; i < deret.length; i++) {
			System.out.print(deret[i]+ " ");
		}
		
		System.out.println();
		
		// nilai max
		int max = 0;
		int maxsum = 0;
		for (int i = 0; i < deret.length; i++) {
			if (deret[i] > max) {
				max = deret[i];
				maxsum = 0;
			}
			if (deret[i] == max) {
				maxsum++;
			}
		}
		System.out.println("Jumlah Max : " +maxsum);
		
		System.out.println();
		
//		//Jumlah nilai max
//		for (int i = 0; i < deret.length; i++) {
//			if (max > )
		}
		
	}

