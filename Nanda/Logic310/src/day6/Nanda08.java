package day6;

import java.util.Scanner;

public class Nanda08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input panjang deret: "); //5
		int n = input.nextInt();

		int[] prima = new int[n]; //panjang array prima = 5 {2, 3, 5, 7, 11}
		int[] fibonacci = new int[n]; // panjang array fibo =5 {0, 0, 0, 0, 0}
		int bilprima = 0;
		int current = 0; // menghitung banyak bilangan prima yang sudah ketemu

		for (int i = 1; current < n; i++) { // i = 5, current = 2, n =5
			bilprima = 0; // 3
			for (int j = 1; j <= i; j++) { // j = 5
				if (i % j == 0) {
					bilprima++;
				}
			}
			if (bilprima == 2) {
				prima[current] = i;
				current++;
			}
		}
		System.out.print("Bilangan Prima : ");
		for (int i = 0; i < prima.length; i++) { // i =5, prima.length = 5
			System.out.print(prima[i] + " "); // 2 3 5 7 11
		}

		System.out.println();

		int fibo0 = 0; //1, 1, 2, 3, 5
		int fibo1 = 1; //1, 2, 3, 5, 8
		fibonacci[0] = fibo0;
		fibonacci[1] = fibo1;
		
		//int[] fibonacci = new int[n]; // panjang array fibo =5 {0, 1, 0, 0, 0}

		System.out.print("Bilangan Fibonacci : ");
		for (int i = 2; i < n; i++) { // i = 0, n = 5 
			fibonacci[i] = fibo0 + fibo1; 
			fibo0 = fibo1;
			fibo1 = fibonacci[i]; 
		}
		
		
		for (int i = 0; i < fibonacci.length; i++) {
			System.out.print(fibonacci[i] + " "); // 1 2 3 5 8
		}

		System.out.println();

		//int[] prima = new int[n]; //panjang array prima = 5 {2, 3, 5, 7, 11}
		//int[] fibonacci = new int[n]; // panjang array fibo =5 {1, 2, 3, 5, 8}
		
		
		System.out.print("Total : ");
		int[] total = new int[n]; // panjangnya = 5 {3, 5, 8, 12, 19}
		for (int i = 0; i < n; i++) { // i = 5, n = 5
			total[i] = prima[i] + fibonacci[i];
			if (i == (n-1) ) {
			System.out.print(total[i] + " "); // 3 5 8 12 19
			}else {
				System.out.print(total[i] + ", ");
			}
		}

	}

	// Program penjumlahan data index 1 dan data index 2
}	// index ganjil+ganjil, index genap-genap, 0 masuk genap, selisih tidak boleh minusssssssssss
