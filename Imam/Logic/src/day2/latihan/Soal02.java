package day2.latihan;

import java.util.Scanner;

public class Soal02 {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int a = inputan.nextInt();

		int nilaiAwal = 2;

		for (int i = 0; i < a; i++) {
			System.out.print(nilaiAwal + " ");
			nilaiAwal = nilaiAwal + 2;
		}

	}

}
