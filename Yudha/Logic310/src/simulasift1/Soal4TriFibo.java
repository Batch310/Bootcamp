package simulasift1;

import java.util.Scanner;

public class Soal4TriFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println(bilSaatIni);
			bilSaatIni = a + b + c;
			a = b;
			b = c;
			c = bilSaatIni;
		}
		
		System.out.println("Sebanyak " + countGanjil + " bilangan ganjil");
	}

}
