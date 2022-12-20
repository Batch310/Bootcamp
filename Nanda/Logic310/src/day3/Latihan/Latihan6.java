package day3.Latihan;

import java.util.Scanner;

public class Latihan6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+ " ");			
		}
		
		System.out.println();
		
		int a = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(a+ " ");
			a *= n;
		}
		
		System.out.println();
		
		int b = 1;
		
		for (int i = 0; i <= n; i++) {
			System.out.print((b+i)+ " ");
			b *= n;
		}
	}

}
