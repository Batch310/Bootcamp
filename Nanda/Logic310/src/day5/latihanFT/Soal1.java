package day5.latihanFT;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) { //12345
			if (i%2 != 0) { 
				System.out.print(i+ " "); //1 3 5
			}
		}
		
		System.out.println();
		for (int i = 1; i <= n; i++) { //1
			if (i%2 == 0) {
				System.out.print(i+ " "); //2 4
			}
		}
	}
}