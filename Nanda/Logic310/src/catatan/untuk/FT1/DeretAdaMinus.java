package catatan.untuk.FT1;

import java.util.Scanner;

public class DeretAdaMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, n2;

		System.out.print("n = ");
		n = input.nextInt();

		System.out.print("n2 = ");
		n2 = input.nextInt();

		int a = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			if (i % 3 == 2) {
				System.out.print("-" + a + " ");
				a *= 3;
			} else {
				System.out.print(a + " ");
				a *= n2;
			}
		}
	}

}
