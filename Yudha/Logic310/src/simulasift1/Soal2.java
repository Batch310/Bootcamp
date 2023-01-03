package simulasift1;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int mie = 2*n;
		int garam = 100*n;
		int telur = 3*n;
		int gula = 50*n;
		System.out.println("Dibutuhkan " + mie + " bungkus Indomie, " + garam + " gr garam, " + telur + " butir telur, dan " + gula + " gr gula pasir.");
		
	}

}
