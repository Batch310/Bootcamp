package day2.latihan2;

import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n  : ");
		int n = input.nextInt();
		int x = n, y=2*n;
		for(int i = 0; i<n; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 0; i<n; i++) {
			System.out.print(x + "\t");
			x++;
		}
		System.out.println();
		for(int i = 0; i<n; i++) {
			System.out.print(y + "\t");
			y++;
		}

	}

}
