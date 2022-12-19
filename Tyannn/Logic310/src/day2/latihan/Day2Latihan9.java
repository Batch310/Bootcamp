package day2.latihan;

import java.util.Scanner;

public class Day2Latihan9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n = ");
		int n = input.nextInt();

		int awal = 4;
		for (int i = 0; i < n; i++) {
			
			if(i%2 == 2) {
				System.out.print("* ");
			}else if(i%3 == 2){
				System.out.print("* ");
			}else {
				System.out.print(awal+ " ");
				awal *= 4;
			}
			
		}

	}

}
