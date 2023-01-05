package simulasift1;

import java.util.Scanner;

public class Soal06TribonaciGanjil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input x : ");
		int n = input.nextInt();

		int fibo0 = 0; //2
		int fibo1 = 0; //4
		int fibo2 = 1; //2

		int tampung = 1; //4
		int countGanjil = 0; //2
		for (int i = 1; i < n; i++) { //4
			if (tampung % 2 != 0) {
				countGanjil++;
			}
			tampung = fibo0 + fibo1 + fibo2;
			fibo0 = fibo1;
			fibo1 = tampung;

		}
		System.out.println("Sebanyak " + countGanjil + " bilangan ganjil");

	}

}
