package day3.Latihan;

import java.util.Scanner;

public class Latihan1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, n2;
		
		System.out.print("n = ");
		n = input.nextInt();
		
		System.out.print("n2 = ");
		n2 = input.nextInt();
		
		int a=1;
		
		for(int i=0; i<n; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.print(a+ " ");
			a=a*n2;
		}
		
	}
}
