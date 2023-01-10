package FT1;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input panjang deret : ");
		int n = scanner.nextInt();
		
		//deret baru dari output sebelumnya
		//outputnya = kelipatan 4 habis dibagi 3
		
		
		int k3 = 2;
		int[] deret3 = new int[n];
		deret3[0] = k3;
		
		System.out.print("Deret 3 : ");
		for (int i = 1; i < deret3.length; i++) {
			deret3[i] = k3 + 3;
			k3 = deret3[i];
		}
		for (int i = 0; i < deret3.length; i++) {
			System.out.print(deret3[i] + " ");
		}
		System.out.println();
		
		int k4 = 2;
		int[] deret4 = new int[n];
		deret4[0] = k4;
		
		System.out.print("Deret 4 : ");
		for (int i = 1; i < deret4.length; i++) {
			deret4[i] = k4 + 2;
			k4 = deret4[i];
		}
		for (int i = 0; i < deret4.length; i++) {
			System.out.print(deret4[i] + " ");
		}
		System.out.println();
		System.out.print("Total : ");
		int[] total = new int[n];
		for (int i = 0; i < total.length; i++) {
			total[i] = deret3[i] + deret4[i];
			System.out.print(total[i] + " ");
		}
		
		System.out.println();
		System.out.print("Kelipatan 4 Habis dibagi 3 : ");
		int[] Kel4 = new int[n];
		for (int i = 0; i < Kel4.length; i++) {
			if(total[i] % 4 == 0 && total[i] %3 == 0) {
				System.out.print(total[i] + " ");
			}
		}
	}

}
