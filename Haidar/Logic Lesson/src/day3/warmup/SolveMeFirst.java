package day3.warmup;

import java.util.Scanner;

public class SolveMeFirst {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan nilai a: ");
		int a = masukan.nextInt();
		
		System.out.print("Masukkan nilai b: ");
		int b = masukan.nextInt();
		
		int output = a + b;
		System.out.println(output);
	}
}
