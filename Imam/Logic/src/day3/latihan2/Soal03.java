package day3.latihan2;

import java.util.Scanner;

public class Soal03 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();
		System.out.print("n2 = ");
		int n2 = inputan.nextInt();

	

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		
		int nilaiAwal = 3;
		for (int i = 0; i < n; i++) {

			if (i>n/2) {
				
				System.out.print((nilaiAwal/=4)+ " ");

			} else {
				System.out.print(nilaiAwal + " ");
			}
			nilaiAwal = nilaiAwal * 2;
		}

	}

}
