package day3.warmup;

import java.util.Scanner;

public class SolveMeFirst {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int nilai_a, nilai_b, hasil;

		System.out.print("a : ");
		nilai_a = input.nextInt();

		System.out.print("b : ");
		nilai_b = input.nextInt();
		
		hasil = nilai_a + nilai_b;
		System.out.println(nilai_a + " + "+ nilai_b +" = "+ hasil);

	}

}
