package day2.latihan2d;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.print("n2 = ");
		int n2 = input.nextInt();

		
		int awal = 1;
		
		System.out.print("i: ");
		for (int i= 0; i<n; i++) {
			System.out.print( i+ " ");
		}
		
		System.out.println();
		System.out.print("O: ");
		for (int j=0; j<n;j++) {
			System.out.print(awal+ " ");
			awal *= n2;
		}

	}

}
