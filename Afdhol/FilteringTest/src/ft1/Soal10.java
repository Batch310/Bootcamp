package ft1;

import java.util.Scanner;

public class Soal10 {

	// deret kelipatan 3-1
	// deret kelipatan 4/2
	// indek dijumlahkan
	// index dari 0

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int n = scan.nextInt();

		int[] deret3 = new int[n];
		int[] deret4 = new int[n];
		int[] deretHasil = new int[n];

		int nilaiAwal = 3;
//kelipatan 4 bisa dibagi 3 dari output
		for (int i = 0; i < deret3.length; i++) {
			deret3[i] = nilaiAwal - 1;
			nilaiAwal = nilaiAwal + 3;
			if (i == n - 1) {
				System.out.print(deret3[i]);
			} else {
				System.out.print(deret3[i] + ",");
			}
		}
		System.out.println();

		int nilaiAwal2 = 4;
		for (int i = 0; i < deret4.length; i++) {
			deret4[i] = nilaiAwal2 / 2;
			nilaiAwal2 = nilaiAwal2 + 4;
			if (i == n - 1) {
				System.out.print(deret4[i]);
			} else {
				System.out.print(deret4[i] + ",");
			}
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < deretHasil.length; i++) {
			deretHasil[i] = deret3[i] + deret4[i];
			if (i == n-1) {
				System.out.print(deretHasil[i]);
			}else if (i%3==0&&i+4==0) {
				
			}		
			else {
				System.out.print(deretHasil[i]+",");
			}
		}
		
		
		System.out.println();
		
		;
		for (int i = 0; i < deretHasil[i]; i+=4) {
			deretHasil[i] = deret4[i]+deret3[i];
			if (deretHasil[i]%3==0) {
				System.out.println(deretHasil[i]+" ");
			}
				
			}
		}
		
	
//		for (int i = 0; i < deretHasil.length; i++) {
//			deretHasil[i] = deret3[i] + deret4[i];
//			
//			
//		
//		}
	}

