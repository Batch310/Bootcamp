package simulasi.ft1;

import java.util.Scanner;

public class Soal06_deret_Tribonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan x : ");
		int x = scanner.nextInt();

		int a = 0;
		int b = 1;
		int c = 1;

		int bilSaatIni = 1;
		int countGenap = 0;
		while (bilSaatIni < x) {
			if (bilSaatIni % 2 == 0) {
				countGenap++;
			}

			bilSaatIni = a + b;
			a = b;
			b = c;
			c = bilSaatIni;
		}
		
		System.out.println("Sebanyak " + countGenap + " bilangan gaenap");

	}

}
