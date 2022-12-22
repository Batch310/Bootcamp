package day4.warmup;

import java.util.Iterator;
import java.util.Scanner;

public class MiniMaxSUM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] deret = new int[5];
		
		for (int i = 0; i < deret.length; i++) {
			System.out.print("masukkan angka :  ");
			deret[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println();
		
		//cetak
		for (int i = 0; i < deret.length; i++) {
			System.out.print(deret[i] + " ");
		}
		//cara1
		int temp = 0;
		int min = 0;
		int max = 0;
			
		for (int i = 0; i < deret.length; i++) {
			temp = 0;
			for (int j = 0; j < deret.length; j++) {
				if( i != j) {
					temp = temp + deret[j];
			}
		}
		if( min == 0) {
			min = temp;
		}
		if (temp < min ) {
			min = temp;
		}
		if (temp > max) {
			max = temp;
		}
		}
		System.out.println();
		System.out.println(min);
		System.out.println(max);
		}	
}