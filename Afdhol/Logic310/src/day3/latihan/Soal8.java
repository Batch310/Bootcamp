package day3.latihan;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("n: ");
		int n= input.nextInt();
		
		int baris2=0;
		int baris3=0;
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.print(baris2+" ");
			baris2+=2;
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(baris3+" ");
			baris3+=3;
		}
	}

}
