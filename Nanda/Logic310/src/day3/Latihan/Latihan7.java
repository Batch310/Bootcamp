package day3.Latihan;

import java.util.Iterator;
import java.util.Scanner;

public class Latihan7 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" n = ");
	int n = input.nextInt();
	
	for (int i = 0; i < n; i++) {
		System.out.print(i+ " ");
	}
	
	System.out.println();
	
	int a = n-1;
	for (int i = 0; i < n; i++) {
		a++;
		System.out.print(a+ " ");
	}
	
	System.out.println();
	
	int b = a;
	for (int i = 0; i < n; i++) {
		b++;
		System.out.print(b+ " ");
	}
	}
}
