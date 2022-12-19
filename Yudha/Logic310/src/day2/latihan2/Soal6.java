package day2.latihan2;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n  : ");
		int n = input.nextInt();
		int x = 1, y=1,z=1;
		for(int i = 0; i<n; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 1; i<=n; i++) {
			System.out.print(x + "\t");
			x = x*n;
		}
		System.out.println();
		for(int i = 1; i<=n; i++) {
			System.out.print(z + "\t");
			y = y*n;
			z = y+i;
		}

	}

}
