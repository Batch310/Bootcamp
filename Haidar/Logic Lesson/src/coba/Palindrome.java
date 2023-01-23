package coba;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan kata atau kalimat: ");
		
		String[] arrInput = masukan.nextLine().split("");
		
		masukan.close();
		
		boolean result = false;
		
		String hasil1 = "";
		
		String hasil2 = "";
		
		for (int i = 0; i < arrInput.length; i++) {
			hasil1 += arrInput[i];
		}
		System.out.println("Kata atau kalimat dari depan: " + hasil1);
		System.out.println();
		
		for (int i = arrInput.length-1; i >= 0; i--) {
			hasil2 += arrInput[i];
		}
		System.out.println("Kata atau kalimat dari belakang: " + hasil2);
		
		if (hasil1.equalsIgnoreCase(hasil2)) {
			result = true;
			System.out.println(result);
		} else {
			System.out.println(result);
		}
	}
	
}
