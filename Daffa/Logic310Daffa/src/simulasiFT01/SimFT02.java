package simulasiFT01;

import java.util.Scanner;

public class SimFT02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan porsi : ");
		int porsi = scanner.nextInt();
		scanner.close();

		int indomie = 2, garam = 100, telur = 3, gula = 50;

		if (porsi > 0) {
			System.out.println("Dibutuhkan " + porsi * indomie + " bungkus Indomie, " + porsi * garam + " gr garam, "
					+ porsi * telur + " butir telur, dan " + porsi * gula + " gr gula pasir.");
		} else {
			System.out.println("Input tidak dikenal");
		}
	}

}
