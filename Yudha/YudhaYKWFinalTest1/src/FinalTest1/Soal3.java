package FinalTest1;

import java.util.Scanner;

public class Soal3 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan x : ");
		int x = scanner.nextInt();

		int a = 0;
		int b = 1;
		

		int bilSaatIni = 0;
		int countGenap = 0;
		while (bilSaatIni < x) {
			if (bilSaatIni != 0 & bilSaatIni % 2 == 0) {
				countGenap++;
			}
			bilSaatIni = a + b;
			a = b;
			b = bilSaatIni;
			
		}
		System.out.println("Sebanyak "+countGenap);
	}

}
