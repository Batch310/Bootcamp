package catatan.untuk.FT1;

import java.util.Scanner;

public class MenggantiOutputDenganLambang {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, awal = 1;

		System.out.print("n = ");
		n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			// i:
			// ,1,2,3,4,5,6,7
			// ,1,2,*,4,5,*,7
			if (i % 3 == 0) {
				System.out.print("* ");
			} else {
				System.out.print(awal + " ");
				awal += 4;
			}
		}
	}

}
