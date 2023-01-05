package simulasiFT01;

import java.util.Scanner;

public class SimFT01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan input : ");
		int input = scanner.nextInt();
		scanner.close();
		int a6 = 1, a5 = 2 * a6, a4 = 2 * a5, a3 = 2 * a4, a2 = 2 * a3, a1 = 2 * a2;

		if (input == 1) {
			System.out.println("Dibutuhkan sebanyak " + a1 + " lembar A6 untuk membentuk A" + input);
		} else if (input == 2) {
			System.out.println("Dibutuhkan sebanyak " + a2 + " lembar A6 untuk membentuk A" + input);
		} else if (input == 3) {
			System.out.println("Dibutuhkan sebanyak " + a3 + " lembar A6 untuk membentuk A" + input);
		} else if (input == 4) {
			System.out.println("Dibutuhkan sebanyak " + a4 + " lembar A6 untuk membentuk A" + input);
		} else if (input == 5) {
			System.out.println("Dibutuhkan sebanyak " + a5 + " lembar A6 untuk membentuk A" + input);
		} else {
			System.out.println("Input harus lebih dari 0 dan kurang dari 6");
		}
	} 
}
