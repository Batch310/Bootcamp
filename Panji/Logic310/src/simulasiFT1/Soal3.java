package simulasiFT1;

import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n : ");
		int data = input.nextInt();
		int a = 5;
		int b = 8;
		int[] arr1 = new int[data];
		int[] arr2 = new int[data];

		int count = 0;
		for (int i = 1; i <= data; i++) {
			a = i * 5;
			arr1[i] = a;
			b = i * 8;
			arr2[i] = b;
			if (arr1[i] == arr2[i]) {
				count = arr2[i];
			} else {

			}
			System.out.println(count + " ");
		}
	}
}
