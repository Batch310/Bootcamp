package SimulasiFT1;

import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		int indomie = 2;
		int garam = 100;
		int telur = 3;
		int gula = 50;
				
		System.out.print("Dibutuhkan " +n*indomie+ " bungkus indomie, " +n*garam+ " gr garam, " +n*telur+ " butir telur, dan " +n*gula+ " gr gula pasir.");
	}

}
