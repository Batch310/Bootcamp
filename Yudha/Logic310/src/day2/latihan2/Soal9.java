package day2.latihan2;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n  : ");
		int n = input.nextInt();
		int x=0;
		for(int i = 0; i<n; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 0; i<n; i++) {
			System.out.print(x + "\t");
			x=x+3;
		}
		System.out.println();
		for(int i = 0; i<n; i++) {
			x=x-3;
			System.out.print(x + "\t");	
		}

	}

}
