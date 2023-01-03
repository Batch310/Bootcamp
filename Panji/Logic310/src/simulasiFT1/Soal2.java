package simulasiFT1;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n : ");
		int data = input.nextInt();

		int indomie = 2 * data;
		int garam = 100 * data;
		int telur = 3 * data;
		int gula = 50 * data;
		
		System.out.println("Dibutuhkan "+indomie+" bungkus indomie goreng, "+garam+" gr garam, "+telur+" butir telur, dan "+gula+" gr gula pasir" );
	
	}

}
