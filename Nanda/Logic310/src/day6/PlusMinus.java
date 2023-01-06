package day6;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan N : ");
		int n = scanner.nextInt();
		
		int[] arrN = new int[n];
		
		//Isi arraynya
		for (int i = 0; i < arrN.length; i++) {
			System.out.print("Masukkan angka ke " + i +" : ");
			arrN[i] = scanner.nextInt();
		}
		
		//Cetak Array
		for (int i = 0; i < arrN.length; i++) {
			System.out.print(arrN[i] + " ");
		}
		
		double positif = 0;
		double negatif = 0;
		double nol = 0;
		
		for (int i = 0; i < arrN.length; i++) {
			if(arrN[i] > 0) {
				positif++;
			}else if(arrN[i]<0) {
				negatif++;
			}else if(arrN[i] == 0) {
				nol++;
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(positif/n);
		System.out.println(negatif/n);
		System.out.println(nol/n);
		
	}
}
