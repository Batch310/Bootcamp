package day5.pagi;

import java.util.Iterator;
import java.util.Scanner;

public class Soal8PrimaFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan panjang deret : ");
		int deret = input.nextInt();
		input.close();
		String prima = "";
		String fibonacci = "";

		int angka = 0, found = 0, fib1 = 0, fib2 = 1;

		for (int i = 1; found < deret; i++) {
			angka = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					angka++;
				}
			}
			if (angka == 2) {
				prima = prima + (i + " ");
				found++;
			}
		}

		found = 0;
		while (found < deret) {
			int fiboNext = 0;
			fibonacci += fib1 + " ";
			fiboNext = fib1 + fib2;
			fib1 = fib2;
			fib2 = fiboNext;
			found++;
		}
		System.out.println(prima + " ");
		System.out.println(fibonacci + " ");
		String[] arrPrima = prima.split(" ");
		String[] arrFibonacci = fibonacci.split(" ");

		for (int i = 0; i < deret; i++) {
			int jumlahPriFibo = Integer.parseInt(arrPrima[i]) + Integer.parseInt(arrFibonacci[i]);
			System.out.print(jumlahPriFibo + ", ");
		}
	}

}
