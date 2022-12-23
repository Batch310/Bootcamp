package day5.latihan;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input n : ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			if(i%2!=0) {
				System.out.print(i);
			}
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				System.out.print(i);
			}
		}
	}

}
