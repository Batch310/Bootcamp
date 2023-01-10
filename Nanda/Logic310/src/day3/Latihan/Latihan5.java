package day3.Latihan;

import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+ " "); //01234
		}
		
		System.out.println();
		
		int a=n-1; //4
		for (int i = 0; i < n; i++) { //01234
			a++; //5,6,7,8,9
			System.out.print(a+ " "); //5,6,7,8,9
		}
		
		System.out.println();
		
		int b=a; //9
		for (int i = 0; i < n; i++) { //01234
			b++; //10
			System.out.print(b+ " "); //10,11,12,13,14
		}
	
	}

}
