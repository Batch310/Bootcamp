package filteringtest1;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input X : ");
		int x = input.nextInt();

		int fibo0 = 0;
		int fibo1 = 1;

		int bilangan = 1; // var awal
		int countBilanganGenap = 0;

		while (bilangan < x) {
			if (bilangan % 2 == 0) {
				countBilanganGenap++;
			}
			bilangan = fibo0 + fibo1;
			fibo0 = fibo1;
			fibo1 = bilangan;
		}

		System.out.println("Sebanyak " + countBilanganGenap);
	}

}
