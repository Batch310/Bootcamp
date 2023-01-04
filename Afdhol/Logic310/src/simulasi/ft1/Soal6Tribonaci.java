package simulasi.ft1;

import java.util.Scanner;

public class Soal6Tribonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// diket tribonacci 0,0,1,1,2,4,7
		// input = 5 output sebanyak 2 bilangan ganjil

		Scanner scan = new Scanner(System.in);
		System.out.println("x : ");
		int n = scan.nextInt();

		int a = 0;
		int b = 0;
		int c = 1;

		int bilSaatIni = 1;
		int countGanjil = 0;
		while (bilSaatIni < n) {
			if (bilSaatIni % 2 != 0) {
				countGanjil++;
			}

			bilSaatIni = a + b + c;
			a = b;
			b = c;
			c = bilSaatIni;
		}
		System.out.println("Sebanyak "+countGanjil+" bilangan ganjil");
	}

}
