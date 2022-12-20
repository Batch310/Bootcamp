package day3.latihan;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("n: ");
		int n= input.nextInt();
		
		System.out.println("n2: ");
		int n2= input.nextInt();
		
		int nilaiAwal = 3;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			if (i <n/2) {
				System.out.print(nilaiAwal+" ");
				nilaiAwal *= 2;
			} else {
				
				System.out.print(nilaiAwal + " ");
				nilaiAwal/=2;

			}

		}

	}

}
