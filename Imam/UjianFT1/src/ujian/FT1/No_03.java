package ujian.FT1;

import java.util.Scanner;

public class No_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan x : ");
		int x = scanner.nextInt();

		int a = 0;
		int b = 1;

		int bilSaatIni = 1;
		int countGenap = 0;
		while (bilSaatIni < x) {
			if (bilSaatIni % 2 == 0) {
				if (bilSaatIni != 0) {
					countGenap++;
				}
			}

			bilSaatIni = a + b;
			a = b;
			b = bilSaatIni;

		}

		System.out.println("Sebanyak " + countGenap + " bilangan genap");

	}

}
