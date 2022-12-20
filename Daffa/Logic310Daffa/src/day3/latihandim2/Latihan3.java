package day3.latihandim2;

import java.util.Iterator;
import java.util.Scanner;

public class Latihan3 {

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
		
		int o = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(n2 + " ");
			if (o < n/2) {
				n2 *= 2;
			} else {
				n2 /= 2;
			}
			o++;
		}

	}

}
