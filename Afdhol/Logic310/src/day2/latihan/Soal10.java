package day2.latihan;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int angka = 9;

		int awal = 1;

		for (int i = 0; i < angka; i++) {

			// menentukan nilai tengah = panjang dibagi 2

			awal *= 3;

			if (i == angka / 2) {
				System.out.print("xxx ");

			} else {
				System.out.print(awal + " ");

			}

		}
	}

}
