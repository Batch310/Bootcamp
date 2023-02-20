package coba;

import java.util.Scanner;

public class NumberLineJumps {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan x1: ");
		int x1 = masukan.nextInt();
		
		System.out.print("Masukkan v1: ");
		int v1 = masukan.nextInt();
		
		System.out.print("Masukkan x2: ");
		int x2 = masukan.nextInt();
		
		System.out.print("Masukkan v2: ");
		int v2 = masukan.nextInt();
		
		int count = 0;
		String yes = "YES";
		String no = "NO";
		
		masukan.close();
		
		if (x1 > x2) {
			while (x1 > x2) {
				x1 += v1;
				x2 += v2;
				if (x1 == x2) {
					count++;					
				}
			}
		} else if (x1 < x2) {
			while (x1 < x2) {
				x1 += v1;
				x2 += v2;
				if (x1 == x2) {
					count++;					
				}
			}
		} else {
			count++;
		}
		
		if (count > 0) {
			System.out.println(yes);
		} else {
			System.out.println(no);
		}
		
	}
}
