package catatan.untuk.FT1;

import java.util.Scanner;

public class SensorDeret {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, awal = 0;

		System.out.print("n = ");
		n = input.nextInt();

		for (int i = 0; i < n; i++) {
			if (awal <= n / 2) {
				System.out.print("XXX ");
			} else {
				System.out.print(awal + " ");
			}
			awal = awal * 3;
		}
	}

}
