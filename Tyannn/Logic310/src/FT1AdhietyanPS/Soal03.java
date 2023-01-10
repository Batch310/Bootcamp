package FT1AdhietyanPS;

import java.util.Scanner;

public class Soal03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input x = ");
		int x = input.nextInt();

		int fibo0 = 0;
		int fibo1 = 1;

		int tampung = 0;
		int countGenap = 0;
		for (int i = 1; i < x; i++) {
			if (tampung !=0 && tampung % 2 == 0 && tampung % 3 == 0) {
				countGenap++;
			}
			
			tampung = fibo0 + fibo1;
			fibo0 = fibo1;
			fibo1 = tampung;
			
		}
		
		
		System.out.print("Sebanyak "+countGenap+" Bilangan Genap");

	}

}
