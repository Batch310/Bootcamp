package day3.latihandim2;

import java.util.Scanner;

public class Latihan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n  : ");
		int n = input.nextInt();
		System.out.print("Masukkan n2 : ");
		int n2 = input.nextInt();
		System.out.print("i : ");
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n0 : ");
		for (int o = 1; n > 0; n--) {
			System.out.print(o + " ");
			o = o * n2;
		}

	}

}
