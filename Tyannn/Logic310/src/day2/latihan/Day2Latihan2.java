package day2.latihan;

import java.util.Scanner;

public class Day2Latihan2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = input.nextInt();
		
		int awal = 2;
		
		for(int i = 0; i<n; i++) {
			System.out.print(awal + " ");
			awal = awal + 2;
		}
		
	}

}
