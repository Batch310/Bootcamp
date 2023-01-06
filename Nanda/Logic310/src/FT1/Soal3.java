package FT1;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input X = ");
		int x = scanner.nextInt();
		
		int[] fibonacci = new int[x];
		int fibo0 = 0;
		int fibo1 = 1;
		
		fibonacci[0] = fibo0;
		fibonacci[1] = fibo1;
		
		for (int i = 2; i < x; i++) {
			fibonacci[i] = fibo0+fibo1;
			fibo0 = fibo1;
			fibo1 = fibonacci[i];
		}
		
		int hasil = 0;
		for (int i = 0; i < x; i++) {
			if(fibonacci[i] > 0 && fibonacci[i] % 2 == 0) {
				hasil++;
			}
		}
		System.out.println("Sebanyak " +hasil+ " bilangan genap" );
	}

}
