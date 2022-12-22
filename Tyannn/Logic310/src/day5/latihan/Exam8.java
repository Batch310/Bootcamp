package day5.latihan;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 5;
		
		String[] arrA = new String[n];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = i*2;
			System.out.print(sum+" ");
			for (int j = 0; j < i; j++) {
				if(i%j==0) {
					sum++;
					System.out.println(sum);
				}
			}
		}
		
	}

}
