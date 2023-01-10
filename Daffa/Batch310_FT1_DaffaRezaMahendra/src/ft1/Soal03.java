package ft1;

import java.util.Scanner;

public class Soal03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan x : ");
		int x = scanner.nextInt();
		scanner.close();
		int fibo0 = 0;
		int fibo1 = 1;
		int found = 0;

		while (fibo1 < x) {
			int nextFibo = fibo0 + fibo1;
			fibo0 = fibo1;
			fibo1 = nextFibo;
			if (fibo1 % 2 == 0) {
				found++;
				if (fibo1 < x) {
					System.out.print(fibo1 + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Sebanyak " + (found) + " bilangan genap");
	}

}