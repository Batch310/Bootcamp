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
		
		for (int i = 0; i < n; i++) { //0,1,2,3,4
			System.out.print(a+ " "); //1,5,25,125,625
			a *= n; //5,25,125,625
		}
		
		System.out.println();
		
		int b = 1;
		
		for (int i = 0; i < n; i++) { //0, 1, 2, 3, 4
			System.out.print((b+i)+ " "); //1, 6, 27, 128, 629 
			b *= n; //5, 25, 125, 625
		}
	}

}
