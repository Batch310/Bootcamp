package day2.latihan2;

import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int n = input.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = i * n; j < (i + 1) * n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
