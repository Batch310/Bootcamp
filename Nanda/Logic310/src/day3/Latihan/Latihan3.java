package day3.Latihan;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, n2;
		
		System.out.print("n = ");
		n = input.nextInt();
		
		System.out.print("n2 = ");
		n2 = input.nextInt();
		
		int a=3;
		
		for(int i=0; i<n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			if(i==n/2) {
				System.out.print(a+" ");
				a/=2;
			}else {
			System.out.print(a+" ");
			a*=2;
		}
	}
	}
}
