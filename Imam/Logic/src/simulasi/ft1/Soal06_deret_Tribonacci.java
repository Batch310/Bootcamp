package simulasi.ft1;

import java.util.Scanner;

public class Soal06_deret_Tribonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan x : ");
		int x = scanner.nextInt();

		int a = 0;
		int b = 0;
		int c = 1;

		int bilSaatIni = 1;
		int countGanjil = 0;
		while (bilSaatIni < x) {
			if (bilSaatIni % 2 != 0) {
				countGanjil++;
			}

			bilSaatIni = a + b + c;
			a = b;
			b = c;
			c = bilSaatIni;
		}
		
		System.out.println("Sebanyak " + countGanjil + " bilangan ganjil");

	}

}
