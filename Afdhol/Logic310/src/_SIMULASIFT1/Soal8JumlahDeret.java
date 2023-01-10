package _SIMULASIFT1;

import java.util.Scanner;

public class Soal8JumlahDeret {

	// deret dengna penjumlahan kelipatan 3 dikurang 1
	// deret dengan bilangan kelipatan 4 dibagi 2
	// soal = indeks ganjil ditambah ganjil, index genap ditambah genap

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int n = scan.nextInt();

		int[] deret3 = new int[n];
		int[] deret4 = new int[n];
		int[] deretHasil = new int[n];

		// deret 3 dikurangi 3
		int nAwal = 3;
		for (int i = 0; i < deret3.length; i++) {
			deret3[i] = nAwal - 1;
			nAwal = nAwal + 3;
			if (i == n - 1) {
				System.out.print(deret3[i]);
			} else {
				System.out.print(deret3[i] + ",");
			}
		}
		System.out.println();
		
		// deret 4 dibagi 2
		int nAwal2 = 4;
		for (int i = 0; i < deret4.length; i++) {
			deret4[i] = nAwal2 / 2;
			nAwal2 = nAwal2 + 4;
			if (i == n-1) {
				System.out.print(deret4[i]);
			}else {
				System.out.print(deret4[i]+",");
			}
		}
		System.out.println();
		System.out.println();
		
		//Deret hasil penjumlahan
		for (int i = 0; i < deretHasil.length; i++) {
			deretHasil[i] = deret3[i] + deret4[i];
			if (i == n - 1) {
				System.out.print(deretHasil[i]);
			}else {
				System.out.print(deretHasil[i]+", ");
			}
		}
	}

}
