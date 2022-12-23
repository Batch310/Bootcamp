package day5.latihan;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = 3;

		String angka = "100";

		String[] arrAngka = angka.split("");

		int a = Integer.parseInt(angka);
		
		//String[] aSplit = angka.split("");
		
		for (int i = 0; i < n; i++) {
			System.out.println(i);
			for (int j = 0; j < n; j++) {
				if(a == 0) {
					System.out.println(a);
				}
			}
		}
		System.out.println(a);
	}

}
