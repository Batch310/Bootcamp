package catatan.untuk.FT1;

import java.util.Scanner;

public class DeretGanjilGenap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, awal = 2;

		System.out.print("n = ");
		n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(awal + " ");
			awal = awal + 2;
		}
	}

}
