package day2.latihan2;

import java.util.Scanner;

public class Soal01 {

	public static void main(String[] args) {

		// n = 7, n2=3
		// output =

		// cara 1 :

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();
		System.out.print("n2 = ");
		int n2 = inputan.nextInt();

		int nilaiAwal = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.print(nilaiAwal + " ");
			nilaiAwal = nilaiAwal * n2;
		}

		
		
	}
}