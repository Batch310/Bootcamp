package day5.latihan;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input n : ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 2; i <= n; i=i+2) {
			System.out.print(i + " ");	
		}
	}

}
