package materiku.soal;

import java.util.Scanner;

public class Soal04_deretKombinasi {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int n = inputan.nextInt();
		System.out.print("n2 = ");
		int n2 = inputan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int x = 1;

		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				System.out.print(x + " ");
				x++;
			} else {
				System.out.print(n2 + " ");
				n2 *= 2;
			}
		}
	}
}
