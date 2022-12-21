package day3.warmup;

import java.util.Scanner;

public class WarmUp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n : ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - 1 - i) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
