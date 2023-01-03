package SimulasiFT1;

import java.util.Scanner;

public class Soal06TribonacciGanjil {
	public static void main(String[] args) {
		//angka ganjil pada tribonacci dibawah x
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan x : ");
		int x = masukan.nextInt();
		
		int fibo0 = 0;
		int fibo1 = 0;
		int fibo2 = 1;
		int found = 0;
				
		while(fibo2 < x) {
			if (fibo2%2 != 0) {
				found++;
			}
			int nextFibo = fibo0 + fibo1 + fibo2;
			fibo0 = fibo1;
			fibo1 = fibo2;
			fibo2 = nextFibo;
		}
		System.out.println("Sebanyak " + found + " bilangan ganjil");
		masukan.close();
	}
}
