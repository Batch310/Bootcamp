package day3.Latihan;

import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) { //01234
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		int a; 
		for (int i = 0; i < n; i++) { //01234
			a = i*2; //0,2,4,6,8
			System.out.print(a+ " "); //0,2,4,6,8
		}
		
		System.out.println();
		
		int b;
		for (int i = 0; i < n; i++) { //01234
			b = i*3; //0,3,6,9,12
			System.out.print(b+ " ");
		}
	}

}
