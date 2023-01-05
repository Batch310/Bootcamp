package catatan.untuk.FT1;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan n = ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) { // 1
			for (int j = 0; j < n; j++) { // 01234
				if (i + j >= n - 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // " "" "" "" "#
		}
	}
}