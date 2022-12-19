package day2.latihan;

import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, awal=1;
		
		System.out.print("n = ");
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(awal+ " ");
			awal=awal+4;
			
			int[] sensor = input.nextInt();
			sensor[2] = "*";
			sensor[5] = "*";
		}
	}

}
