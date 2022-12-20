package day3.Latihan;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		int a;
		for (int i = 0; i < n; i++) {
			a = i*2;
			System.out.print(a+ " ");
		}
		
		System.out.println();
		
		int b;
		for (int i = 0; i < n; i++) {
			b = i*3;
			System.out.print(b+ " ");
		}
	}

}
