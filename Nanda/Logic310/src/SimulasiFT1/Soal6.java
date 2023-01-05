package SimulasiFT1;

import java.util.Scanner;

public class Soal6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("x = ");
		int x = input.nextInt();
		
		int[] tribonacci = new int[x];

		int tribo0 = 0;
		int tribo1 = 0;
		int tribo2 = 1;
		tribonacci[0] = tribo0;
		tribonacci[1] = tribo1;
		tribonacci[2] = tribo2;
		int bilganjil = 0;

		System.out.print("Bilangan tribonacci : ");
		for (int i = 3; i < x; i++) { // i = 0, n = 5
			tribonacci[i] = tribo0 + tribo1 + tribo2;
			tribo0 = tribo1;
			tribo1 = tribo2;
			tribo2 = tribonacci[i];
		}

		for (int i = 0; i < (tribonacci.length-1); i++) {
			System.out.print(tribonacci[i] + " "); // 1 2 3 5 8
		}

		System.out.println();
		
		for (int i = 0; i < (x-1); i++) {
			if(tribonacci[i]%2 != 0) {
				bilganjil++;
			}
		}
		System.out.println("Sebanyak " +bilganjil+ " bilangan ganjil");
	}
}