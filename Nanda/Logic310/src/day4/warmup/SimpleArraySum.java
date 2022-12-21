package day4.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = 0, b = 0, n;
		
		System.out.print("");
		n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("");
			a = input.nextInt();
			b = b+a;
		}
		System.out.print(b);
	}
	
}
