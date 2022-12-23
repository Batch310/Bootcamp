package day4.strings;

import java.util.Scanner;

public class SeparateTheNumbers {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya input: ");
		int input = masukan.nextInt();
		
		for (int i = 0; i < input; i++) {
			System.out.print("Masukkan angka ke-" + (i+1) + ": ");
			String angka = masukan.next();
			
//			System.out.println(angka.indexOf(angka[i ]>="11", 1));
			
		}
		
		
		
		
		
	}
}
