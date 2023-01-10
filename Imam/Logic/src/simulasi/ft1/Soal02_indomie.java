package simulasi.ft1;

import java.util.Scanner;

public class Soal02_indomie {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int n = scanner.nextInt();

		int indomie = 2;
		int garam = 100;
		int telur = 3;
		int gula = 50;

			indomie = n * indomie;
			garam = n * garam;
			telur = n * telur;
			gula = n * gula;
		
		System.out.println("Dibutuhkan "+indomie+" bungkus indomie, "+garam+" gr garam,"+telur+" butir telur, dan "+gula+" gr gula pasir.");

	}

}
