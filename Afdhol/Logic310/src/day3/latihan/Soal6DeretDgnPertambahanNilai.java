package day3.latihan;

import java.util.Scanner;

public class Soal6DeretDgnPertambahanNilai {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("n: ");
		int n= input.nextInt();
		

		int a = 1, b = 1 ;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a *= n;
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print((b+i) + " ");
			b = b * n;
		}


	}

}
