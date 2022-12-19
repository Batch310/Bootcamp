package day2.latihan2;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();
		System.out.print("n2 : ");
		int n2 = input.nextInt();
		
		
		System.out.print("i : ");
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("O : ");
		int a = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a = a * n2;
		}

	}

}
