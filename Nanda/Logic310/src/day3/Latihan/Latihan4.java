package day3.Latihan;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, n2;
		System.out.print("n = ");
		n = input.nextInt();
		
		System.out.print("n2 = ");
		n2 = input.nextInt();
		
		int a=0;
		int b;
		
		for(int i=0; i<n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				a++;
				System.out.print(a+" ");				
			}else {
				b=a*n2;
				System.out.print(b+" ");
			}
		}
	}

}