package day2.latihan;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		
		//0,1, 2,3, 4,  5,  6,       7,    8,9,10,11
		//3,9,27,xxx,243,729,2187,      33, 44 

		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int a = inputan.nextInt();

		int nilaiAwal = 3;

		for (int i = 0; i < a; i++) {
			if (i == a / 2) {
				System.out.print("XXX ");
			} else {
				System.out.print(nilaiAwal + " ");
			}
			nilaiAwal *= 3;

		}

	}

}
