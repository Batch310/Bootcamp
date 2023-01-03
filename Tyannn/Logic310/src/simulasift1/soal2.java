package simulasift1;

import java.util.Scanner;

public class soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1 indomie super = 2 bungkus indomie, 100gr garam, 3 butir telur, 50gr gula pasir 
		System.out.print(" n : ");
		int n= input.nextInt();
		
		int mie = 2 * n;
		int garam = 100 * n;
		int telur = 3 * n;
		int gula = 50 * n;
		
		System.out.println("Dibutuhkan "+mie+" bungkus indomie "+garam+" garam, "+telur+ " butir telur, dan  "+gula+" gr gula pasir.");
				
	}

}
