package simulasi.ft1;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int input = scan.nextInt();
		
		int indomie = 2;
		int garam = 100;
		int telur = 3;
		int gula = 50;
		
		
		int jmlIndomie = indomie * input;
		int jmlGaram = garam * input;
		int jmlTelur = telur *input;
		int jmlGula = gula *input;
		
		System.out.println("Dibutuhkan "+jmlIndomie+" bungkus "+jmlGaram+" gr Garam, "+jmlTelur+" butir telur, "+" dan "+jmlGula+" gr gula pasir");
		
	}
	
}
