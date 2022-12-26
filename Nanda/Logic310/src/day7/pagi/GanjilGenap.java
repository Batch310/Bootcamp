package day7.pagi;

import java.util.Scanner;

public class GanjilGenap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.print("n = ");
		int n = input.nextInt();
		
		//perulangan ganjil
		// variabel i cetak angka ganjil
		for (int i = 1; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//perulangan genap
		// variabel i cetak angka genap
		for (int i = 2; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}
	}

}
