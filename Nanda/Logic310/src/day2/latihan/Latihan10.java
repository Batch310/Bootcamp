package day2.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, awal=0;
		
		System.out.print("n = ");
		n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			if(awal<=n/2) {
				System.out.print("XXX ");
			}else {
			System.out.print(awal+ " ");
		}
			awal=awal*3;
		}
	}
		
}
