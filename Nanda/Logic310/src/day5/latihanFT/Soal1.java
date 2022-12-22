package day5.latihanFT;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i%2 != 0) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if (i%2 == 0) {
				System.out.print(i+ " ");
			}
		}

	}

}