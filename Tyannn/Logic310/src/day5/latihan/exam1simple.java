package day5.latihan;

import java.util.Scanner;

public class exam1simple {

	public static void main(String[] args) {
		//input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input n : ");
		int n = input.nextInt();
		
		// perulangan ganjil
		for(int i = 1; i<=n ; i = i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		// perulangan genap
		for(int i=2; i<=n; i+=2) {
			System.out.print(i+" ");
		}
	}

}
