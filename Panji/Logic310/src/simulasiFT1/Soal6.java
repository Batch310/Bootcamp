package simulasiFT1;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("x : ");
		int x = input.nextInt();

		int[] bilFibo = new int[100];
		bilFibo[0] = 0;
		bilFibo[1] = 0;
		bilFibo[2] = 1;

		int count = 0;
		for (int i = 3; i <= x; i++) {
			bilFibo[i] = bilFibo[i - 1] + bilFibo[i - 2] + bilFibo[i - 3];
			if (bilFibo[i] % 2 != 0) {
				count = count + 1;
			}
		}
		System.out.print("Sebanyak " + count + " bilangan ganjil");
	}

}
