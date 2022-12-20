package day2.latihan;

import java.util.Scanner;

public class Latihan6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, awal=1;
		
		System.out.print("n = ");
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%3==0) {
				System.out.print("* ");
				awal+=4;
			}else {
			System.out.print(awal+ " ");
			awal+=4;
			}
		}
	}

}
