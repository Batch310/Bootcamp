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

		while (found < deret) {
			int bagiHabis = 0;

			if (angka == 0 || angka == 1) {
				angka++;
			} else if (angka >= 2) {
				if (angka == 2) {
					prima += angka + " ";
					angka++;
					found++;
				} else {
					for (int i = 2; i < Math.sqrt(angka); i++) {
						if (angka % i == 0) {
							bagiHabis++;
						}
					}
					if (bagiHabis == 0) {
						prima += angka + " ";
						found++;
					}
					angka++;
				}
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
		String[] arrPrima = prima.split(" ");
		String[] arrFibonacci = fibonacci.split(" ");

		for (int i = 0; i < deret; i++) {
			int jumlahPriFibo = Integer.parseInt(arrPrima[i]) + Integer.parseInt(arrFibonacci[i]);
			System.out.print(jumlahPriFibo + ", ");
		}
	}

}
