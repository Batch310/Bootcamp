package day3.latihandim2;

import java.util.Scanner;

public class Latihan9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n : ");
		int n = input.nextInt();

		System.out.print("Masukkan n2 : ");
		int n2 = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int a = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a += 3;
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			a -= 3;
			System.out.print(a + " ");
			
		}
	}
}

